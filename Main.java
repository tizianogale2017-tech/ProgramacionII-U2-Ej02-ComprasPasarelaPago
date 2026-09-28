package Ejercicio2_comprasPasarelaPago;

public class Main {
    public static void main(String[] args) {
        PasarelaDePagos pasarela = new PasarelaDePagos();
        CarritoDeCompras carrito = new CarritoDeCompras(pasarela);
        carrito.agregarProducto("Teclado mecánico", 45000.0);
        carrito.agregarProducto("Mouse inalámbrico", 18000.0);

        Tarjeta valida = new Tarjeta("4111111111111111", "Laura Gómez");
        carrito.pagar(valida);

        System.out.println();
        carrito.agregarProducto("Monitor 24 pulgadas", 150000.0);
        Tarjeta invalida = new Tarjeta("1234", "Laura Gómez");
        carrito.pagar(invalida);
    }
}
