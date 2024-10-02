//Crie uma superclasse Equipamento com um método ligar(). Crie uma subclasse Computador e, 
//sem sobrescrever o método, crie um objeto da subclasse e chame o método ligar() da superclasse para ativar o equipamento.

public class Computador extends Equipamento{
    
    public static void main(String[] args) {
        Computador computador = new Computador();
        
        computador.ligar();        
    }
}
    
