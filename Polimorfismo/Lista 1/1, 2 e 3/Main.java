import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void emitirSom(Animal animal){
        animal.som();
    }
    
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        
        /*Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        Animal animalGenerico = new Animal();

        emitirSom(meuCachorro);
        emitirSom(meuGato);
        emitirSom(animalGenerico);**/
        
        animais.add(new Cachorro());
        
        for (Animal animal : animais) {
            animal.som();
        }
    }
}
