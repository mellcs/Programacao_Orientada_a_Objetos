import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eletropostos{
    protected double id;
    protected String local; //(cidade e/ou estrada)
    protected double vagas;
    protected double tempo_carga;
    
    protected static list <Eletropostos> eletroExistentes = new ArrayList<>();//começa lista

	public Eletropostos (double id, String local, double vagas, double tempo_carga){
	    this.id = id;
	    this.local = local;
	    this.vagas = vagas;
	    this.tempo_carga = tempo_carga;
	}
	
	public static void cadastro(double id, String local, double vagas, double tempo_carga){
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o Id do eletroposto: ");
	    double id = scanner.nextInt();
	    
	    scanner.nextLine();//??
	    
	    System.out.print("Digite a localização do Eletroposto: ");
        String local = scanner.nextLine();

        System.out.print("Digite o número de vagas disponíveis: ");
        double vagas = scanner.nextInt();

        System.out.print("Digite o tempo médio de carga (em horas): ");
        double tempo_carga = scanner.nextDouble();
        
        Eletropostos novoEletroposto = new Eletropostos(id, local, vagas, tempo_carga);//cria eletroposto novo
        
        eletroExistentes.add(novoEletroposto);//adiciona o obj a lista
        System.out.println("Eletroposto cadastrado: " + novoEletroposto.local).
	}
	
	public void consultaPontos(){
	    
	}
	
	public double getId(){
	    return id;
	}
	
	public String getLocal(){
	    return local;
	}
	
	public double getVagas(){
	    return vagas;
	}
	
	public double getTempo_carga(){
	    return tempo_carga;
	}
	
	public void setId(double id) {
        this.id = id;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public void setVagas(double vagas) {
        this.vagas = vagas;
    }
    
    public void setTempo_carga(double tempo_carga) {
        this.tempo_carga = tempo_carga;
    }
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

