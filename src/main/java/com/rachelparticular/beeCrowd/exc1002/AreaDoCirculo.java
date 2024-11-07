package com.rachelparticular.beeCrowd.exc1002;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double N = 3.14159;
        double P = 2;

        double area = N * Math.pow(raio, P);

        System.out.format("A=%.4f%n", area);
    }
}
