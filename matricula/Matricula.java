package matricula;

import java.util.Scanner;

public class Matricula {

    private String[] disciplinas;
    private String[] solicitacoesDeMatricula = new String[10];
    private int maximoDeSolicitacoes = 10;
    private int quantidadeDeDisciplinasSolicitadas;

    public Matricula (String[] disciplinas) {
        this.disciplinas = disciplinas;
        this.quantidadeDeDisciplinasSolicitadas = 0;
    }

    public void listarDisciplinas() {
        System.out.println("Estas são as disciplinas nas quais você pode realizar matrícula:");
        for (String disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }

    public void matricular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina na qual deseja se matricular.");
        String disciplina = scanner.nextLine();

        if(verificarSeContemString(disciplinas, disciplina)) {
            if(quantidadeDeDisciplinasSolicitadas < maximoDeSolicitacoes) {
                solicitacoesDeMatricula[quantidadeDeDisciplinasSolicitadas] = disciplina;
                System.out.println("Matrícula solicitda");
            } else {
                System.out.println("Não é possível adicionanr disciplinas");
            }
        }

        scanner.close();
    }

    public boolean verificarSeContemString(String[] vetor, String texto) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(texto)) {
                return true;
            }
        }
        return false;
    }
}