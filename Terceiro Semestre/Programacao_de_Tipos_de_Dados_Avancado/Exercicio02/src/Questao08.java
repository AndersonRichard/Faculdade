/*
 Escreva uma função que recebe dois arrays como parâmetro e calcula e imprime
 a quantidade de números iguais dentro deles (imprima os próprios números iguais)
 (interseção da matemática) \t para paragrafo
 */

import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayA[] = new int[1000];
        int arrayB[] = new int[1000];
        System.out.println("**********************************************");
        System.out.println("**        Por favor digite um número        **");
        System.out.println("**        Pressione 0 para sair.            **");
        System.out.println("**********************************************");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do array A: ");
            arrayA[i] = scan.nextInt();
            if(arrayA[i] == 0){
                break;
            }
            System.out.println("Digite o " + (i + 1) + "º valor do array B: ");
            arrayB[i] = scan.nextInt();
        }

        for (int i = 0;i < arrayA.length;i++) {
            for (int j = 0;j<arrayA.length;j++){
                if (arrayA[i] == arrayB[j] && arrayA[i] != 0){
                    System.out.println("O numero " + arrayA[i] +" se repetiu");
                }
            }
        }
    }

}
