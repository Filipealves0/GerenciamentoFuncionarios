package Classes;

public abstract class Funcionario implements Trabalhavel{

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void realizarTarefas(){
    }

    public void exibirDados(Funcionario f){
        System.out.println("Nome : " + f.getNome());
        System.out.println("Salário : " + f.getSalario());

    }

    @Override
    public void trabalhar() {

    }
    @Override
    public void relatorio() {
    }

    @Override
    public void RealizarTarefa() {

    }
}
