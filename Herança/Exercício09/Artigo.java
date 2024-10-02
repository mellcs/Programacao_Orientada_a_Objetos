//Crie uma classe Documento com atributos titulo e conteudo. 
//Em seguida, crie uma subclasse Artigo que adicione o atributo autor. 
//Instancie um objeto da subclasse e manipule os atributos sem usar modificadores de acesso (public, private, protected).

public class Artigo extends Documento{
    String autor;
    
    public Artigo(String titulo, String conteudo, String autor){
        super(titulo, conteudo);
        this.autor = autor;
    }
    
    public static void main(String[] args) {
        Artigo artigo = new Artigo("Aprendizado de Máquina", "Conteúdo sobre aprendizado de máquina.", "João Silva");
        
        System.out.println("Título: " + artigo.titulo);
        System.out.println("Conteúdo: " + artigo.conteudo);
        System.out.println("Autor: " + artigo.autor);

        artigo.titulo = "Machine Learning Avançado";
        artigo.conteudo = "Conteúdo atualizado sobre aprendizado de máquina.";
        artigo.autor = "Maria Oliveira";
        
        System.out.println("\nTítulo atualizado: " + artigo.titulo);
        System.out.println("Conteúdo atualizado: " + artigo.conteudo);
        System.out.println("Autor atualizado: " + artigo.autor);
    }
}
    
