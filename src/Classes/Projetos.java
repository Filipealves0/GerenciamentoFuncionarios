package Classes;

import java.util.ArrayList;

public class Projetos implements Trabalhavel {

    private String nomeProjeto;
    private String descricao;
    private ArrayList<String> equipe;

    public Projetos(String nomeProjeto, String descricao) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;

    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void adicionaFuncionario(String funcionario) {
        this.equipe.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (String funcionario : equipe) {
            System.out.println(funcionario);
        }
    }

    @Override
    public void trabalhar() {
        System.out.println("------ Relatório do Projeto ------");
        System.out.println("Nome: " + nomeProjeto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + "Em andamento");
        System.out.println("-----------------------------------");
    }

    @Override
    public void relatorio() {

    }

    @Override
    public void RealizarTarefa() {

    }

}



