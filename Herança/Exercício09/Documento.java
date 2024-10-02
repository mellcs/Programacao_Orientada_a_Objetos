//Crie uma classe Documento com atributos titulo e conteudo. 
//Em seguida, crie uma subclasse Artigo que adicione o atributo autor. 
//Instancie um objeto da subclasse e manipule os atributos sem usar modificadores de acesso (public, private, protected).

public class Documento {
	String titulo;
	String conteudo;
	
	public Documento (String titulo, String conteudo){
	    this.titulo = titulo;
	    this.conteudo = conteudo;
	}
}
