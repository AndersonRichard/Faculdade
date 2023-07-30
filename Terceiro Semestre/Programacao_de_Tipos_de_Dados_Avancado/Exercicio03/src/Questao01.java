/*
 Em uma determinada rotina o programa precisa trabalhar com Strings de exatos
 40 caracteres, porém o usuário pode digitar textos com diferentes quantidades
 de caracteres. Escreva um programa que obtém uma palavra digitada pelo
 usuário e preenche à esquerda com quantidade de _ que faltam para preencher
 40 caracteres. O programa não deve aceitar palavras que contenham mais que
 40 characters e não deve aceitar string vazias.
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux = 40;
        int stringLimit = 40;
        System.out.print("Escreva a palavra: ");
        String readWord = scan.nextLine();

        if (readWord.length() == 0) {
            System.out.println("Por favor digite a palavra, String vazia não é válida.");
        } else if (readWord.length() > stringLimit) {
            System.out.println("Por favor digite a palavra, String não aceita palavras acima de 40 caractere.");
        }else{
            aux = stringLimit - readWord.length();
            for(int i = 0; i < aux; i++){
                System.out.print("_");
            }
            System.out.println(readWord);
        }

    }
}
