package app_Banco;

public class CuentaAhorro extends Cuenta {
    private static final double RENTABILIDAD = 0.02; // 2% de rentabilidad

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void actualizarSaldoMensual() {
        // Aquí podríamos sumar los últimos 5 depósitos, pero por simplicidad, solo mostramos rentabilidad
        saldo += saldo * RENTABILIDAD;
    }

    @Override
    public void transferir(double monto, Cuenta destino) {
        double montoConPenalizacion = monto - (monto * 0.05); // Restar 5% de penalización
        super.transferir(montoConPenalizacion, destino);
    }
}
