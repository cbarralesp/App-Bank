package app_Banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, Cuenta> cuentas = new HashMap<>();

    // Crear clientes y cuentas asociadas
    public void crearClientes() {
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678-9");
        Cliente cliente2 = new Cliente("María López", "98765432-1");

        // Crear cuentas
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("1001", 10000);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro("2001", 10000);

        // Asignar cuentas a clientes
        cliente1.setCuentaCorriente(cuentaCorriente1);
        cliente2.setCuentaAhorro(cuentaAhorro2);

        // Registrar clientes en el banco
        clientes.put(cliente1.getRut(), cliente1);
        clientes.put(cliente2.getRut(), cliente2);

        // Registrar cuentas en el banco
        cuentas.put(cuentaCorriente1.getNumeroCuenta(), cuentaCorriente1);
        cuentas.put(cuentaAhorro2.getNumeroCuenta(), cuentaAhorro2);
    }

    // Simula una transferencia entre cuentas
    public void simularTransferencia() {
        // Cliente Juan transfiere dinero a Cliente María
        CuentaCorriente cuentaOrigen = (CuentaCorriente) cuentas.get("1001");
        CuentaAhorro cuentaDestino = (CuentaAhorro) cuentas.get("2001");

        cuentaOrigen.transferir(200, cuentaDestino);
    }

    // Muestra el estado actual del banco (clientes y sus cuentas)
    public void mostrarEstadoBanco() {
        System.out.println("\nEstado actual del Banco:");
        for (Cliente cliente : clientes.values()) {
            System.out.println(cliente);
            cliente.mostrarCuentas();
        }
    }

}
