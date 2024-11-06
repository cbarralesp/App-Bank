package app_Banco;

public class Cliente {
    private String nombre;
    private String rut;
    private CuentaCorriente cuentaCorriente;
    private CuentaAhorro cuentaAhorro;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
        this.cuentaAhorro = cuentaAhorro;
    }

    // Mostrar información del cliente y sus cuentas
    public void mostrarCuentas() {
        if (cuentaCorriente != null) {
            System.out.println("Cuenta Corriente: " + cuentaCorriente);
            cuentaCorriente.mostrarHistorialTransacciones();
        }
        if (cuentaAhorro != null) {
            System.out.println("Cuenta Ahorro: " + cuentaAhorro);
            cuentaAhorro.mostrarHistorialTransacciones();
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " - RUT: " + rut;
    }
}

