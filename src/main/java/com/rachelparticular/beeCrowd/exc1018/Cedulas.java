package com.rachelparticular.beeCrowd.exc1018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();

        System.out.printf(solutionExc1008(valor));
    }

    public static String solutionExc1008(int valor){
        int valor_loop = valor;

        List<Integer> notas = Arrays.asList(100,50,20,10,5,2,1);
        List<Integer> quantidadeNotas = new ArrayList<>();

        for(int i = 0; i < notas.size(); i++){
            int resultado = valor_loop / notas.get(i);

            quantidadeNotas.add(resultado);

            valor_loop -= resultado * notas.get(i);
        }

        String respostaFormatada = String.format("%d%n", valor);
        for (int i = 0; i < quantidadeNotas.size(); i++){
            respostaFormatada += String.format("%d nota(s) de R$ %d,00%n", quantidadeNotas.get(i),notas.get(i));
        }

        return respostaFormatada;
    }
}
