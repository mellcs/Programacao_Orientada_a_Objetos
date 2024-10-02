//Crie uma superclasse Pessoa com os atributos nome e idade. 
//Crie duas subclasses: Professor com o atributo disciplina e Aluno com o atributo matricula. 
//Instancie objetos das subclasses e atribua valores específicos para cada uma delas.

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa (String nome, int idade){
	    this.nome = nome;
	    this.idade = idade;
	}
	
	public void exibir(){
	    System.out.println("Nome: " + nome);
	    System.out.println("Idade: " + idade);
	}
}
