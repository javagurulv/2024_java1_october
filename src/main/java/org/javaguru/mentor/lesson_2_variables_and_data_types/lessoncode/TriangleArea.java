package org.javaguru.mentor.lesson_2_variables_and_data_types.lessoncode;

// comment

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double p = (a + b + c) / 2;
        double square = p * ((p - a) * (p - b) * (p - c));
        double area = Math.sqrt(square);

        System.out.println("p = " + p);
        System.out.println("Square = " + square);
        System.out.println("Area = " + area);
    }

}
