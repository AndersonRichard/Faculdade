/*
 Faça um programa que receba uma string e retorne a mesma string com as
 letras vogais duplicadas.
 */
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String readWord = scan.nextLine();
        String result = duplicateWord(readWord);
        System.out.println("A palavra digitada com as vogais duplicadas é: " + result);
    }
    public static String duplicateWord(String readWord){
        String result = "";
        for(int i = 0; i < readWord.length(); i++){
            char aux = readWord.charAt(i);
            result += aux;
            if(vowelWord(aux)){
                result += aux;
            }
        }
        return result;
    }

    public static boolean vowelWord(char aux2){
        aux2 = Character.toLowerCase(aux2);
        return (aux2 == 'a' || aux2 == 'e' || aux2 == 'i' || aux2 == 'o' || aux2 == 'u');
    }
}