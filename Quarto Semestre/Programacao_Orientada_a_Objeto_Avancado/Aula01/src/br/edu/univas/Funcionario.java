package br.edu.univas;

public class Funcionario {

    private Cargo cargo;
    double salario;

    public Funcionario(Cargo cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
