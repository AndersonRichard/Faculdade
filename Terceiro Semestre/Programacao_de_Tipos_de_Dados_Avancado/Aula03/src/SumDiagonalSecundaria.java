/*
  Realizar a somatória da Diagonal Secundaria da tabela 4*4
 */
public class SumDiagonalSecundaria {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;
        int contador = 1;
        int igualdade = matriz.length - 1;

        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = contador++;
                if (j == igualdade) {
                    somaDiagonal += matriz[i][j];
                    System.out.println(matriz[i][j]);
                    --igualdade;
                }
            }
        }
        System.out.println("Resultado: " + somaDiagonal);
    }
}

