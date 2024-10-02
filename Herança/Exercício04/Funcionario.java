//Crie uma superclasse Funcionario com um atributo protegido salario. 
//Crie uma subclasse Gerente que inicialize esse atributo no construtor da subclasse. 
//Em seguida, crie um objeto de Gerente e atribua um valor ao atributo salario da superclasse.

public class Funcionario {
	protected double salario;
	
	public Funcionario (double salario){
	    this.salario = salario;
	}
	
	public void exibir(){
	    System.out.println("Salário: " + salario);
	}
}
