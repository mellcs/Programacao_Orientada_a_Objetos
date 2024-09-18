//Em seguida, crie uma classe Carro que tenha um motor como parte integrante. No construtor da classe Carro, 
//instancie o motor. Implemente métodos para exibir informações sobre o carro e seu motor.
 
public class Carro {
    private Motor motor;//chama o outro e gruda ele aqui
    
    //construtor não recebe atribuição de tipo de dado pq é uma ferramenta não uma coisa.
    public Carro (int potencia, String tipoCombustivel){
    //chamamos a outra classe antes, então dá pra usar direto os troços dele q nem em python.    
        this.motor = new Motor(potencia, tipoCombustivel);//usa o objeto pequenino, gruda o motor aos atributos.
    }
    
    public Motor getMotor(){//O tipo é a outra classe, pq vem de la
        return motor;//pequenino
    }
    
    public void SetMotor(Motor motor){//a outra classe foi instanciada primeiro assim, então esses são seus "atributos".
        this.motor = motor;//pequeninos
    }
    
    public void mostrarInfo(){
        System.out.println("Informações do carro: ");
        if (motor != null){
            motor.exibirInfo();
        }else{
            System.out.println("Motor não definido.");
        }
    }
    
    public static void main (String[] args){
        Carro carro = new Carro(130, "Diesel");
        
        carro.mostrarInfo();
    }
 }
