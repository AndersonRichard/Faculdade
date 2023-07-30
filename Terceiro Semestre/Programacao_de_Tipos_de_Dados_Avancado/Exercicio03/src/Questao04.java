/*
 Escreva um programa que solicite ao usuário a digitação de um CPF e o
 programa informa se é um CPF válido ou não. O programa deve aceitar a
 digitação com ou sem pontuação e deve validar os números do CPF. (Algoritmo
 para validação do CPF (macoratti.net))
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite o seu CPF: ");
        String readCpf = scan.nextLine().replaceAll("[^0-9]", "");;
        if (validateCpf(readCpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido, por favor digite CPF válido! ");
        }
    }

    public static boolean validateCpf(String readCpf) {
        if (readCpf.length() != 11 || readCpf.matches("(.)\\1{10}")) {
            return false;
        }
        int[] number = new int[11];
        for (int i = 0; i < 11; i++) {
            number[i] = Integer.parseInt(readCpf.substring(i, i + 1));
        }
        int sum = 0;
        for(int i = 0; i < 9; i++){
            sum += number[i] * (10 - i);
        }
        int rest = sum % 11;
        int numberOne = 0;
        if(rest < 2) {
            numberOne = 0;
        } else {
            numberOne = 11 - rest;
        }
        if(number[9] != numberOne){
            return false;
        }
        sum = 0;
        for(int i = 0; i < 10; i++){
            sum += number[i] * (11 - i);
        }
        rest = sum % 11;
        int segundoDigito = rest < 2 ? 0 : 11 - rest;
        if(number[10] != segundoDigito){
            return false;
        }
        return true;
    }
}


