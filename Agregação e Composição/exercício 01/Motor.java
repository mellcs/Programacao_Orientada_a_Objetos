public class Motor {
    private int potencia;
    private String tipoCombustivel;
    
    public Motor (int potencia, String tipoCombustivel) { //construtor pra inicializar os atributos (precisa sempre?)
        this.potencia = potencia;//tirar do privado e poder usar
        this.tipoCombustivel = tipoCombustivel;//tirar do privado e poder usar
    }
    
    public int getPotencia() {//o nome do atributo em letra maiúscula depois do get.
        return potencia;//só pega o bgl
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;//declara
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {//set nao tem tipo primitivo, direto void, nao retorna nada
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void exibirInfo() {//nao retorna nada, void
        System.out.println("Potência: " + potencia);
        System.out.println("Combustível usado: " + tipoCombustivel);
    }
    
    public static void main(String[] args) {
        Motor motor = new Motor(190, "Aditivada");//cria o objeto e atribui valores
        motor.exibirInfo();//mostra tudor
    }
}
