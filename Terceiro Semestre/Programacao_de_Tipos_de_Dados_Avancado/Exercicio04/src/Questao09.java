import java.util.Scanner;

/*
 Crie um programa que receba uma string e retorne a mesma string com as
 palavras em ordem alfabética, mas ignorando artigos e preposições.
 */
public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.toLowerCase().split("\\s+");
        int n = palavras.length;

        // Remove artigos e preposições
        for (int i = 0; i < n; i++) {
            String palavra = palavras[i];
            if (palavra.equals("a") || palavra.equals("ao") || palavra.equals("aos") ||
                    palavra.equals("as") || palavra.equals("à") || palavra.equals("às") ||
                    palavra.equals("o") || palavra.equals("os") || palavra.equals("e") ||
                    palavra.equals("em") || palavra.equals("no") || palavra.equals("na") ||
                    palavra.equals("nas") || palavra.equals("num") || palavra.equals("numa") ||
                    palavra.equals("uns") || palavra.equals("umas") || palavra.equals("de") ||
                    palavra.equals("do") || palavra.equals("dos") || palavra.equals("da") ||
                    palavra.equals("das") || palavra.equals("por") || palavra.equals("para")) {
                palavras[i] = null;
            }
        }

        // Ordena as palavras restantes em ordem alfabética
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (palavras[i] != null && palavras[j] != null && palavras[i].compareTo(palavras[j]) > 0) {
                    String temp = palavras[i];
                    palavras[i] = palavras[j];
                    palavras[j] = temp;
                }
            }
        }

        // Imprime as palavras ordenadas
        System.out.print("Palavras ordenadas: ");
        for (int i = 0; i < n; i++) {
            if (palavras[i] != null) {
                System.out.print(palavras[i] + " ");
            }
        }
    }
}
