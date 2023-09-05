package com.cyb.college.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeTest extends TestUtil {
    public static void main(String[] args) {
        List<String> testString = Arrays.asList("121", "Rahul", "Shri", "Akasah");
        Collections.sort(testString, Collections.reverseOrder());
        for (String string : testString) {
            System.out.println(string);
        }
    }
}