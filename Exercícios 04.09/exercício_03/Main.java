public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria Oliveira", 25, "123.456.789-00");

        pessoa1.mostrarDados();

        pessoa1.setIdade(-5);  

        pessoa1.setNome("Maria Silva");
        pessoa1.setIdade(30);

        pessoa1.mostrarDados();

    }
}
