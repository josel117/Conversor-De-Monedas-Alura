package Principal;

import java.util.Scanner;

public class Menu {

    private static final String[] MONEDAS = {
            "Dolar americano (USD)",
            "Peso Colombiano (COP)",
            "Peso Argentino (ARS)",
            "Peso Chileno (CLP)",
            "Real Brasileño (BRL)",
            "Bolivar Venezolano (VES)"
    };

    private static final String[] CODIGOS_MONEDAS = {"USD", "COP", "ARS",
            "CLP", "BRL", "VES"};

    public static int mostrarMenuSeleccion(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        for (int i = 0; i < MONEDAS.length; i++) {
            System.out.println((i + 1) + ". " + MONEDAS[i]);
        }
        System.out.println("******************************************");
        return scanner.nextInt() - 1;
    }

    public static double solicitarCantidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a convertir:");
        return scanner.nextDouble();
    }

    public static String obtenerCodigoMoneda(int indice) {
        return CODIGOS_MONEDAS[indice];
    }
}
