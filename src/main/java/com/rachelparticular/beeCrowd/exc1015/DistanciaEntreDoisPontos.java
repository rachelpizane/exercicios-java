package com.rachelparticular.beeCrowd.exc1015;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] p1 = new double[2];
        double[] p2 = new double[2];
        double distance;

        for(int i = 0; i < p1.length; i++){
            p1[i] = scan.nextDouble();
        }

        for(int i = 0; i < p2.length; i++){
            p2[i] = scan.nextDouble();
        }

        distance = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));

        System.out.printf("%.4f%n",distance);
    }
}
