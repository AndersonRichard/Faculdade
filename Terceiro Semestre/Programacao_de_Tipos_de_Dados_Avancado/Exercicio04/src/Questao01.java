import java.util.Scanner;

/*
 Crie um programa que receba uma string e retorne a mesma string com as
 letras duplicadas em sequencia deverao ser removidas.
 */
public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite um palavra: ");
        String readWord = scan.nextLine();
        String result = removeDuplicate(readWord);
        System.out.println("A palavra digitada sem as letras duplicadas é: " + result);
    }

    public static String removeDuplicate(String readWord) {
        String result = "";
        for (int i = 0; i < readWord.length(); i++) {
            char aux = readWord.charAt(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (readWord.charAt(j) == aux) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result += aux;
            }
        }
        return result;
    }
}
