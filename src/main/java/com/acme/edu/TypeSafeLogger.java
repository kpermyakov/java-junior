package com.acme.edu;


import java.util.Arrays;

public class TypeSafeLogger {
    private static final String PRIMITIVE_PREFIX = "primitive: ";
    public static final String CHAR_PREFIX = "char: ";
    private static final String PRIMITIVE_ARRAYS = "primitives array: ";
    private static final String PRIMITIVE_MATRIX = "primitives matrix: ";

    /**
     * OCP
     */
    public static void log(int message) {
        String decoratedMessage = PRIMITIVE_PREFIX + message; //explaining var
        print(decoratedMessage);
    }

    public static void log(char message) {
        String decoratedMessage = CHAR_PREFIX + message;
        print(decoratedMessage);
    }

    /**
     * 1. Reuse
     * 2. Abstract -> Flexibility
     */
    private static void print(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }

    public static void log(int[] message) {
        String decoratedMessage = PRIMITIVE_ARRAYS + Arrays.toString(message)
                .replace('[','{')
                .replace(']','}');
        print(decoratedMessage);
    }

    public static void log(int[][] message) {
        String decoratedMessage = PRIMITIVE_MATRIX + Arrays.deepToString(message)
                .replace('[','{')
                .replace(']','}');
        print(decoratedMessage);
    }
}
