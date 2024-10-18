/******************************************************************************
(lembrar de puxar tempo carga do eletroposto letsgooo) 

[método para remover carro á frota]

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner

public class veiculosEletricos extends Eletropostos{
    protected int id_num;
    protected String marca;
    protected String modelo;
    protected int ano_fab;
    protected double cap_total_bat;
    protected double aut_max;
    
	protected static List<veiculosEletricos> frota = new ArrayList<>();

    public veiculosEletricos(int id_num, String marca, String modelo, int ano_fab, double cap_total_bat, double aut_max) {
        this.id_num = id_num;
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fab = ano_fab;
        this.cap_total_bat = cap_total_bat;
        this.aut_max = aut_max;
    }
    
    public static void addCarro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do veículo: ");
        int id_num = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do veículo: ");
        int ano_fab = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.println("Digite a capacidade total da bateria do veículo: ");
        double aut_max = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Digite a autonomia máxima do veículo: ");
        double cap_total_bat = scanner.nextDouble();
        
        veiculosEletricos novoVeiculo = new veiculosEletricos(id_num, marca, modelo, ano_fab, cap_total_bat, aut_max);

        frota.add(novoVeiculo);
        System.out.println("Veículo adicionado à frota: " + novoVeiculo.id_num);
    }
    
    
    public static void removeCarro(){
    
    }
    
    public static void listarCarros(){
        if (frota.isEmpty()) {
            System.out.println("Nenhum vaículo na frota.");
        } else {
            System.out.println("Veículos da frota:");
            for (veiculosEletricos veiculos : frota) {
                System.out.println("ID: " + veiculos.id_num + "| Marca: " + veiculos.marca + "| Modelo: " + veiculos.modelo + "| Ano de fabricação: " + veiculos.ano_fab + "| Capacidade total da bateria: " + veiculos.cap_total_bat + "| Autonomia máxima: " + aut_max);
            } 
        }
    }
    
    //
    
    public int getId_Num() {
        return id_num;
    }

    public void setId_Num(int id_num) {
        this.id_num = id_num;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno_Fab() {
        return ano_fab;
    }

    public void setAno_Fab(int ano_fab) {
        this.ano_fab = ano_fab;
    }
    
    public double getCap_Total_Bat() {
        return cap_total_bat;
    }

    public void setCap_Total_Bat(double cap_total_bat) {
        this.cap_total_bat = cap_total_bat;
    }

    public double getAut_Max() {
        return aut_max;
    }

    public void setAut_Max(double aut_max) {
        this.aut_max = aut_max;
    }
}
