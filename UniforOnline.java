import java.util.List;

public class UniforOnline {
    public static void main(String[] args) {
    
        CadastroAlunos cadastro = new CadastroAlunos();

        cadastro.adicionarAluno("João");
        cadastro.adicionarAluno("Maria");

        List<String> alunosCadastrados = cadastro.getAlunos();
        System.out.println("Alunos cadastrados:");

        for (String aluno : alunosCadastrados) {
            System.out.println(aluno);
        } 
        aluno aluno1 = new aluno("Masculino");
        aluno aluno2 = new aluno("Feminino");

        System.out.println("Sexo do aluno 1: " + aluno1.getSexo());
        System.out.println("Sexo do aluno 2: " + aluno2.getSexo());

        HorarioEstudo horario1 = new HorarioEstudo("Manhã");
        HorarioEstudo horario2 = new HorarioEstudo("Tarde");
        HorarioEstudo horario3 = new HorarioEstudo("Noite");

        System.out.println("Horário de estudo 1: " + horario1.getTurno());
        System.out.println("Horário de estudo 2: " + horario2.getTurno());
        System.out.println("Horário de estudo 3: " + horario3.getTurno());

        horario1.setTurno("Tarde");
        System.out.println("Novo horário de estudo 1: " + horario1.getTurno());
        System.out.println("Novo horário de estudo 2: " + horario1.getTurno());   
    }

}
