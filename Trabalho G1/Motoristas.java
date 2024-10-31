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

    public void cadMotorista(List<Motoristas> motoristasCadastrados, Motoristas motorista) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do motorista: ");
        motorista.setNome(scanner.nextLine()); // Setar o nome do motorista passado

        System.out.print("Digite a identificação do motorista: ");
        motorista.setNumId(scanner.nextInt()); // Setar a numId do motorista passado

        System.out.print("Digite o número da carteira de motorista: ");
        motorista.setNumCarteira(scanner.nextDouble()); // Setar o numCarteira do motorista passado

        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite o nível de experiência do motorista (iniciante, intermediário ou avançado): ");
        motorista.setExperiencia(scanner.nextLine()); // Setar a experiência do motorista passado

        motoristasCadastrados.add(motorista); // Adicionar o motorista à lista
        
        System.out.println("Motorista adicionado ao sistema: " + motorista.getNome());
    }

    public void exibirMotoristas(List<Motoristas> motoristasCadastrados) {
        if (motoristasCadastrados.isEmpty()) {
            System.out.println("Nenhum motorista cadastrado no momento.");
        } else {
            System.out.println("Motoristas cadastrados:");
            for (Motoristas motorista : motoristasCadastrados) {
                System.out.println("Nome: " + motorista.getNome() + "| Identificação: " + motorista.getNumId()
                        + "| Número da carteira: " + motorista.getNumCarteira() + "| Nível de experiência do motorista: " + motorista.getExperiencia());
            }
        }
    }
    
    public void exibirMotoristasRecargas() {
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
