package app_Banco;

public class CuentaCorriente extends Cuenta {
    private static final double COSTO_MANTENCION = 1000;

    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void actualizarSaldoMensual() {
        saldo -= COSTO_MANTENCION;
    }

    @Override
    public void transferir(double monto, Cuenta destino) {
        super.transferir(monto + (monto * 0.05), destino); // Agregar 5% de administración
    }
}
