package Ejercicio2_comprasPasarelaPago;

public class PasarelaDePagos {
    private static final double LIMITE_POR_OPERACION = 500000.0;

    public boolean procesarPago(double monto, Tarjeta tarjeta) {
        boolean numeroValido = tarjeta.getNumero().matches("\\d{16}");
        boolean montoValido = monto > 0 && monto <= LIMITE_POR_OPERACION;
        return numeroValido && montoValido;
    }
}
