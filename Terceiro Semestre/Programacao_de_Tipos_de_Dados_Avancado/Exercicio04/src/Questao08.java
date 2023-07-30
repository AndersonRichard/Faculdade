import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Faça um programa que receba uma string e verifique se a mesma é um código
 válido de CNH (Carteira Nacional de Habilitação).
 */
public class Questao08 {
    public static void main(String[] args) {
        String cnh = "06698928774"; // Substitua aqui pela string que deseja verificar

        if (validaCNH(cnh)) {
            System.out.println("CNH válida!");
        } else {
            System.out.println("CNH inválida!");
        }
    }

    public static boolean validaCNH(String cnh) {
        // Verifica se a string possui exatamente 11 dígitos numéricos
        if (cnh.length() != 11) {
            return false;
        }
        for (int i = 0; i < cnh.length(); i++) {
            if (!Character.isDigit(cnh.charAt(i))) {
                return false;
            }
        }

        // Verifica se todos os dígitos são iguais (CNH inválida)
        boolean todosDigitosIguais = true;
        for (int i = 1; i < cnh.length(); i++) {
            if (cnh.charAt(i) != cnh.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cnh.charAt(i) - '0') * (9 - i);
        }
        int resto = soma % 11;
        char dv1 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');

        // Verifica o primeiro dígito verificador
        if (cnh.charAt(9) != dv1) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cnh.charAt(i) - '0') * (10 - i);
        }
        resto = soma % 11;
        char dv2 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');

        // Verifica o segundo dígito verificador
        if (cnh.charAt(10) != dv2) {
            return false;
        }

        return true;
    }
}
