import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    // Construtor
    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    // Método para adicionar cômodo à casa
    public void adicionarComodo(Comodo comodo) {
        comodos.add(comodo);
        System.out.println("Cômodo " + comodo.getTipo() + " adicionado à casa.");
    }

    // Método para listar todos os cômodos da casa
    public void listarComodos() {
        if (comodos.isEmpty()) {
            System.out.println("Nenhum cômodo na casa.");
        } else {
            System.out.println("Cômodos da casa em " + endereco + ":");
            for (Comodo comodo : comodos) {
                comodo.exibirInformacoes();
            }
        }
    }

    // Método main para testar a classe Casa
    public static void main(String[] args) {
        // Criando uma casa
        Casa casa = new Casa("Rua das Flores, 123");

        // Criando cômodos
        Comodo quarto = new Comodo("Quarto", 15.5);
        Comodo sala = new Comodo("Sala", 25.0);
        Comodo banheiro = new Comodo("Banheiro", 6.0);

        // Adicionando cômodos à casa
        casa.adicionarComodo(quarto);
        casa.adicionarComodo(sala);
        casa.adicionarComodo(banheiro);

        // Listando cômodos da casa
        casa.listarComodos();

        // A casa e seus cômodos serão destruídos ao final do programa
        System.out.println("Casa destruída (finalizado o programa).");
    }
}
