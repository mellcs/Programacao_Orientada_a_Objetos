import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CarroCompacto extends VeiculosEletricos {

    public CarroCompacto(int id_num, String marca, String modelo, int ano_fab, double cap_total_bat, double aut_max) {
        super(id_num, marca, modelo, ano_fab, cap_total_bat, aut_max);
    }

    public void cadastrar(List<VeiculosEletricos> frota) {
        addCarro(frota);  
    }
}
