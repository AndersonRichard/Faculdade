import java.util.Arrays;
import java.util.Scanner;

/*
 Crie um programa que receba uma string e retorne a mesma string com as
 palavras em ordem decrescente de tamanho
 */
public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        for (int i = 0; i < palavras.length - 1; i++) {
            for (int j = i + 1; j < palavras.length; j++) {
                if (palavras[j].length() > palavras[i].length()) {
                    String temp = palavras[i];
                    palavras[i] = palavras[j];
                    palavras[j] = temp;
                }
            }
        }

        System.out.println("Palavras em ordem decrescente de tamanho: ");
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
    }
}
