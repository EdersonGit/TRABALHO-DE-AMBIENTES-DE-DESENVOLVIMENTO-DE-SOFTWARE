package menu;

import java.util.List;
import java.util.Scanner;

import aluno.Aluno;
import cadastro.CadastroAlunos;
import horario_estudo.HorarioEstudo;
import matricula.Matricula;
import utils.Sexo;

public class Menu {
    private CadastroAlunos cadastro = new CadastroAlunos();

    private Sexo sexo = Sexo.FEMININO;
    private Aluno aluno = new Aluno(sexo);
    
    private String[] disciplinas = {"Matemática", "Física", "Química", "Biologia"};
    private Matricula matricula = new Matricula(disciplinas);

    private HorarioEstudo turno = new HorarioEstudo("manhã");

    public void mostrarOpcoes() {
        System.out.println("Bem vindo ao Unifor Online. Escolha uma das seguintes opções:");

        System.out.println("1 - Cadastro de aluno");
        System.out.println("2 - Ver perfil de aluno");
        System.out.println("3 - Ver disciplinas disponíveis para matrícula");
        System.out.println("4 - Realizar matrícula");
        System.out.println("5 - Ver horários de estudo");
        System.out.println("6 - Sair");

        System.out.println("Digite o número da opção desejada:");

        escolherOpcao();
    }

    public void escolherOpcao() {
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.close();
        
        switch (opcao) {
            case 1:
                String nomeAluno = "João Silva";
                cadastro.adicionarAluno(nomeAluno);
                System.out.println("Cadastro realizado com sucesso");
                
                System.out.println("Lista de alunos cadastrados:");
                List<String> alunosCadastrados = cadastro.getAlunos();

                if(alunosCadastrados.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado");
                } else {
                    for (String aluno : alunosCadastrados) {
                        System.out.println(aluno);
                    }
                }
                break;

            case 2:
                System.out.println("Sexo: " + aluno.getSexo());
                break;

            case 3:
                matricula.listarDisciplinas();
                break;

            case 4:
                matricula.matricular(disciplinas[0]);
                break;

            case 5:
                System.out.println(turno.getTurno());
                break;

            case 6:
                System.out.println("Até mais!");
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
