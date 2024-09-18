public class Professores{
    private String nome;
    private String especialidade;
    
    //construtor inicializa.
    public Professores(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public String getNome(){//LEVA TIPO 
        return nome;
    }
    
    public void setNome(String nome){//TIPO É VOID
        this.nome = nome;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public void exibirInfo(){//não leva dentro
        System.out.println("Nome do professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
    }
}
