/*
 Escreva um programa que o usuário digita uma data no formato dd/mm/yyyy e o
 programa converte para uma data por extenso, por exemplo: Dez de março de
 2023. O programa não deve aceitar datas digitadas fora deste padrão
 */

import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a data no padrão dd/mm/aaaa: ");
        String readDate = scan.nextLine();
        String day = String.valueOf(Integer.parseInt(readDate.substring(0,2)));
        String month = String.valueOf(Integer.parseInt(readDate.substring(3,5)));
        String year = String.valueOf(Integer.parseInt(readDate.substring(6,10)));

        switch(Integer.parseInt(month)){
            case 1: month = "janeiro"; break;
            case 2: month = "fevereiro"; break;
            case 3: month = "março"; break;
            case 4: month = "abril"; break;
            case 5: month = "maio"; break;
            case 6: month = "junho"; break;
            case 7: month = "julho"; break;
            case 8: month = "agosto"; break;
            case 9: month = "setembo"; break;
            case 10:month = "outubro"; break;
            case 11:month = "novembro"; break;
            case 12:month = "dezembro"; break;
        }
        switch(Integer.parseInt(day)){
            case 1: day = "Um"; break;
            case 2: day = "Dois"; break;
            case 3: day = "Três"; break;
            case 4: day = "Quatro"; break;
            case 5: day = "Cinco"; break;
            case 6: day = "Seis"; break;
            case 7: day = "Sete"; break;
            case 8: day = "Oito"; break;
            case 9: day = "Nove"; break;
            case 10:day = "Dez"; break;
            case 11:day = "Onze"; break;
            case 12:day = "Doze"; break;
            case 13:day = "Treze"; break;
            case 14:day = "Quatorze"; break;
            case 15:day = "Quinze"; break;
            case 16:day = "Dezessete"; break;
            case 17:day = "Dezesseis"; break;
            case 18:day = "Dezoito"; break;
            case 19:day = "Dezenove"; break;
            case 20:day = "Vinte"; break;
            case 21:day = "Vinte e um"; break;
            case 22:day = "Vinte e dois"; break;
            case 23:day = "Vinte e tres"; break;
            case 24:day = "Vinte e quatro"; break;
            case 25:day = "Vinte e cinco"; break;
            case 26:day = "Vinte e seis"; break;
            case 27:day = "Vinte e sete"; break;
            case 28:day = "Vinte e oito"; break;
            case 29:day = "Vinte e nove"; break;
            case 30:day = "Trinta"; break;
            case 31:day = "Trinta e um"; break;
        }
        System.out.println(day + " de " + month + " de " + year);

    }
}
