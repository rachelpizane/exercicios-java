package com.rachelparticular.beeCrowd.exc1009;

import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double total_vendas = scanner.nextDouble();

        double comissao = total_vendas * 0.15;

        System.out.format("TOTAL = R$ %.2f%n", salario + comissao);

    }
}
