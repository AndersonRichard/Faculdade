/*
 *Escreva uma função que recebe dois arrays como parâmetro e calcual e
  imprime a quantidade de números distintos dentro dos dois array (imprima os
  números em ordem crescente) (união da matemática)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] combined = combine(arr1, arr2);
        int[] distinct = getDistinctNumbers(combined);

        System.out.println("Quantidade de números distintos: " + distinct.length);
        System.out.print("Números distintos em ordem crescente: ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            combined[index] = num;
            index++;
        }
        for (int num : arr2) {
            combined[index] = num;
            index++;
        }
        return combined;
    }

    public static int[] getDistinctNumbers(int[] arr) {
        int distinctCount = 0;
        int[] distinct = new int[arr.length];
        for (int num : arr) {
            if (!contains(distinct, distinctCount, num)) {
                distinct[distinctCount] = num;
                distinctCount++;
            }
        }
        return Arrays.copyOf(distinct, distinctCount);
    }

    public static boolean contains(int[] arr, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}