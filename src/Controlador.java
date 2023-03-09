import java.util.List;

public class Controlador {
    private Modelo modelo;
    private VistaInterface vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void realizarCompra() {
        String empanada = vista.obtenerEmpanada();
        double precio = modelo.obtenerPrecio(empanada);
        vista.mostrarPrecio(precio);

        int cantidad = vista.obtenerCantidad();
        double total = precio * cantidad;

        String compra = cantidad + " empanadas de " + empanada + " por $" + total;
        modelo.agregarCompra(compra);
        vista.mostrarCompra(compra);
    }

    public void mostrarCompras() {
        List<String> compras = modelo.obtenerCompras();
        vista.mostrarCompras(compras);
    }
}





