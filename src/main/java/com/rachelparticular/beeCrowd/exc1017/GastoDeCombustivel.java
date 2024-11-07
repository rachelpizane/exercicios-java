package com.rachelparticular.beeCrowd.exc1017;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double kmFor1Fuel = 12.0;

        int averageSpeed = scan.nextInt();
        int hour = scan.nextInt();

        double qttFuel = (averageSpeed * hour) / kmFor1Fuel;

        System.out.printf("%.3f%n", qttFuel);
    }
}
