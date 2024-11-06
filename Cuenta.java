package app_Banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {
    protected double saldo;
    protected String numeroCuenta;
    protected List<Transaccion> historialTransacciones;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.historialTransacciones = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Depositar dinero en la cuenta
    public void depositar(double monto) {
        saldo += monto;
        historialTransacciones.add(new Transaccion(monto, this));
    }

    // Transferir dinero de una cuenta a otra
    public void transferir(double monto, Cuenta destino) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.saldo += monto;
            historialTransacciones.add(new Transaccion(-monto, destino)); // Cargo para la cuenta origen
            destino.historialTransacciones.add(new Transaccion(monto, this)); // Abono para la cuenta destino
        } else {
            System.out.println("Saldo insuficiente para la transferencia.");
        }
    }

    // Método abstracto para actualizar el saldo mensual
    public abstract void actualizarSaldoMensual();

    // Mostrar historial de transacciones
    public void mostrarHistorialTransacciones() {
        System.out.println("Historial de Transacciones:");
        for (Transaccion t : historialTransacciones) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Cuenta " + numeroCuenta + " - Saldo: " + saldo;
    }
}
