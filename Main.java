package app_Banco;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear banco
        Banco banco = new Banco();

        // Crear clientes y cuentas
        banco.crearClientes();

        // Mostrar estado inicial
        banco.mostrarEstadoBanco();

        // Simular una transferencia
        banco.simularTransferencia();

        // Mostrar estado después de la simulación y actualización mensual
        banco.mostrarEstadoBanco();
    }

}
