package Funcionarios;

import Classes.Funcionario;
import Classes.Trabalhavel;

import java.io.Serializable;

public class Dev extends Funcionario implements Trabalhavel {
    private String nome;

    public Dev(String nome, Double salario) {
        super(nome, salario);
    }



    @Override
    public void trabalhar() {
        System.out.println("Dev " + nome + " está criando API que integre com o sistema.");

    }

    @Override
    public void relatorio() {

    }

    @Override
    public void realizarTarefas() {
        System.out.println("Realizar desenvolvimento de aplicações robustas para bom funcionamento do sistema");
    }
}
