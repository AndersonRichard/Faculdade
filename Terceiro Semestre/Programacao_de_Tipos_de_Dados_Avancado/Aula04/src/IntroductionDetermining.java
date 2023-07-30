public class IntroductionDetermining {
    public static void main(String[] args) {
        int[][] matriz1 = {{4}};
        int[][] matriz2 = {{2, 4}, {6, 8}};
        int[][] matriz3 = {{1, 2, 3, 1, 2}, {4, 5, 6, 4, 5}, {7, 8, 9, 7, 8}};
        System.out.println(determinante(matriz3));
    }

    public static int determinante(int[][] matriz) {
        if (matriz.length == matriz[0].length) {
            if (matriz.length == 1) {
                return matriz[0][0];
            } else if (matriz.length == 2) {
                // 1 == j
                // 1 + j == lenght -1
                int diagPrin = 1;
                int diagSecu = 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == j) {
                            diagPrin *= matriz[i][j];
                        }
                        if (i + j == matriz.length - 1) {
                            diagSecu *= matriz[i][j];
                        }
                    }
                }
                return diagPrin - diagSecu;
            } else if (matriz.length == 3) {
                int diagPrin1 = 1;
                int diagSecu1 = 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == j) {
                            diagPrin1 *= matriz[i][j];
                        }
                        if (i + j == matriz.length - 1) {
                            diagSecu1 *= matriz[i][j];
                        }
                    }
                }
                return diagPrin1 - diagSecu1;
            }

        } else {
            System.out.println("Não é possivel calcular");
            return -1;
        }
        return 0;
    }
}

