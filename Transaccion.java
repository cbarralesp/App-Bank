package app_Banco;

import java.time.LocalDateTime;

public class Transaccion {
    private double cantidad;
    private LocalDateTime fechaHora;
    private Cuenta cuentaAsociada;

    public Transaccion(double cantidad, Cuenta cuentaAsociada) {
        this.cantidad = cantidad;
        this.fechaHora = LocalDateTime.now();
        this.cuentaAsociada = cuentaAsociada;
    }

    @Override
    public String toString() {
        String tipo = (cantidad > 0) ? "Abono" : "Cargo";
        return tipo + " de " + Math.abs(cantidad) + " - Fecha: " + fechaHora + " - Cuenta: " + cuentaAsociada.getNumeroCuenta();
    }
}
