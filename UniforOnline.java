import java.util.List;

public class UniforOnline {
    public static void main(String[] args) {
        CadastroAlunos cadastro = new CadastroAlunos();

        cadastro.adicionarAluno("João");
        cadastro.adicionarAluno("Maria");
        cadastro.adicionarAluno("Pedro");

        List<String> alunosCadastrados = cadastro.getAlunos();
        System.out.println("Alunos cadastrados:");

        for (String aluno : alunosCadastrados) {
            System.out.println(aluno);
        }   
    }
}