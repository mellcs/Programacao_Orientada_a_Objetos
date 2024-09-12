//composição
public class Carro {
    private String nomeCarro;
    private Motor Motor;
    public Carro (int potencia, String combustivel, String nomeCarro) {

    this.Motor = new Motor(potencia, combustivel);
    this.nomeCarro = nomeCarro;
    }
}
