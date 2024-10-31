import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motoristas {
    protected String nome;
    protected int numId;
    protected double numCarteira;
    protected String experiencia; 
    protected List<Viagens> viagens;
    protected List<Recarga> recargas; 

    public Motoristas(String nome, int numId, double numCarteira, String experiencia) {
        this.nome = nome;
        this.numId = numId;
        this.numCarteira = numCarteira;
        this.experiencia = experiencia;
        this.viagens = new ArrayList<>();
        this.recargas = new ArrayList<>(); 
    }

    public void cadMotorista() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do motorista: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a identificação do motorista: ");
        int numId = scanner.nextInt();

        System.out.print("Digite o número da carteira de motorista: ");
        double numCarteira = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite o nível de experiência do motorista (iniciante, intermediário ou avançado): ");
        String experiencia = scanner.nextLine();

        Motoristas novoMotorista = new Motoristas(nome, numId, numCarteira, experiencia);

        
        System.out.println("Motorista cadastrado com sucesso: " + novoMotorista.nome);
    }

    public void exibirMotoristas() {
        if (recargas.isEmpty()) {
            System.out.println("Nenhum motorista cadastrado no momento.");
        } else {
            System.out.println("Motoristas cadastrados:");
            for (Recarga recarga : recargas) {
                System.out.println("Nome: " + nome + "| Identificação: " + numId
                        + "| Número da carteira: " + numCarteira
                        + "| Nível de experiência do motorista: " + experiencia);
            }
        }
    }

    public void adicionarRecarga(Recarga recarga) {
        recargas.add(recarga); 
        System.out.println("Recarga registrada: " + recarga.getQuantidadeRecarga() + " kWh em " + recarga.getDataHora());
    }

    // Getters e Setters
    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(double numCarteira) {
        this.numCarteira = numCarteira;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    public List<Viagens> getViagens() {
        return viagens;
    }
    
    public List<Recarga> getRecargas() {
        return recargas; 
    }
}
