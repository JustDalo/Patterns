package com.dalo.javafundamentals.memoryorganization.stack.stackoverflow;

public class StackOverflowExample {
    public static void main(String[] args) {
        calculateFactorial(20);
    }

    private static int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
}
