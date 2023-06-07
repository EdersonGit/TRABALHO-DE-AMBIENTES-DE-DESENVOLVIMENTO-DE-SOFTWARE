package aluno;

import utils.Sexo;

public class Aluno {

    private Sexo sexo;
    
    public Sexo getSexo() {
        return sexo;
    }
    
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }    
    
    public Aluno(Sexo sexo) {
        this.sexo = sexo;
    }
}