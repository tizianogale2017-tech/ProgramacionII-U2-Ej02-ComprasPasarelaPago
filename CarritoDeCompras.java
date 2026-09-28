package Ejercicio2_comprasPasarelaPago;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<String> productos = new ArrayList<>();
    private double montoTotal;
    private PasarelaDePagos pasarela;

    public CarritoDeCompras(PasarelaDePagos pasarela) {
        this.pasarela = pasarela;
    }

    public void agregarProducto(String nombre, double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
        productos.add(nombre);
        montoTotal += precio;
    }

    public boolean pagar(Tarjeta tarjeta) {
        System.out.println("Carrito: " + productos + " - Total: $" + montoTotal);
        boolean aprobado = pasarela.procesarPago(montoTotal, tarjeta);
        if (aprobado) {
            System.out.println("Pago aprobado para " + tarjeta.getTitular() + ". ¡Gracias por su compra!");
            productos.clear();
            montoTotal = 0;
        } else {
            System.out.println("Pago rechazado para " + tarjeta.getTitular() + ". La compra no se realizó.");
        }
        return aprobado;
    }
}
