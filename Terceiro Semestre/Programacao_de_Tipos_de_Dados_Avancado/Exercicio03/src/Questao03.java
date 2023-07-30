/*
 Escreva um programa que coloque todas as vogais de uma string em letra
 maiúscula.
 */
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String readWord = "";
        String vowelUppercase = "";
        System.out.println("Por favor digite uma palavra: ");
        readWord = scan.nextLine();
        for(int i = 0; i < readWord.length(); i++){
            char aux = readWord.charAt(i);
            if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u' ||
                    aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U'){
                vowelUppercase += Character.toUpperCase(aux);
            }else {
                vowelUppercase += aux;
            }
        }
        System.out.println("A palavra digita com as vogais maiúscula: " + vowelUppercase);
    }
}
