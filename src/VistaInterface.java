import java.util.List;

public interface VistaInterface {

    public String obtenerEmpanada();

    public int obtenerCantidad();

    public void mostrarPrecio(double precio);

    public void mostrarCompra(String compra);

    public void mostrarCompras(List<String> compras);
}
