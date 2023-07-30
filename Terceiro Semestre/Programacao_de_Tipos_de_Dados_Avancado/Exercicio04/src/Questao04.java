/*
 Faça um programa que receba uma string e retorne a mesma string com as
 letras em posições ímpares em maiúsculas e as letras em posições pares em
 minúsculas.
 */
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String readWord = scan.nextLine();
        char result;

        for(int i = 0; i < readWord.length(); i++){
            if(i %2 == 0){
                result = readWord.toUpperCase().charAt(i);
                System.out.print(result);
            }else{
                result = readWord.toLowerCase().charAt(i);
                System.out.print(result);
            }
        }
        System.out.println();

    }
}
