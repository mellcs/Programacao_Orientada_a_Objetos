import java.util.ArrayList;
import java.util.List;

class Viagem {
    private VeiculoEletrico veiculo;
    private double distancia;
    private String destino;
    private List<Recarga> recargas;

    public Viagem(VeiculoEletrico veiculo, double distancia, String destino) {
        this.veiculo = veiculo;
        this.distancia = distancia;
        this.destino = destino;
        this.recargas = new ArrayList<>();
    }

    public void adicionarRecarga(Recarga recarga) {
        recargas.add(recarga);
    }

    public VeiculoEletrico getVeiculo() {
        return veiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public String getDestino() {
        return destino;
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    public void iniciarViagem() {
        System.out.println("Iniciando a viagem com o veículo " + veiculo.getIdNum() + " para " + destino);
        double distanciaRestante = distancia;

        while (distanciaRestante > 0) {
            if (veiculo.getAutonomia() <= 0) {
                System.out.println("A autonomia do veículo acabou. É necessário recarregar.");
                break;
            }

            
            double distanciaPercorrida = Math.min(veiculo.getAutonomia(), distanciaRestante);
            distanciaRestante -= distanciaPercorrida;
            veiculo.setAutonomia(veiculo.getAutonomia() - distanciaPercorrida);
            System.out.println("Percorrida: " + distanciaPercorrida + " km, Autonomia restante: " + veiculo.getAutonomia() + " km.");

            if (distanciaRestante > 0 && veiculo.getAutonomia() < 20) { 
                if (!recarregarPosto()) {
                    System.out.println("Viagem não pode ser concluída devido à falta de vagas nos eletropostos.");
                    break;
                }
            }
        }

        if (distanciaRestante == 0) {
            System.out.println("Fim da viagem!");
        }
    }

    private boolean recarregarPosto() {
        // Aqui você deve usar os seus eletropostos existentes
        List<Eletroposto> eletropostos = obterEletropostos(); 

        for (Eletroposto posto : eletropostos) {
            if (posto.verificarVaga()) {
                posto.reservarVaga();
                System.out.println("Vaga confirmada no " + posto.getLocal());
                double carga = 20; 
                veiculo.recarregar(carga);
                adicionarRecarga(new Recarga(posto, carga, "2024-10-20 10:00")); 
                System.out.println("Recarregado: " + carga + " km, Autonomia atual: " + veiculo.getAutonomia() + " km.");
                return true;
            }
        }

        System.out.println("Não há vagas disponíveis em nenhum eletroposto.");
        return false;
    }
