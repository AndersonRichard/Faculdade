//gerar 30 linhas para lançar 4 notas de alunos e calcular a média
import java.util.Scanner;

public class IntroductionMatriz {
    public static void main(String[] args) {
        /*
        //TODO Auto-generated method stub
        //declarar uma matriz
        //definise- o tipo do dado seguido de dois parenteses
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = 1;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }*/


        int[][] alunoNota = new int[30][4];
        //Random nota = new Random();
        for (int i = 0; i < alunoNota.length; i++) {
            for(int j = 0; j < alunoNota[i].length; j++){
                //alunoNota[i][j] = nota.nextInt()*25;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite a nota:");
                int readNote = scanner.nextInt();
                alunoNota[i][j] = readNote;
            }
        }
        for (int i = 0; i < alunoNota.length; i++) {
            int sum = 0;
            for(int j = 0; j < alunoNota[i].length; j++){
                sum += alunoNota[i][j];
            }
            double media = (sum /alunoNota[i].length);
            System.out.println("A média na posição " + (i+1) + " é igual a : " + media);
        }


    }
}
