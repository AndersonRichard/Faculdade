import java.util.Scanner;

/*
 Faça um programa que receba uma string e retorne a mesma string com as
 palavras que aparecem em uma lista de palavras permitidas
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] permitidas = {"casa", "carro", "computador"};

        String[] palavras = frase.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            for (String permitida : permitidas) {
                if (palavra.equals(permitida)) {
                    resultado.append(palavra).append(" ");
                    break;
                }
            }
        }

        System.out.println("Palavras permitidas: " + resultado.toString().trim());
    }

}
