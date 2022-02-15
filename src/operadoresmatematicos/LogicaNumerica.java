package operadoresmatematicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicaNumerica {//Clase que se encarga de realizar operaciones de lógica numérica
    private static double primerNumero;
    private static double segundoNumero;
    private static double mayorNumero;
    private static double numeroPositivo;
    private static double numeroInicioSaltos;
    private static Scanner scanner;
    public static void mostrarNumMayor() {//Punto 1 y 2
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará dos números y se evaluará cual es mayor");
        System.out.println("Ingrese el primer número: ");
        primerNumero = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        segundoNumero = scanner.nextDouble();
        if (primerNumero == segundoNumero)
            System.out.println("Los números son iguales.");
        else {
            mayorNumero = primerNumero > segundoNumero? primerNumero:segundoNumero;
            System.out.println("El mayor número es: " + mayorNumero);
        }
        scanner.close();
    }

    public static void mostrarNumeroPositivo() {//Punto 7
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará un número y se evaluará si es positivo");

        do {
            System.out.println("Ingrese el número por favor (solo son válidos los números " + 
                "positivos): ");
            numeroPositivo = scanner.nextDouble();
        } while (numeroPositivo < 0);

        System.out.println("El número ingresado es: " + numeroPositivo);
        scanner.close();
    }

    public static List<Double> mostrarNumerosEnSaltosDeDos(){
        numeroInicioSaltos=0;
        List<Double> arrayDeSaltos = new ArrayList<Double>();
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará un número y se mostrarán los números"+
                " desde este hasta 1000 en saltos de 2");
        System.out.println("Ingrese el número desde donde se iniciará: ");
        try {
            numeroInicioSaltos = scanner.nextDouble();
        }
        catch (Exception e){
            System.out.println("Por favor ingrese un número válido");
            mostrarNumerosEnSaltosDeDos();
        }
        while (numeroInicioSaltos>1000){
            System.out.println("Por favor ingrese un número menor a 1000");
            mostrarNumerosEnSaltosDeDos();
        }
        for (double i = numeroInicioSaltos; i <= 1000; i=i+2) {
            arrayDeSaltos.add(i);
        }
        //System.out.println(arrayDeSaltos);
        return arrayDeSaltos;

    }
}
