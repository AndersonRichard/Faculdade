/*
    Gerar uma tabela 4*4 onde o primeiro vai de 1 a 16
    O segundo vai de 2 em 2 a partir do 2 até chegar em 32
    E o terceiro vai de 3 em 3 a partir do 3 até chegar em 48
 */
public class IntroductionMatrizExercise {
    public static void main(String[] args) {
        int[][] tabela = new int[4][4];
        int count = 1;
        int[][] tabela2 = new int[4][4];
        int count2 = 1;
        int[][] tabela3 = new int[4][4];

        for(int i=0; i<tabela.length; i++) {
            for(int j=0; j<tabela[i].length; j++) {
                tabela[i][j] = count++;
            }
        }
        for(int i=0; i<tabela.length; i++) {
            for(int j=0; j<tabela[i].length; j++) {
                if (j == 3) {
                    System.out.print(tabela[i][j]);
                } else {
                    System.out.print(tabela[i][j] + " - ");
                }
            }
            System.out.println();
        }
        System.out.println();


        for(int a=0; a<tabela2.length; a++) {
            for(int b=0; b<tabela2[a].length; b++) {
                tabela2[a][b] = count2 + count2++;
            }
        }
        for(int a=0; a<tabela2.length; a++) {
            for(int b=0; b<tabela2[a].length; b++) {
                if (b == 3) {
                    System.out.print(tabela2[a][b]);
                } else {
                    System.out.print(tabela2[a][b] + " - ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<tabela3.length; i++) {
            for(int j=0; j<tabela3[i].length; j++) {
                tabela3[i][j] = tabela[i][j]+tabela2[i][j];
            }
        }
        for(int i=0; i<tabela3.length; i++) {
            for(int j=0; j<tabela3[i].length; j++) {
                if(j == 3){
                    System.out.print(tabela3[i][j]);
                }else{
                    System.out.print(tabela3[i][j]+ " - ");
                }
            }
            System.out.println();
        }
        /*
        for(int i = 0; i < tabela.length; i++){
            for(int j = 0; j <  tabela.length;j++){
                tabela[i][j] = count++;
                tabela2[i][j] = count2 + count2++;
                tabela3[i][j] = tabela[i][j] + tabela2[i][j];
                System.out.print(tabela3[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
