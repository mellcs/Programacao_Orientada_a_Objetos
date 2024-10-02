//Crie uma superclasse Pessoa com os atributos nome e idade. 
//Crie duas subclasses: Professor com o atributo disciplina e Aluno com o atributo matricula. 
//Instancie objetos das subclasses e atribua valores específicos para cada uma delas.

public class Aluno extends Pessoa {
    protected int matricula;
    
    public Aluno (String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public void exibeer() {
        exibir();
        System.out.println("Matrícula: " + matricula);
    }
    
    public static void main(String[] args){
        Aluno aluno = new Aluno("Bruno Carneiro", 19, 1234);
        
        aluno.exibeer();
    }
    
}
