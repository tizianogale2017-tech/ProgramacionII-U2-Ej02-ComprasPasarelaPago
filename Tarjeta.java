package Ejercicio2_comprasPasarelaPago;

public class Tarjeta {
    private String numero;
    private String titular;

    public Tarjeta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}
