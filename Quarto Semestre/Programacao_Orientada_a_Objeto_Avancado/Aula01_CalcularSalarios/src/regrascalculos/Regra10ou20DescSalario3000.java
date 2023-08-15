package regrascalculos;

import interfaces.RegraCalculo;
import models.Funcionario;

public class Regra10ou20DescSalario3000 extends RegraCalculo {

    @Override
    public double calcular(Funcionario funcionario) {
        return funcionario.getSalario() > 3000 ? funcionario.getSalario() * 0.8 : funcionario.getSalario() * 0.9;
    }
}
