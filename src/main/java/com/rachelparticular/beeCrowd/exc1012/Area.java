package com.rachelparticular.beeCrowd.exc1012;

import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14159;

        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        ArrayList<Double> valores = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            valores.add(scan.nextDouble());
        }

        scan.close();

        areaTriangulo = (valores.get(0) * valores.get(2))/2;
        areaCirculo = PI * Math.pow(valores.get(2), 2);
        areaTrapezio = (valores.get(0) + valores.get(1)) * valores.get(2) / 2;
        areaQuadrado =  Math.pow(valores.get(1), 2);
        areaRetangulo = valores.get(0) * valores.get(1);

        System.out.printf(
            "TRIANGULO: %.3f\n" +
            "CIRCULO: %.3f\n" +
            "TRAPEZIO: %.3f\n" +
            "QUADRADO: %.3f\n" +
            "RETANGULO: %.3f\n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo
        );

    }
}
