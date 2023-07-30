/*
 Escreva uma função que recebe dois arrays como parâmetro e calcula e imprime
 quais números existem apenas em um (imprima os números) (diferença da
 matemática) exemplo de entrada array1(1,2,3,4,5) entrada array2(2,4,6,9)
 */
import java.util.Scanner;
public class Questao09 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6, 9};

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(array1[i]);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(array2[i]);
            }
        }
    }

}