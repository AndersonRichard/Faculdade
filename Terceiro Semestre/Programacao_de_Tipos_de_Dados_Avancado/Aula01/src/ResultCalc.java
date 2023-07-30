/*
 Proposta de resolução para a calculadora passada em sala.
 */
import java.util.Scanner;
public class ResultCalc {
    public static void main(String[] args) {
        int numero;
        /*Integer numero2 = 2;

        double numero_flutuante = numero2.floatValue();//conversão de numeros

        String nome = "Marcos";
        nome.equals("Marcos");*/

        int quantidade, resultado = 0, operacao, numer;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Adição ");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Sair");
        operacao = scan.nextInt();

        System.out.println("Digite a quantidade de numeros");

        quantidade = scan.nextInt();

        for(int i = 0; i < quantidade; i++){
            numer = scan.nextInt();
            if(i == 0){
                resultado = numer;
            } else {
                switch (operacao){
                    case 1 : resultado = somar(resultado, numer); break;
                    case 2 : resultado = sub(resultado, numer); break;
                    case 3 : resultado = multi(resultado, numer); break;
                    case 4 : resultado = div(resultado, numer); break;
                }
            }

        }
        System.out.printf("Resultado %d\n", resultado);

    }
    public static int somar(int num1, int num2){

        return num1+num2;
    }
    public static int sub(int num1, int num2){

        return num1-num2;
    }
    public static int multi(int num1, int num2){

        return num1*num2;
    }
    public static int div(int num1, int num2){

        return num1/num2;
    }
}
