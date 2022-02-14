package semana;

import java.util.Arrays;
import java.util.Scanner;

public class Dias {//Clase que se encarga del manejo de los días
    private static Scanner scanner;
    private static String dia;
    private static String[] diasDeLaSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
    
    public static void obtenerDiaLaboral() {//Punto 8
        scanner = new Scanner(System.in);
        System.out.println("A continuación se le solicitará un día de la semana para evaluar si es " +
        "dia laboral o no");
        System.out.println("Ingrese el día de la semana por favor");
        dia = scanner.nextLine();

        while (!esUnDiaDeLaSemana(dia)){
            System.out.println("Esto no es un día de la semana válido, recuerde que los días " + 
                "de la semana son los siguientes: " + Arrays.toString(diasDeLaSemana));
            dia = scanner.nextLine();
        };

        switch (dia.toLowerCase()) {
            case "sabado":
                System.out.println("Este día NO es laboral");
                break;
            case "domingo":
                System.out.println("Este día NO es laboral");
                break;
            default:
                System.out.println("Este día es laboral");
                break;
        }

        scanner.close();
    }

    private static boolean esUnDiaDeLaSemana(String nombre) {
        return Arrays.stream(diasDeLaSemana).anyMatch((dia) -> dia.equals(nombre.toLowerCase()));
    }
}
