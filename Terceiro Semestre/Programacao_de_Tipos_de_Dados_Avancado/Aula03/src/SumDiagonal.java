/*
    Realizar o calculo da soma Diagonal principal de uma tabela
 */
public class SumDiagonal {
    public static void main(String[] args) {
        // declarar uma matriz
        // define-se o tipo do dado seguido de dois pares de colchetes
        int count = 3;
        int[][] matriz = new int[4][4];

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = count++;
            }
        }

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaDaDiagonalPrincipal = 0;

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                if(i == j) {
                    somaDaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        System.out.println(somaDaDiagonalPrincipal);

    }

}
