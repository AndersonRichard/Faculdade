/*
 Dado um array com os números de 1 a 100 escreva um código que imprima quais deles são números primos
 */
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("**        Por favor digite um número        **");
        System.out.println("**        Pressione 0 para sair.            **");
        System.out.println("**********************************************");
        int[] numbers = new int[1000];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            if(verificaPrimo(numbers[i])){
                System.out.println(numbers[i] + " é primo. ");
            } else {
                System.out.println(numbers[i] + " não é primo. ");
            }
        }

    }
    public static boolean verificaPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
