//Crie uma superclasse Veiculo com o atributo capacidadeTanque. 
//Crie uma subclasse Carro que tenha um método exibirCapacidadeTanque(), 
//o qual imprime o valor do atributo da superclasse. Instancie um objeto da subclasse e utilize o método.

public class Carro extends Veiculo{
    
    public Carro(String capacidadeTanque){
        super(capacidadeTanque);
    }
    
    public void exibirCapacidadeTanque(){
        System.out.println("Capacidade do tanque: " + capacidadeTanque);
    }
    
    public static void main(String[]args){
        Carro carro = new Carro("54 litros");
        
        carro.exibirCapacidadeTanque();
    }
    
}
