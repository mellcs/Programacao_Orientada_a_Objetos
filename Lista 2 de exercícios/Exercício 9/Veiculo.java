public class Veiculo {
    String marca;
    String modelo;
    int ano;
    Motor motor;  // Objeto Motor como atributo do Veiculo

    // Construtor para inicializar os atributos do veículo e o motor
    public Veiculo(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    // Método para ligar o motor do veículo
    public void ligarMotor() {
        motor.ligar();
        System.out.println("O motor está ligado.");
    }

    // Método para desligar o motor do veículo
    public void desligarMotor() {
        motor.desligar();
        System.out.println("O motor está desligado.");
    }

    // Método para exibir as informações completas do veículo e do motor
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potência do motor: " + motor.potencia + " HP");
        System.out.println("Tipo de combustível: " + motor.tipoCombustivel);
        System.out.println("Estado do motor: " + (motor.estado ? "Ligado" : "Desligado"));
    }

    public static void main(String[] args) {
        // Criando um motor
        Motor motor = new Motor(150, "Gasolina");

        // Criando um veículo com o motor
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2020, motor);

        // Exibindo as informações do veículo antes de ligar o motor
        veiculo.exibirInformacoes();

        // Ligando o motor do veículo
        veiculo.ligarMotor();

        // Exibindo as informações do veículo após ligar o motor
        veiculo.exibirInformacoes();

        // Desligando o motor do veículo
        veiculo.desligarMotor();

        // Exibindo as informações do veículo após desligar o motor
        veiculo.exibirInformacoes();
    }
}
