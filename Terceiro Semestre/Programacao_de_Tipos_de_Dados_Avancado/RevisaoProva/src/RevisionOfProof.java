import java.util.Scanner;

public class RevisionOfProof {
    public static void main(String[] args) {
        //determinante1();
        //procurarString1();
        //determinante2();
        // procurarString2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String str = scanner.nextLine();
        String stringInvertida = inverterString(str);
        System.out.println("A palavra invertida é: " + stringInvertida);
    }
    public static void determinante1(){
        int[][] matriz = new int[2][2];

        matriz[0][0] = 2;
        matriz[0][1] = 5;
        matriz[1][0] = 10;
        matriz[1][1] = 5;

        int diagonalPrincipal = matriz[0][0] + matriz[1][1];
        int diagonalSecundaria = matriz[1][0] + matriz[0][1];

        System.out.println(diagonalPrincipal-diagonalSecundaria);

    }

    public static void procurarString1(){
        String[] nome = new String[5];
        nome[0] = "Anderson";
        nome[1] = "Minato";
        nome[2] = "Kakashi";
        nome[3] = "AKemi";
        nome[4] = "Caio";

        for(int i = 0; i < nome.length; i++){
            if(nome[i].toLowerCase().startsWith("a")){
                System.out.println(nome[i]);
            }
        }
    }

    public static void determinante2(){
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        int diagonalPrincipal = matriz[0][0] +  matriz[1][1];
        int diagonalSecundaria = matriz[0][1] + matriz[1][0];

        System.out.println(diagonalPrincipal - diagonalSecundaria);

    }

    public static void procurarString2(){
        String[] nomes = new String[5];
        nomes[0] = "Caio";
        nomes[1] = "Anderson";
        nomes[2] = "Matheus";
        nomes[3] = "Alysson";
        nomes[4] = "Sylvio";

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].toLowerCase().endsWith("o")){
                System.out.println(nomes[i]);
            }
        }
    }

    public static String inverterString(String str){
        String strInvertida = "";
        for(int i = str.length() - 1; i>= 0; i--){
            char c = str.charAt(i);
            strInvertida = strInvertida.concat(String.valueOf(c));
        }
        return strInvertida;
    }
}
