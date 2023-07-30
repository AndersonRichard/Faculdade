/*
    Fazer a multiplicação de matriz onde a primeira tabela tem 2*3 (1,2,3,5,6,7)
    A segunda tem 3*2(2,4,10,12,18,20)
    A terceira tem 2*2 e deverá ser o resultado da multiplicação das duas primeiras
 */
public class IntroductionMatrizMultiplication {
    public static void main(String[] args) {

        int[][] tabela = new int[2][3];
        int[][] tabela2 = new int[3][2];
        int[][] tablea3 = new int[2][2];
        int count = 1;
        int count2 = 1;
        int linha = 2;
        int coluna = 3;
        int coluna2 = 2;

        for (int a = 0; a < tabela.length; a++) {
            for (int b = 0; b < tabela[a].length; b++) {
                tabela[a][b] = count++;
            }
            count++;
        }

        for (int a = 0; a < tabela.length; a++) {
            for (int b = 0; b < tabela[a].length; b++) {
                System.out.print(tabela[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int c = 0; c < tabela2.length; c++) {
            for (int d = 0; d < tabela2[c].length; d++) {
                tabela2[c][d] = count2 + count2++;
            }
            count2++;
            count2++;
        }

        for (int c = 0; c < tabela2.length; c++) {
            for (int d = 0; d < tabela2[c].length; d++) {
                System.out.print(tabela2[c][d] + " ");
            }
            System.out.println( );
        }

        System.out.println();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna2; j++) {
                int soma = 0;
                for (int k = 0; k < coluna; k++) {
                    soma += tabela[i][k] * tabela2[k][j];
                }
                tablea3[i][j] = soma;
            }
        }

        System.out.println(" ");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print(tablea3[i][j] + " ");
            }
            System.out.println("");
        }
/*
        Scanner scanner = new Scanner(System.in);
        int linha = 2;
        int coluna = 3;
        int[][] matrizA = new int [linha][coluna];
        int linha2 = 3;
        int coluna2 = 2;
        int[][] matrizB = new int [linha2][coluna2];


        for(int i = 0; i < linha;i++){
            for(int j = 0; j < coluna; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i < linha2;i++){
            for(int j = 0; j < coluna2; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        if(matrizA[0].length == matrizA.length){
            int[][] matrizC = new int[linha][coluna2];
            for(int i = 0; i < linha; i++){
                for(int j = 0; j < coluna2; j++){
                    for(int k = 0; k < linha2; k++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            for(int i = 0; i < linha;i++){
                for(int j = 0; j < coluna2; j++){
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Não é possivel realizar a multiplicação");
        }
    }*/
    }
}






