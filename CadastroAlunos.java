import java.util.ArrayList;
import java.util.List;

public class CadastroAlunos {
    private List<String> nomesAlunos;

    public CadastroAlunos() {
        nomesAlunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome) {
        nomesAlunos.add(nome);
    }

    public List<String> getAlunos() {
        return nomesAlunos;
    }
}