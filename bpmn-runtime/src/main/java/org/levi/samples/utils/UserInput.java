package org.levi.samples.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Dec 26, 2010
 * Time: 11:35:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInput {
    public static int read(int nOptions) {
        int input;
        System.out.print("What is your option {0 through " + (nOptions - 1) + "}? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = br.read();
            input = input - '0';
            if (input < 0 || input > nOptions - 1) {
                throw new IllegalArgumentException("input " + input + " is out of range");
            }
            return input;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
