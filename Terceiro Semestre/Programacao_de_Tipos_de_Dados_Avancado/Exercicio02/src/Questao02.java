/*
 Escreva um código que calcula a média aritmética dos números de um array.
 */
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]  numbers = new int[1000];
        int sumNumber = 0;
        double readQuanty = 0;
        System.out.println("**********************************************************");
        System.out.println("** Olá digite o valor para calcular a média aritmética. **");
        System.out.println("** Pressione 0 para sair.                               **");
        System.out.println("**********************************************************");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sumNumber += numbers[i];
            readQuanty++;
            if (numbers[i] == 0) {
                readQuanty = readQuanty -1;
                break;
            }
        }
        System.out.printf("Resultado da média aritmética é = %.2f %n",  sumNumber/readQuanty);
    }
}
