import Classes.Projetos;
import Funcionarios.Designer;
import Funcionarios.Dev;
import Funcionarios.Gerente;

public class Main {
    public static void main(String[] args) {
        // Criando o projeto
        Projetos projeto = new Projetos("Plataforma EAD", "Desenvolvimento de uma plataforma de ensino a distância.");
        projeto.adicionaFuncionario("Filipe");
        projeto.exibirFuncionarios();

        System.out.println();

        // Criando equipe
        Gerente gerente = new Gerente("Ana", 16000.0);
        Dev dev = new Dev("Carlos", 3500.0);
        Designer designer = new Designer("Mariana", 2800.0);

        // Cada um trabalhando
        gerente.trabalhar();
        dev.trabalhar();
        designer.trabalhar();

        System.out.println("=--------------=");

        // Cada um gerando relatório
        gerente.relatorio();
        dev.relatorio();
        designer.relatorio();
    }
}
