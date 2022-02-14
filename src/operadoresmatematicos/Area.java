package operadoresmatematicos;

import java.util.Scanner;

public class Area {//Clase que se encarga del área de figuras geométricas
    private static double radio;
    private static Scanner scanner;

    public static void mostrarCircunferencia() {//Punto 3
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará el radio de una circunferencia " + 
            "para calcular su área");
        System.out.println("Ingrese el radio: ");
        radio = Double.parseDouble(scanner.nextLine());
        System.out.println("El área del circulo es: " + retornarAreaCircunferencia(radio));
        scanner.close();
    }

    private static double retornarAreaCircunferencia(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
