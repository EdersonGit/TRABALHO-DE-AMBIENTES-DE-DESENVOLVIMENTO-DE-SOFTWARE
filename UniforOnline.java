public class UniforOnline {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Masculino");
        Aluno aluno2 = new Aluno("Feminino");

        System.out.println("Sexo do aluno 1: " + aluno1.getSexo());
        System.out.println("Sexo do aluno 2: " + aluno2.getSexo());

        aluno1.fazerMatricula();
        aluno2.fazerMatricula();

        aluno1.cancelarMatricula();
        aluno2.cancelarMatricula();
    }

    }
}