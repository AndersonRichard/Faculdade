/*
 Escreva um código que gera um novo array contendo o quadrado dos números de um array
 */
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("**        Por favor digite um número        **");
        System.out.println("**        Pressione 0 para sair.            **");
        System.out.println("**********************************************");
        int[] numbers = new int[1000];
        int[] multi = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            multi[i] = (int)Math.pow(numbers[i],2);
            if (numbers[i] == 0) {
                break;
            }
            System.out.println("Número ao quadrado é: " + multi[i]);

        }

    }
}
