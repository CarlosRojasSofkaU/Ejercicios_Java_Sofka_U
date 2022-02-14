package impuestos;

import java.util.Scanner;

public class IVA {//Clase que se encarga de cálcular el Iva de un valor ingresado
    private static Scanner scanner;
    private static double TASA_IVA = 0.21;
    private static double precio;

    public static void mostrarPrecioConImpuestos() {// Punto 4
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará el precio de un producto para " + 
            "entregar su valor con impuestos");
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("El precio del producto con IVA  es: $" + obtenerPrecioConIVA(precio));
        scanner.close();
    }

    private static double obtenerPrecioConIVA(double precio) {
        return (1 + TASA_IVA) * precio;
    }
}
