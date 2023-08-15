package main;

import models.Cargos;
import models.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario Tetse = new Funcionario(Cargos.DESENVOLVEDOR, 3000.00);
        Funcionario Teste2 = new Funcionario(Cargos.DESENVOLVEDOR, 7000.00);

        System.out.println(new CalcularSalario().calculaSalario(Tetse));
        System.out.println(new CalcularSalario().calculaSalario(Teste2));
    }
}
