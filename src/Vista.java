import java.util.List;
import java.util.Scanner;

public class Vista implements VistaInterface {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerEmpanada() {
        System.out.println("Qué empanada desea comprar?");
        return scanner.nextLine();
    }

    public int obtenerCantidad() {
        System.out.println("Cuántas empanadas desea comprar?");
        return scanner.nextInt();
    }

    public void mostrarPrecio(double precio) {
        System.out.println("El precio de la empanada es: $" + precio);
    }

    public void mostrarCompra(String compra) {
        System.out.println("Compra realizada: " + compra);
    }

    public void mostrarCompras(List<String> compras) {
        System.out.println("Compras realizadas:");
        for (String compra : compras) {
            System.out.println(compra);
        }
    }
}
