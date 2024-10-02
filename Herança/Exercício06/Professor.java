//Crie uma superclasse Pessoa com os atributos nome e idade. 
//Crie duas subclasses: Professor com o atributo disciplina e Aluno com o atributo matricula. 
//Instancie objetos das subclasses e atribua valores específicos para cada uma delas.

public class Professor extends Pessoa {
    protected String disciplina;
    
    public Professor (String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }
    
    public void exibeer() {
        exibir();
        System.out.println("Disciplina lecionada: " + disciplina);
    }
    
    public static void main(String[] args){
        Professor professor = new Professor("Luciano Cassol", 45, "Programação Orientada a Objetos");
        professor.exibeer();
    }
    
}
