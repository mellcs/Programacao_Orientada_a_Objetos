public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 85000.00);
      
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Preço: " + carro1.getPreco());

        carro1.setPreco(-5000.00);  

        carro1.setPreco(90000.00);
        System.out.println("Novo Preço: " + carro1.getPreco());
    }
}
