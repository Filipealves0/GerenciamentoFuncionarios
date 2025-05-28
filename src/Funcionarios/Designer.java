package Funcionarios;

import Classes.Funcionario;
import Classes.Trabalhavel;

public class Designer extends Funcionario implements Trabalhavel {


    private String nome;


    public Designer(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Designer " + nome + " está criando interfaces visuais e layouts.");

    }

    @Override
    public void relatorio() {

    }

    @Override
    public void realizarTarefas() {
        System.out.println("Responsável pela implementação visual da empresa. ");
    }
}
