package com.rachelparticular.beeCrowd.exc1016;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distanceCarX = scan.nextInt();

        int minutesCarY = 2 * distanceCarX;

        System.out.printf("%d minutos%n", minutesCarY);
    }
}
