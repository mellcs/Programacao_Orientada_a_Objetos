import java.util.List;
import java.util.Scanner;
public class VeiculosEletricos {
    protected int id_num;
    protected String marca;
    protected String modelo;
    protected int ano_fab;
    protected double cap_total_bat;
    protected double aut_max;
    protected double quilometragem;
    protected double cargaAtual; 

    public VeiculosEletricos(int id_num, String marca, String modelo, int ano_fab, double cap_total_bat, double aut_max) {
        this.id_num = id_num;
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fab = ano_fab;
        this.cap_total_bat = cap_total_bat;
        this.aut_max = aut_max;
        this.quilometragem = 0;
        this.cargaAtual = cap_total_bat; 
    }

   
    public double getCargaAtual() {
        return cargaAtual;
    }

    
    public void adicionarCarga(double carga) {
        this.cargaAtual += carga;
        if (this.cargaAtual > this.cap_total_bat) {
            this.cargaAtual = this.cap_total_bat; 
        }
    }

    
    public void consumirCarga(double carga) {
        this.cargaAtual -= carga;
        if (this.cargaAtual < 0) {
            this.cargaAtual = 0; 
        }
    }
    
    public void addCarro(List<VeiculosEletricos> frota, VeiculosEletricos veiculo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do veículo: ");
        veiculo.setId_Num(scanner.nextInt());

        scanner.nextLine(); 

        System.out.print("Digite a marca do veículo: ");
        veiculo.setMarca(scanner.nextLine());

        System.out.print("Digite o modelo do veículo: ");
        veiculo.setModelo(scanner.nextLine());

        System.out.print("Digite o ano de fabricação do veículo: ");
        veiculo.setAno_Fab(scanner.nextInt());

        System.out.print("Digite a capacidade total da bateria do veículo: ");
        veiculo.setCap_Total_Bat(scanner.nextDouble());

        frota.add(veiculo); 
        System.out.println("Veículo adicionado à frota: " + veiculo.getId_Num());
    }

    public void removeCarro(List<VeiculosEletricos> frota) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do veículo que deseja remover: ");
        int id_num = scanner.nextInt();

        boolean encontrado = false;
        for (VeiculosEletricos veiculo : frota) {
            if (veiculo.getId_Num() == id_num) {
                frota.remove(veiculo);
                System.out.println("Veículo removido: " + veiculo.marca + " " + veiculo.modelo);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Veículo não encontrado.");
        }
    }

    public void listarCarros(List<VeiculosEletricos> frota) {
        if (frota.isEmpty()) {
            System.out.println("Nenhum veículo na frota.");
        } else {
            System.out.println("Veículos da frota:");
            for (VeiculosEletricos veiculos : frota) {
                System.out.println("ID: " + veiculos.id_num + "| Marca: " + veiculos.marca + "| Modelo: " + veiculos.modelo + "| Ano de fabricação: " + veiculos.ano_fab + "| Capacidade total da bateria: " + veiculos.cap_total_bat + "| Autonomia máxima: " + veiculos.aut_max);
            }
        }
    }
    
    public double getLimiteManutencao() {
        return 10000; 
    }
    public double getVidaUtilBateria() {
        
        return (cargaAtual / cap_total_bat) * 100; 
    }

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

    public double getQuilometragem() {
        return quilometragem;
    }
}
