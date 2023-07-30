import java.util.Scanner;

/*
 Faça um programa que receba uma string e retorne a mesma string com as
 letras em ordem alfabética, mas mantendo a posição relativa de letras iguais.
 */
public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String palavraOrdenada = ordenaString(palavra);
        System.out.println("Palavra ordenada: " + palavraOrdenada);
    }

    public static String ordenaString(String palavra) {
        char[] caracteres = palavra.toCharArray();
        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = i + 1; j < caracteres.length; j++) {
                if (caracteres[j] < caracteres[i]) {
                    char temp = caracteres[i];
                    caracteres[i] = caracteres[j];
                    caracteres[j] = temp;
                }
            }
        }
        return new String(caracteres);
    }

}
