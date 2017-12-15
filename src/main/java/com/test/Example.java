package com.test;

import com.google.common.base.Joiner;

/**
 * @author Chathuranga Withana
 * Date: 14/12/2017
 * Time: 5:23 PM
 */
public class Example {

    public static String join(String... args) {
        System.out.println("Test File Modified");
        return Joiner.on(' ').join(args);
    }

}
