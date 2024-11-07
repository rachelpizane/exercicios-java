package com.rachelparticular.beeCrowd.exc1010;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada1 = scanner.nextLine();
        String entrada2 = scanner.nextLine();

        String[] valores1 = entrada1.split(" ");
        String[] valores2 = entrada2.split(" ");

        int num_peca1 = Integer.parseInt(valores1[1]);
        float valor_unitario1 = Float.parseFloat(valores1[2]);

        int num_peca2 = Integer.parseInt(valores2[1]);
        float valor_unitario2 = Float.parseFloat(valores2[2]);

        float soma = (num_peca1 * valor_unitario1) + (num_peca2 * valor_unitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);

    }
}
