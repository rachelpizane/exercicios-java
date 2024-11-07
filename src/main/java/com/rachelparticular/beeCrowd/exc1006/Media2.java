package com.rachelparticular.beeCrowd.exc1006;

import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        final double PESO_A = 2;
        final double PESO_B = 3;
        final double PESO_C = 5;

        double mediaPonderada = (A * PESO_A + B * PESO_B + C * PESO_C) / (PESO_A + PESO_B + PESO_C);

        System.out.printf("MEDIA = %.1f%n", mediaPonderada);

    }
}
