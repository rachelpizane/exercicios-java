package com.rachelparticular.beeCrowd.exc1011;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14159;
        double raio;
        double volume;

        raio = scan.nextDouble();
        scan.close();

        volume = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
