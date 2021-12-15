package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro de 1 a 10.
O usuario deve informar de qual numero ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada: " + tabuada);

        for(int i = 1; i <= 10; i = i + 1){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));

        }
    }
}
