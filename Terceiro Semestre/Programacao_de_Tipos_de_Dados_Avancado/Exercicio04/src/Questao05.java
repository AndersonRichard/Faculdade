import java.util.Scanner;

/*
 Crie um programa que receba uma string e retorne a mesma string com as
 letras repetidas agrupadas em parênteses e o número de vezes que elas
 aparecem.
 */
public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String readWord = scan.nextLine();
        String result = removeTeste(readWord);
        System.out.println(result);

    }
    public static String removeTeste(String readWord) {
        String result = "";
        int count = 0;
        for (int i = 0; i < readWord.length(); i++) {
            char aux = readWord.charAt(i);
            boolean duplicate = true;
            for (int j = 0; j < i; j++) {
                if (readWord.charAt(j) == aux) {
                    duplicate = true;
                    result += aux;
                    count++;
                    break;
                }
            }

        }
        return "(" + result + ")" + count;
    }
}

