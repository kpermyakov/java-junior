package com.acme.edu;


import java.util.Arrays;

public class TypeSafeLogger {
    private static final String PRIMITIVE_PREFIX = "primitive: ";
    private static final String CHAR_PREFIX = "char: ";
    private static final String PRIMITIVE_ARRAYS = "primitives array: ";
    private static final String PRIMITIVE_MATRIX = "primitives matrix: ";
    private static final String STRING_PREFIX = "string: ";
    private static final Object REFERENCE_PREFIX = "reference: ";

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

    public static void log(String message) {
        String decoratedMessage = STRING_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(boolean message) {
        String decoratedMessage = PRIMITIVE_PREFIX + message; //explaining var
        print(decoratedMessage);
    }

    public static void log(Object message) {
        String decoratedMessage = REFERENCE_PREFIX + message.toString();
        print(decoratedMessage);
    }
}
