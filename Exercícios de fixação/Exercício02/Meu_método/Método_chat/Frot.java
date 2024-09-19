import java.util.ArrayList;
import java.util.HashMap;

public class Frot {
    private ArrayList<Via> vList;
    private HashMap<String, V> vMap;  // Mapa para acesso rápido por placa

    public Frot() {
        vList = new ArrayList<>();
        vMap = new HashMap<>();
    }

    public void addV(V v) {
        vMap.put(v.getPl(), v);
    }

    public void regVia(String pl, M m, String org, String des, double dis) {
        V v = vMap.get(pl);
        if (v != null) {
            Via newVia = new Via(v, m, org, des, dis);
            vList.add(newVia);
        } else {
            System.out.println("V não encontrado.");
        }
    }

    public void listViasByPl(String pl) {
        for (Via v : vList) {
            if (v.getV().getPl().equals(pl)) {
                System.out.println(v.getDesc());
            }
        }
    }

    public double calcDisTot() {
        return vList.stream().mapToDouble(Via::getDis).sum();  // Uso de stream para otimizar
    }
}
