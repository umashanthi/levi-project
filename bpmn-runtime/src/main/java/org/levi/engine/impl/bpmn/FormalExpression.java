package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;

import java.util.Map;

/**
 * @author Ishan Jayawardena.
 */
public class FormalExpression {
    public static final String DEFAULT_EXPRESSION_LANGUAGE = "javascript";
    private String originalString;
    private String modifiedString;
    private Map<String, Object> items = LeviUtils.newHashMap();

    public FormalExpression(String formalExpression) {
        originalString = formalExpression.trim();
        modifiedString = formalExpression.trim();
        makeList();
        if (originalString == null) {
            throw new NullPointerException("Formal expression is null.");
        }
        if (originalString.length() <= 3) {
            throw new RuntimeException("Formal expression is empty.");
        }
    }

    public Map<String, Object> evaluate(ProcessInstance processInstance) {
        ScriptEngines scriptEngines = ScriptEngines.getInstance();
        Object result;
        for (String key : items.keySet()) {
            System.out.println("Evaluating " + key);
            result = scriptEngines.evaluate(
                    (String)items.get(key),
                    DEFAULT_EXPRESSION_LANGUAGE,
                    processInstance);
            if (result == null) {
                throw new LeviException("Formal expression evaluation returns null.");
            }
            items.put(key, result);
        }
        return items;
    }

    public String evaluateString(ProcessInstance processInstance) {
        evaluate(processInstance);
        for (String key : items.keySet()) {
            modifiedString = modifiedString.replace(key.subSequence(0, key.length()),
                    items.get(key).toString().subSequence(0, items.get(key).toString().length()));
            
        }
        return modifiedString;
    }

    private void makeList() {
        for (int i = 0; i < originalString.length(); ++i) {
            int start;
            int end;
            char ch = originalString.charAt(i);
            if (ch == '$') {
                start = i;
                ++i;
                if (originalString.charAt(i) == '{') {
                    int count = 1;
                    while (count != 0 && i < originalString.length()) {
                        ++i;
                        if (originalString.charAt(i) == '{') {
                            ++count;    
                        } else if (originalString.charAt(i) == '}') {
                            --count;
                        }
                    }
                    if (count != 0) {
                        throw new RuntimeException("Invalid expression: " + originalString);
                    }
                    end = i;
                    String item = originalString.substring(start, end+1);
                    store(item);
                    start = end = 0;
                }
            }
        }
    }

    private void store(String item) {
        if (item.charAt(0) == '$'
                && item.charAt(1) == '{'
                && item.charAt(item.length() - 1) == '}') {
            String v = item.substring(2, item.length() - 1);
            items.put(item, v);
            //System.out.println("Stored: " + item);
        } else {
            throw new RuntimeException("Malformed item: " + item);
        }    
    }

    public static void main(String[] args) {
        FormalExpression fe = new FormalExpression("<html><body>Hello ${male ? 'Mr.' : 'Mrs.' } ${recipientName},<br/><br/>As of ${now}, your order has been <b>processed and shipped</b>.<br/><br/>Kind regards,<br/>TheCompany.</body></html>");
    }
}
