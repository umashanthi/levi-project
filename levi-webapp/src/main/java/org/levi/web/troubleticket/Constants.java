package org.levi.web.troubleticket;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/1/11
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Constants {
    private Constants() {

    }

    public static final String definitionID = "TroubleTicket";
    public static final String APPID_TT = "TroubleTicket";
    public static final String APPID_LOAN = "LoanProcess";
    public static final String GROUP_AM = "AccountManagers";
    public static final String GROUP_CS = "CustomerSupportAgents";
    public static final String GROUP_QA = "QualityAssurance";
    public static final String GROUP_DEV = "Developers";
    public static final String GROUP_LO = "LoanOfficers";
    public static final String GROUP_MN = "Managers";
    public static final String GROUP_CR = "CustomerRepresentatives";

    public static String getGroupAbbreviation(String groupName) {
        String abbr = "";
        if (groupName.equals("AccountManagers")) {
            abbr = "am";
        } else if (groupName.equals("CustomerSupportAgents")) {
            abbr = "cs";
        } else if (groupName.equals("QualityAssurance")) {
            abbr = "qa";
        } else if (groupName.equals("Developers")) {
            abbr = "dev";
        }
        return abbr;
    }

    public static String getAppId(String referrer) {
        String appId = "";
        if (referrer.contains("troubleticket")) {
            appId = APPID_TT;
        } else if (referrer.contains("loanapp")) {
            appId = APPID_LOAN;
        }
        return appId;
    }

    public static String getAppURL(String appID){
        String appURL="";
        if(appID.equals(APPID_TT)){
            appURL="http://localhost:8080/levi/troubleticket/login.jsp";
        }
        else if(appID.equals(APPID_LOAN)){
             appURL="http://localhost:8080/levi/loanapp/login.jsp";
        }
        return appURL;
    }
}
