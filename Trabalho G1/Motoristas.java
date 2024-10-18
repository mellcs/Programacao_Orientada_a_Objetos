import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motoristas{
    protected String nome;
    protected int numId;
    protected double numCarteira;
    protected String experiencia; 
    
    protected static List <Motoristas> motoristasCadastrados = new ArrayList<>();
    
    public Motoristas(String nome, int numId, double numCarteira, String experiencia){
        this.nome = nome;
        this.numId = numId;
        this.numCarteira = numCarteira;
        this.experiencia = experiencia;
    }
    
    public static void cadMotorista(){
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
        
        motoristasCadastrados.add(novoMotorista);
        System.out.println("Motorista cadastrado com sucesso: " + novoMotorista.nome);
    }
    
    public static void exibirMotoristas(){
        if (motoristasCadastrados.isEmpty()){
            System.out.println("Nenhum motorista cadastrado no momento.");
        }else{
            System.out.println("Motoristas cadastrados:");
            for (Motoristas motorista : motoristasCadastrados) {
                System.out.println("Nome: " + motorista.nome + "| Identificação: " + motorista.numId + "| Número da carteira: " + motorista.numCarteira + "| Nível de experiência do motorista: " + motorista.experiencia);
            }
        }
    }
    
 	public static void main(String[] args) {
		cadMotorista();
		
		exibirMotoristas();
	}
	
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
}
