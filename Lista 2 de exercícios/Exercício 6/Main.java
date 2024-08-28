public class Main {
    public static void main(String[] args) {
        // Criando um carro
        Carro carro = new Carro("Toyota", "Corolla", 2020, 20000);

        // Exibindo a quilometragem atual
        System.out.println("Quilometragem inicial: " + carro.kilometragem);

        // Alterando a quilometragem total
        carro.alterarKilometragem(25000);
        System.out.println("Quilometragem após atualização: " + carro.kilometragem);

        // Adicionando quilometragem percorrida em uma viagem
        carro.alterarKilometragemPorViagem(500);
        System.out.println("Quilometragem após viagem: " + carro.kilometragem);
    }
}
