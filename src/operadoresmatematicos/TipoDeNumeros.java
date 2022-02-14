package operadoresmatematicos;

public class TipoDeNumeros {// Clase que se encarga de determinar el tipo de ciertos números
    private static int contador;
    private static String mensajeBasePares = "Los números Pares son: ";
    private static String mensajeBaseImpares = "Los números Impares son: ";
    private static String mensajePares;
    private static String mensajeImpares;
    public static void mostrarNumerosParesImparesWhile() {//Punto 5
        contador = 1;
        mensajePares = mensajeBasePares;
        mensajeImpares = mensajeBaseImpares;

        System.out.println("A continuación se mostrará los números pares e impares del 1 al 100");
        while (contador < 101) {
            if (esPar(contador))
                mensajePares = mensajePares + contador + ", ";
            else
                mensajeImpares = mensajeImpares + contador + ", ";
            contador++;
        }
        mensajePares = mensajePares.substring(0, mensajePares.length() - 2);
        mensajeImpares = mensajeImpares.substring(0, mensajeImpares.length() - 2);

        System.out.println(mensajePares);
        System.out.println(mensajeImpares);
    }

    public static void mostrarNumerosParesImparesFOR() {//Punto 6
        mensajePares = mensajeBasePares;
        mensajeImpares = mensajeBaseImpares;

        System.out.println("A continuación se mostrará los números pares e impares del 1 al 100");
        for (contador = 1; contador < 101; contador++) {
            if (esPar(contador))
                mensajePares = mensajePares + contador + ", ";
            else
                mensajeImpares = mensajeImpares + contador + ", ";
        }
        mensajePares = mensajePares.substring(0, mensajePares.length() - 2);
        mensajeImpares = mensajeImpares.substring(0, mensajeImpares.length() - 2);

        System.out.println(mensajePares);
        System.out.println(mensajeImpares);
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
