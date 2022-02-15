package menudegestion;

import java.util.Scanner;

public class GestionCinematografica {
    private static Scanner scanner;
    private static int opcion;

    public static void menuGestion(){
        scanner = new Scanner(System.in);
        boolean bandera;
        System.out.println("A continuación se le desplegará un menú de opciones, seleccione la que desee");
        desplegarMenu();
        do{
            try {
                System.out.println("por favor ingrese un número");
                opcion =Integer.parseInt(scanner.nextLine());
                bandera=true;
            }
            catch (NumberFormatException e){
                bandera=false;
            }
        }
        while (!bandera);
        switch (opcion){
            case 1:
                System.out.println("SELECCIONÓ 1");
                menuGestion();
                break;
            case 2:
                System.out.println("SELECCIONÓ 2");
                menuGestion();
                break;
            case 3:
                System.out.println("SELECCIONÓ 3");
                menuGestion();
                break;
            case 4:
                System.out.println("SELECCIONÓ 4");
                menuGestion();
                break;
            case 5:
                System.out.println("SELECCIONÓ 5");
                menuGestion();
                break;
            case 6:
                System.out.println("SELECCIONÓ 6");
                menuGestion();
                break;
            case 7:
                System.out.println("SELECCIONÓ 7");
                menuGestion();
                break;
            case 8:
                System.out.println("SELECCIONÓ 8 - SALIENDO DEL MENU");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
                menuGestion();
                break;
        }
    }

    public static void desplegarMenu(){
        System.out.println("****** GESTIÓN CINEMATOGRÁFICA ******");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");


    }
}
