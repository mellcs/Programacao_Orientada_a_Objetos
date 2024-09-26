public class Carro extends Veiculo{
    protected int numPortas;
    
    public int getNumPortas(){
        return portas;
    }
    
    public void setNumPortas(int portas){
        this.portas = portas;
    }
    
    public void atribuirPortas(){
        portas = 4;
    }
    
    public void mostrar(){
        System.out.println("Número de portas:" + numPortas);
    }
    
    public static void main(String[] args){
        Carro carror = new Carro();
        
        carror.atribuirPortas();
        carror.mostrar();
        carror.atribuir();
        carror.exibir();
    }
}
