public class Quadrado implements FormaGeometrica{
    protected double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(lado, 2);
    }
}
