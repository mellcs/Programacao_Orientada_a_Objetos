import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Viagens {
    protected Eletropostos eletropostos;
    protected double quilometragem; 
    protected String destino;
    protected VeiculosEletricos veiculo;
    protected Motoristas motorista; 
    protected List<Recarga> recargas;
    protected int num_Id;


    public Viagens(double quilometragem, String destino, int num_Id, Eletropostos eletropostos, List<Recarga> recargas) {
        this.quilometragem = quilometragem; 
        this.destino = destino;
        this.recargas = new ArrayList<>();
        this.num_Id = num_Id;
        this.eletropostos = eletropostos;
        this.recargas = recargas;
        
    }

    public void comecarViagem(List<VeiculosEletricos> frota, List<Eletropostos> eletropostosCadastrados, List<Motoristas> motoristasCadastrados, List<Viagens> viagens) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Com qual carro você vai realizar a viagem? Insira seu id: ");
        for (VeiculosEletricos v : frota) {
            System.out.println("ID: " + v.getId_Num() + " | Marca: " + v.getMarca() + " | Modelo: " + v.getModelo());
        }

        int carroId = scanner.nextInt();
        scanner.nextLine();

        boolean carroEncontrado = false;
        for (VeiculosEletricos v : frota) {
            if (v.getId_Num() == carroId) {
                veiculo = v;
                carroEncontrado = true;
                break;
            }
        }

        if (!carroEncontrado) {
            System.out.println("Carro informado não está disponível.");
            return;
        }

        System.out.println("Qual motorista fará a viagem? Insira sua identificação: ");
        for (Motoristas m : motoristasCadastrados) {
            System.out.println("Nome: " + m.getNome() + " | Identificação: " + m.getNumId() + " | Número da carteira: " 
                + m.getNumCarteira() + " | Nível de experiência: " + m.getExperiencia());
        }
        
        int motoristaId = scanner.nextInt();
        scanner.nextLine();

        boolean motoristaEncontrado = false;
        for (Motoristas m : motoristasCadastrados) {
            if (m.getNumId() == motoristaId) {
                motorista = m;
                motoristaEncontrado = true;
                break;
            }
        }

        if (!motoristaEncontrado) {
            System.out.println("Motorista informado não está cadastrado.");
            return;
        }

        System.out.println("Insira a quilometragem da viagem: ");
        double quilometragemViagem = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira o destino da viagem: ");
        String destino = scanner.nextLine();

        // Verificar se o veículo possui autonomia suficiente para a viagem
        if (quilometragemViagem <= veiculo.getAut_Max()) {
            // Consome a carga proporcional à quilometragem
            double cargaConsumida = quilometragemViagem * (veiculo.getCap_Total_Bat() / veiculo.getAut_Max());
            veiculo.consumirCarga(cargaConsumida); // Chama o método para consumir carga
            atualizarAutonomiaVeiculo(quilometragemViagem);
            System.out.println("Viagem a " + destino + " concluída! Autonomia atualizada para: " + veiculo.getAut_Max() + " km.");
        } else {
            System.out.println("A autonomia do veículo é insuficiente para essa viagem.");
            planejarParadas(eletropostosCadastrados);
        }

        this.destino = destino;
        this.quilometragem = quilometragemViagem;
        viagens.add(this); 
        motorista.adicionarViagem(this); 
        System.out.println("Viagem registrada para o motorista: " + motorista.getNome() + " com destino " + destino);
    }

    public void planejarParadas(List<Eletropostos> eletropostosCadastrados) {
        double autonomiaRestante = veiculo.getAut_Max();

        if (quilometragem > autonomiaRestante) {
            System.out.println("Autonomia insuficiente para a viagem completa. Planejando paradas...");

            for (Eletropostos posto : eletropostosCadastrados) {
                if (posto.getVagas() > 0) {
                    System.out.println("Parada planejada no eletroposto em " + posto.getLocal() +
                                       "| Vagas disponíveis: " + posto.getVagas() +
                                       "| Tempo de carga: " + posto.getTempoCarga() + " horas");

                    autonomiaRestante += veiculo.getCap_Total_Bat();

                    if (autonomiaRestante >= quilometragem) {
                        System.out.println("Paradas planejadas concluídas. Autonomia suficiente para a viagem.");
                        atualizarAutonomiaVeiculo(quilometragem);
                        return;
                    }
                }
            }
            System.out.println("Nenhum eletroposto disponível com vagas. Recalcule sua rota ou aguarde disponibilidade.");
        } else {
            System.out.println("Autonomia suficiente para a viagem.");
            atualizarAutonomiaVeiculo(quilometragem);
        }
    }

    public void atualizarAutonomiaVeiculo(double quilometragemPercorrida) {
        double novaAutonomia = veiculo.getAut_Max() - quilometragemPercorrida;
        veiculo.setAut_Max(novaAutonomia);
    }

    public void registrarRecarga(Eletropostos eletroposto, double quantidade, Viagens viagem) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = formato.format(new Date()); 

        Recarga novaRecarga = new Recarga(eletroposto, quantidade, dataFormatada, num_Id); 
        recargas.add(novaRecarga); 
        viagem.adicionarRecarga(novaRecarga); 

        // Adiciona a carga ao veículo
        veiculo.adicionarCarga(quantidade); // Chama o método para adicionar carga

        System.out.println("Recarga registrada: " + novaRecarga.getQuantidadeRecarga() + " kW em " + novaRecarga.getDataHora());
    }
    
    public VeiculosEletricos getVeiculoUsado() {
        return veiculo;
    }
    public String getDataHora() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.format(new Date()); // ou a data que você usar para registrar a viagem
    }
    
    public Eletropostos getEletroposto() {
        return eletropostos;
    }

    // Getters e Setters
    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Motoristas getMotorista() {
        return motorista;
    }

    public void setMotorista(Motoristas motorista) {
        this.motorista = motorista;
    }
    
    public VeiculosEletricos getVeiculo() {
        return veiculo; 
    }

    public double getDistancia() {
        return quilometragem; 
    }

    public List<Recarga> getRecarga() {
        return recargas;
    }

    public void adicionarRecarga(Recarga recarga) {
        recargas.add(recarga); 
    }
    
    public int getNum_Id() {
        return num_Id;
    }
}
