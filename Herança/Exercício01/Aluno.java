public class Aluno extends Pessoa{
    protected int matricula;
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void atribuirMatricula(){
        matricula = 1234;
    }
    
    public void mostrar(){
        System.out.println("Matrícula:" + matricula);
    }
    
    public static void main(String[] args){
        Aluno alunor = new Aluno();
        
        alunor.atribuirMatricula();
        alunor.mostrar();
        alunor.atribuir();
        alunor.exibir();
    }
}
