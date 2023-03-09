import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Modelo {
    private Map<String, Double> precios = new HashMap<>();
    private List<String> empanadas = new ArrayList<>();
    private List<String> compras = new ArrayList<>();

    public Modelo() {
        precios.put("carne", 2.0);
        precios.put("pollo", 2.5);
        precios.put("jamón y queso", 3.0);

        empanadas.add("carne");
        empanadas.add("pollo");
        empanadas.add("jamón y queso");
    }

    public double obtenerPrecio(String empanada) {
        return precios.getOrDefault(empanada, 0.0);
    }

    public List<String> obtenerEmpanadas() {
        return empanadas;
    }

    public void agregarCompra(String compra) {
        compras.add(compra);
    }

    public List<String> obtenerCompras() {
        return compras;
    }
}
