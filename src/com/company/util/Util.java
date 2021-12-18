package com.company.util;

import java.util.Scanner;

public final class Util {
    private Util() {

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(String line) {
        System.out.println(line);
    }

    public static void print(int value) {
        print(String.valueOf(value));
    }

    public static int scanInt(String message) {
        int result;
        while (true) {
            print(message);
            String input = getString();
            try {
                result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException ex) {
                print("Неверный Ввод");
            }
        }
    }

    public static double scanDouble(String message) {
        double result;
        while (true) {
            print(message);
            String input = getString();
            try {
                result = Double.parseDouble(input);
                return result;
            } catch (NumberFormatException ex) {
                print("Неверный Ввод");
            }
        }
    }

    public static String scanString(String message) {
        while (true) {
            print(message);
            String input = getString();
            if (!input.isEmpty()) {
                return input;
            } else {
                print("Вы ввели пустую строку!");
            }
        }
    }

    private static String getString() {
        return scanner.nextLine();
    }

    public static void printArray2D(int[][] matrix) {

        for (int[] mat : matrix) {
            for (int ma : mat) {
                System.out.print(ma + "\t");
            }
            System.out.println();
        }
    }

}
