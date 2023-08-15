package br.edu.univas;

import java.util.Scanner;

import static br.edu.univas.Calcular.calculadora;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario:");
        double salarioDigitado = scanner.nextDouble();
        System.out.println("Digite o Cargo:");
        String cargoDigitado = scanner.nextLine();


        calculadora(salarioDigitado, cargoDigitado);
    }
}
