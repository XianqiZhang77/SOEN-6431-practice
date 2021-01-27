package com.company;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        if (isValidTriangle(a, b, c)) {
            drawTriangle(a, b, c);
        }

    }

    private static boolean isValidTriangle(int a, int b, int c) {
        if (a < 1 || a > 8 || b < 1 || b > 8 || c < 1 || c > 8) return false;
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static void drawTriangle(int a, int b, int c) {


    }
}
