/*
 Escreva um código que o usuário digita N números de 1 a 1000 e no final imprima
 a quantidade de números pares e ímpares digitados
 */

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int evenNumbers = 0;
        int oddNumbers = 0;
        int[]  numbers = new int[1000];
        System.out.println("**********************************************");
        System.out.println("**        Por favor digite um número        **");
        System.out.println("**        Pressione 0 para sair.            **");
        System.out.println("**********************************************");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] == 0){
                break;
            }else if(numbers[i] % 2 == 0){
                evenNumbers++;
            } else{
                oddNumbers++;
            }

        }
        System.out.println("O total de números pares é: "  + evenNumbers);
        System.out.println("O total de números impares é: " + oddNumbers);
    }
}
