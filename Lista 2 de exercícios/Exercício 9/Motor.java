public class Motor {
    int potencia;
    String tipoCombustivel;
    boolean estado;  // true para ligado, false para desligado

    // Construtor para inicializar os atributos do motor
    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.estado = false;  // Motor começa desligado
    }

    // Método para ligar o motor
    public void ligar() {
        estado = true;
    }

    // Método para desligar o motor
    public void desligar() {
        estado = false;
    }
}
