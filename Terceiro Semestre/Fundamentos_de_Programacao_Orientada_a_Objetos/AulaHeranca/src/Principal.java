import models.Aluno;
import models.Funcionario;
import models.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Anderson");
        a.setSexo("Masculino");
        a.setMatricula(98021441);
        System.out.println(a);

        Professor p = new Professor();
        p.setEspecialidade("Medicina");
        p.setNome("Richard");
        p.setSexo("Masculino");
        System.out.println(p);
        p.trocarEspecialidade("Historia");

        Funcionario f = new Funcionario();
        f.setSetor("Limpeza");
        f.setNome("Selma");
        f.setSexo("Feminino");
        System.out.println(f);

    }
}
