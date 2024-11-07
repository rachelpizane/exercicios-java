package com.rachelparticular.beeCrowd.exc1005;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        final double PESO_A = 3.5;
        final double PESO_B = 7.5;

        double mediaPonderada = (A * PESO_A + B * PESO_B) / (PESO_A + PESO_B);

        System.out.printf("MEDIA = %.5f%n", mediaPonderada);
    }
}
