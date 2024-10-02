//Crie uma subclasse Cachorro que tenha um construtor que chame o construtor 
//da superclasse para inicializar o nome do animal.

public class Cachorro extends Animal {
    
    public Cachorro ( String nomeAnimal){
        super(nomeAnimal);
    }
    
    public void exibeer() {
        exibir();
    }
    
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Totó");
        
        cachorro.exibeer()
    }
    
}
