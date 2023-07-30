/*
 Solicitado para que fosse feito uma calculadora com as 4 operações básicas da matemática a afim de ver o nível
 de conhecimento.
 Segunda forma feita da calculadora
 */
import java.util.Scanner;
public class CalculatorTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        int exit = 0;
        String One = "Adição";
        String Two = "Subtração";
        String Three = "Multiplicação";
        String Four = "Divisão";

        while (exit != 1) {
            System.out.println(String.format("1. Adição " , One));
            System.out.println(String.format("2. Subtração" , Two));
            System.out.println(String.format("3. Multiplicação" , Three));
            System.out.println(String.format("4. Divisão" , Four));
            System.out.println("5. Sair");
            option = scan.nextInt();
            if(option == 1){
                System.out.println("Por favor informe a quantidade de números para a operação: ");
                int readQuantityNumber = scan.nextInt();
                addition(readQuantityNumber);
            }else if (option ==2){
                System.out.println("Por favor informe a quantidade de números para a operação: ");
                int readQuantityNumber = scan.nextInt();
                subtraction(readQuantityNumber);
            }else if (option ==3){
                System.out.println("Por favor informe a quantidade de números para a operação: ");
                int readQuantityNumber = scan.nextInt();
                multiplication(readQuantityNumber);
            }else if (option ==4){
                System.out.println("Por favor informe a quantidade de números para a operação: ");
                int readQuantityNumber = scan.nextInt();
                division(readQuantityNumber);
            }else if (option ==5){
                exit++;
            }else {
                System.out.println("Opção inválida! Por favor,digite uma opção correta!");
            }
            System.out.println();
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