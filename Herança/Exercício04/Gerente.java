//Crie uma superclasse Funcionario com um atributo protegido salario. 
//Crie uma subclasse Gerente que inicialize esse atributo no construtor da subclasse. 
//Em seguida, crie um objeto de Gerente e atribua um valor ao atributo salario da superclasse.

public class Gerente extends Funcionario {
    
    public Gerente (double salario){
        super(salario);
    }
    
    public void exibeer() {
        exibir();
    }
    
    public static void main(String[] args){
        Gerente gerente = new Gerente(1250.25);
        
        gerente.exibeer();
    }
    
}
