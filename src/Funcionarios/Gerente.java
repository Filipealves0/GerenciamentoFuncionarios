package Funcionarios;

import Classes.Funcionario;
import Classes.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel {

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("Iniciando o projeto: " + getNome());
    }

    @Override
    public void relatorio() {
    }

    @Override
    public void realizarTarefas() {
        System.out.println("Supervisão de equipes. ");
    }
}
