public class Aluno {

    private String sexo;
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    
    
    public Aluno(String sexo) {
        this.sexo = sexo;
    }

    public void fazerMatricula() {
        System.out.println(nome + " fez sua matrícula na escola.");
    }

    public void cancelarMatricula() {
        System.out.println(nome + " cancelou sua matrícula na escola.");
    }
    
}