package Principal;

import ConectionApi.ConexionApi;
import ConectionApi.Divisa;

public class Main {
    public static void main(String[] args) {
        Divisa divisa;
        ConexionApi cambioDivisa = new ConexionApi();


        int monedaInicialIndex = Menu.mostrarMenuSeleccion("Seleccione su moneda inicial");
        int monedaAConvertirIndex = Menu.mostrarMenuSeleccion("Seleccione la moneda a la que desea convertir");
        double cantidad = Menu.solicitarCantidad();

        String monedaInicial = Menu.obtenerCodigoMoneda(monedaInicialIndex);
        String monedaAConvertir = Menu.obtenerCodigoMoneda(monedaAConvertirIndex);

        // Llamar a la API para la conversión de divisas
        Divisa resultado = cambioDivisa.convertirDivisa(monedaInicial, monedaAConvertir, cantidad);

        System.out.println("La conversion de " + cantidad +" " +  monedaInicial + " a " + monedaAConvertir);
        System.out.println("es igual a: " + resultado.conversion_result());
    }

}
