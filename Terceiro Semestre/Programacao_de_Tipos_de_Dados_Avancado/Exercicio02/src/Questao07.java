/*
 Escreva um código que imprima na tela o maior e o menor número dentro de um
 array
 */
import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numbers[] = new int[1000];
        int maior = 0;
        int menor = 1000;
        System.out.println("**********************************************");
        System.out.println("**        Por favor digite um número        **");
        System.out.println("**        Pressione 0 para sair.            **");
        System.out.println("**********************************************");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] > maior){
                maior = numbers[i];
            } else if (numbers[i] == 0) {
                break;
            }
            if(numbers[i] < menor){
                menor = numbers[i];
            }
        }

        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }
}

