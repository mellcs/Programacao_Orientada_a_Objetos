import java.util.ArrayList;

public class Computador {
    private String modelo;
    private ArrayList<Periferico> perifericos;

    // Construtor
    public Computador(String modelo) {
        this.modelo = modelo;
        this.perifericos = new ArrayList<>();
    }

    // Método para adicionar periférico ao computador
    public void adicionarPeriferico(Periferico periferico) {
        perifericos.add(periferico);
        System.out.println("Periférico " + periferico.getNome() + " adicionado ao computador " + modelo + ".");
    }

    // Método para listar todos os periféricos do computador
    public void listarPerifericos() {
        if (perifericos.isEmpty()) {
            System.out.println("Nenhum periférico conectado ao computador " + modelo + ".");
        } else {
            System.out.println("Periféricos do computador " + modelo + ":");
            for (Periferico periferico : perifericos) {
                periferico.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Computador
    public static void main(String[] args) {
        // Criando um computador
        Computador computador = new Computador("Dell Inspiron");

        // Criando periféricos
        Periferico mouse = new Periferico("Mouse Wireless", "Mouse");
        Periferico teclado = new Periferico("Teclado Mecânico", "Teclado");
        Periferico monitor = new Periferico("Monitor LED 24\"", "Monitor");

        // Adicionando periféricos ao computador
        computador.adicionarPeriferico(mouse);
        computador.adicionarPeriferico(teclado);
        computador.adicionarPeriferico(monitor);

        // Listando periféricos do computador
        computador.listarPerifericos();

        // O computador e seus periféricos serão destruídos ao final do programa
        System.out.println("Computador destruído (finalizado o programa).");
    }
}
