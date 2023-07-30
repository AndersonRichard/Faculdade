/*
 Escreve um código que calcula a soma dos números de um array
 */
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("** Olá digite o valor para calcular a soma. **");
        System.out.println("** Pressione 0 para sair.                   **");
        System.out.println("**********************************************");
        int[]  numbers = new int[1000];
        int sumNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sumNumber += numbers[i];
            if (numbers[i] == 0) {
                break;
            }
        }
        System.out.println("Resultado da soma é: " + sumNumber);
    }
}
