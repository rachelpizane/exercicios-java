package com.rachelparticular.beeCrowd.exc1014;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        int distance;
        double fuel;
        double averageConsumption;

        Scanner scan = new Scanner(System.in);

        distance = scan.nextInt();
        fuel = scan.nextDouble();

        averageConsumption = distance / fuel;

        System.out.printf("%.3f km/l%n", averageConsumption);

        scan.close();
    }


}
