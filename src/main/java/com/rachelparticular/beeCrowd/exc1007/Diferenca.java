package com.rachelparticular.beeCrowd.exc1007;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[4];

        for(int i = 0; i < 4; i++){
            valores[i] = scanner.nextInt();
        }

        int diferenca = valores[0] * valores[1] - valores[2] * valores[3];

        System.out.printf("DIFERENCA = %d%n", diferenca);
    }
}
