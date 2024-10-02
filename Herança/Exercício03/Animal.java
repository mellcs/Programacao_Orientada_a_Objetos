//Crie uma classe Animal com um construtor que inicializa o nome do animal. 
//Crie uma subclasse Cachorro que tenha um construtor que chame o construtor 
//da superclasse para inicializar o nome do animal.

public class Animal {
	protected String nomeAnimal;
	
	public Animal (String nomeAnimal){
	    this.nomeAnimal = nomeAnimal;
	}
	
	public void exibir(){
	    System.out.println("Nome do animal: " + nomeAnimal);
	}
}
