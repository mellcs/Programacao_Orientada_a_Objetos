import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eletropostos {
    protected int id;
    protected String local;
    protected int vagas;
    protected double tempoCarga;

    protected List<Eletropostos> eletropostosCadastrados = new ArrayList<>();

    public Eletropostos(int id, String local, int vagas, double tempoCarga) {
        this.id = id;
        this.local = local;
        this.vagas = vagas;
        this.tempoCarga = tempoCarga;
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do Eletroposto: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Corrigindo o scanner para receber o próximo input corretamente

        System.out.print("Digite a localização do Eletroposto: ");
        String local = scanner.nextLine();

        System.out.print("Digite o número de vagas disponíveis: ");
        int vagas = scanner.nextInt();

        System.out.print("Digite o tempo médio de carga (em horas): ");
        double tempoCarga = scanner.nextDouble();

        Eletropostos novoEletroposto = new Eletropostos(id, local, vagas, tempoCarga);

        eletropostosCadastrados.add(novoEletroposto);
        System.out.println("Eletroposto cadastrado com sucesso: " + novoEletroposto.local);
    }

    public void exibirPosto() {
        List<Eletropostos> eletropostosDisponiveis = new ArrayList<>();
        for (Eletropostos eletroposto : eletropostosCadastrados) {
            if (eletroposto.tempoCarga > 0) {
                eletropostosDisponiveis.add(eletroposto);
            }
        }

        if (eletropostosDisponiveis.isEmpty()) {
            System.out.println("Nenhum eletroposto disponível no momento.");
        } else {
            System.out.println("Eletropostos disponíveis:");
            for (Eletropostos eletroposto : eletropostosDisponiveis) {
                System.out.println("ID: " + eletroposto.id + ", Localização: " + eletroposto.local + ", Vagas Disponíveis: " + eletroposto.vagas + ", Tempo Médio de Carga: " + eletroposto.tempoCarga + " horas");
            }
        }
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getTempoCarga() {
        return tempoCarga;
    }

    public void setTempoCarga(double tempoCarga) {
        this.tempoCarga = tempoCarga;
    }
}
