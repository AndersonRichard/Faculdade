/*
 Solicitado para que fosse feito uma calculadora com as 4 operações básicas da matemática a afim de ver o nível
 de conhecimento.
 */
import java.util.Scanner;
public class CalculatorOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();
        int readOption = scan.nextInt();
        condicao(readOption);
    }

    public static void menu(){
        System.out.println("Por favor escolha uma das opções abaixo: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
    }
    public static void condicao(int readOption){
        Scanner scan = new Scanner(System.in);
        if (readOption == 1) {
            System.out.println("Por favor informe a quantidade de números para a operação: ");
            int readQuantityNumber = scan.nextInt();
            addition(readQuantityNumber);
        } else if (readOption == 2) {
            System.out.println("Por favor informe a quantidade de números para a operação: ");
            int readQuantityNumber = scan.nextInt();
            subtraction(readQuantityNumber);
        } else if (readOption == 3) {
            System.out.println("Por favor informe a quantidade de números para a operação: ");
            int readQuantityNumber = scan.nextInt();
            multiplication(readQuantityNumber);
        } else if (readOption == 4) {
            System.out.println("Por favor informe a quantidade de números para a operação: ");
            int readQuantityNumber = scan.nextInt();
            division(readQuantityNumber);
        }

    }

    public static void addition(int readNumber) {
        Scanner scan = new Scanner(System.in);
        int sum= 0;
        for (int i = 0; i < readNumber; i++) {
            System.out.println("Por favor digite o número: ");
            int readNumber1 = scan.nextInt();
            sum = sum + readNumber1;

        }
        System.out.println("O resultado da operação é: "  + sum);
    }

    public static void subtraction(int readNumber) {
        Scanner scan = new Scanner(System.in);
        int sub = 0;
        for (int i = 0; i < readNumber; i++) {
            System.out.println("Por favor digite o número: ");
            int readNumber1 = scan.nextInt();
            if(i == 0){
                sub = readNumber1;
            }else{
                sub = sub - readNumber1;
            }

        }
        System.out.println("O resultado da operação é: "  + sub);
    }

    public static void multiplication(int readNumber){
        Scanner scan = new Scanner(System.in);
        int multi = 0;
        for (int i = 0; i < readNumber; i++) {
            System.out.println("Por favor digite o número: ");
            int readNumber1 = scan.nextInt();
            if(i == 0){
                multi = readNumber1;
            }else{
                multi = multi * readNumber1;
            }

        }
        System.out.println("O resultado da operação é: "  + multi);
    }

    public static void division(int readNumber){
        Scanner scan = new Scanner(System.in);
        int div = 0;
        for (int i = 0; i < readNumber; i++) {
            System.out.println("Por favor digite o número: ");
            int readNumber1 = scan.nextInt();
            if(i == 0){
                div = readNumber1;
            }else{
                div = div / readNumber1;
            }

        }
        System.out.println("O resultado da operação é: "  + div);
    }
}

