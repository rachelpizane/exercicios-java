package com.rachelparticular.beeCrowd.exc1019;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ConverterTempo conversor = new ConverterTempo(scan.nextInt());

        System.out.printf(conversor.result());
    }
}
