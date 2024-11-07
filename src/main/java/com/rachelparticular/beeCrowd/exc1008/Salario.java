package com.rachelparticular.beeCrowd.exc1008;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_func = scanner.nextInt();
        int num_hr = scanner.nextInt();
        float salario_hr = scanner.nextFloat();

        float salario = num_hr * salario_hr;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", num_func, salario);
    }
}
