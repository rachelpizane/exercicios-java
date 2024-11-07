package com.rachelparticular.beeCrowd.exc1013;

import java.util.Scanner;

public class Omaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int ab = ehMaior(a, b);
        int resultado = ehMaior(ab,c);

        System.out.printf("%d eh o maior%n", resultado);

        scan.close();
    }

    public static int ehMaior(int x,int y){
        return (x + y + Math.abs((x-y))) / 2;
    }

}
