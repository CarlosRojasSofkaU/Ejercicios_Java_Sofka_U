package fundamentoclases;

import java.util.Scanner;

public class ProcesarPersona {
    private static Scanner scanner;

    public static void mostrarEjercicio() {
        scanner = new Scanner(System.in);

        System.out.println("A continuación se le solicitará los atributos para contruir una Persona");
        System.out.println("Por favor ingrese un nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Por favor ingrese una edad: ");
        int edad = scanner.nextInt();

        System.out.println("Por favor ingrese el genero (H hombre, M mujer): ");
        String cadenaSexo = scanner.next();
        char sexo = cadenaSexo.charAt(0);

        System.out.println("Por favor ingrese el peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Por favor ingrese la altura (en m): ");
        double altura = scanner.nextDouble();

        Persona usuario = new Persona(nombre, edad, sexo, peso, altura);
        Persona usuarioSinPesoYAltura = new Persona(nombre, edad, sexo);
        Persona usuarioPorDefecto = new Persona();
        usuarioPorDefecto.definirNombre("Perenceja");
        usuarioPorDefecto.definirEdad(27);
        usuarioPorDefecto.definirSexo('M');
        usuarioPorDefecto.definirAltura(1.74);
        usuarioPorDefecto.definirPeso(87);

        Persona[] personas = {usuario, usuarioSinPesoYAltura, usuarioPorDefecto};

        System.out.println("El IMC de cada uno es:");
        for (Persona persona : personas) {
            int IMC = persona.calcularIMC();
            if (IMC == Persona.IMC_BAJO_PESO) {
                System.out.println("La persona tiene un peso bajo");
            } else if (IMC == Persona.IMC_NORMAL) {
                System.out.println("La persona tiene un peso normal");
            } else {
                System.out.println("La persona tiene sobrepeso");
            }
        }

        System.out.println("Las edades de cada uno:");
        for (Persona persona : personas) {
            if (persona.esMayorDeEdad())
                System.out.println("La persona es mayor de edad");
            else
                System.out.println("La persona es un menor");
        }

        System.out.println("Mostrar información completa de las personas:");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

        scanner.close();
    }
}
