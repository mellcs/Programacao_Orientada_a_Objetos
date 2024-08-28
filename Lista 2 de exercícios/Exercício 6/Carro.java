public class Carro {
    String marca;
    String modelo;
    int ano;
    int kilometragem;

    // Construtor para inicializar os atributos do carro
    public Carro(String marca, String modelo, int ano, int kilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
    }

    // Método para definir uma nova quilometragem total
    public void alterarKilometragem(int novaKilometragem) {
        if (novaKilometragem >= kilometragem) {
            kilometragem = novaKilometragem;
        }
    }

    // Método sobrecarregado para adicionar a quilometragem de uma viagem
    public void alterarKilometragemPorViagem(int quilometragemViagem) {
        if (quilometragemViagem > 0) {
            kilometragem += quilometragemViagem;
        }
    }
}
