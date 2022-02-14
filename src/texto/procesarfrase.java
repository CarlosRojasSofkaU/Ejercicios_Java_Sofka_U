package texto;

import java.security.KeyRep.Type;
import java.util.HashMap;
import java.util.Scanner;

public class procesarfrase { //Clase que se encarga de los puntos que manejan Strings
    private static Scanner scanner;
    private static String fraseBase = "La sonrisa sera la mejor arma contra la tristeza";
    private static char caracterVacio = '\0';
    private static char caracterEspacio = ' ';

    public static void mostrarFraseModificada() { //Punto 9
        scanner = new Scanner(System.in);

        System.out.println("A continuación se solicitará una frase para unir a una que ya se tiene " +
            "como base que es modificada");
        System.out.println("Frase original: " + fraseBase);
        String fraseModificada = reemplazarTodoElTexto(fraseBase, 'a', 'e');
        System.out.println("Frase modificada: " + fraseModificada);
        
        System.out.println("Por favor ingrese una frase adicional para unir: ");

        String fraseDeUsuario = scanner.nextLine();
        
        System.out.println("La nueva frase es la siguiente: " + 
            fraseModificada + " " + fraseDeUsuario);

        scanner.close();
    }

    public static void mostrarFraseSinEspacios() { //Punto 10
        scanner = new Scanner(System.in);

        System.out.println("A continuación se solicitará una frase para eliminarle los espacios");
        System.out.println("Por favor ingrese la frase: ");

        String fraseDeUsuario = scanner.nextLine();
        
        System.out.println("La nueva frase sin espacios es: " + 
            reemplazarTodoElTexto(fraseDeUsuario, caracterEspacio, caracterVacio));

        scanner.close();
    }

    public static void mostrarLongitudYCantidadDeVocales(){ //Punto 11
        scanner = new Scanner(System.in);
        HashMap<Character, Integer> cantidadDeVocales = new HashMap<>();

        cantidadDeVocales.put('a', 0);
        cantidadDeVocales.put('e', 0);
        cantidadDeVocales.put('i', 0);
        cantidadDeVocales.put('o', 0);
        cantidadDeVocales.put('u', 0);

        System.out.println("A continuación se solicitará una frase para verificar su " +
            "longitud y cantidad de vocales");
        System.out.println("Por favor ingrese la frase: ");

        String fraseDeUsuario = scanner.nextLine();
        int logitudFrase = 0;

        while (logitudFrase < fraseDeUsuario.length()) {
            char posibleLlave = fraseDeUsuario.charAt(logitudFrase);
            if (cantidadDeVocales.containsKey(posibleLlave))
                cantidadDeVocales.replace(posibleLlave, cantidadDeVocales.get(posibleLlave) + 1);
            logitudFrase++;
        }

        System.out.println("La longitud de la frase es de " + logitudFrase + " caracteres");
        System.out.println("La cantidad de vocales que tiene son: ");
        for (Character vocal: cantidadDeVocales.keySet()) {
            int cantidad = cantidadDeVocales.get(vocal);
            System.out.println(vocal + " : " + cantidad);
        }

        scanner.close();
    }

    public static void mostrarDiferenciasOIgualdadEntreFrases(){ //Punto 12
        scanner = new Scanner(System.in);
        System.out.println("A continuación se solicitará 2 palabras para verificar si son iguales " +
                "o si tienen diferencias (sensibilidad a las mayúsculas)");
        System.out.println("Por favor ingrese la primera palabra: ");

        String primeraPalabra = scanner.nextLine();

        System.out.println("Por favor ingrese la segunda palabra: ");

        String segundaPalabra = scanner.nextLine();

        if(primeraPalabra.equals(segundaPalabra)){
            System.out.println("Las palabras son iguales");
        }
        else{
            String palabraTemporal1 = primeraPalabra;
            String palabraTemporal2 = segundaPalabra;
            String igualdades = "";
            int tamañoFraseMenor = 0;

            if(primeraPalabra.length()<segundaPalabra.length()){tamañoFraseMenor=primeraPalabra.length();}
            else{tamañoFraseMenor=segundaPalabra.length();}

            for (int i = 0; i < tamañoFraseMenor; i++) {
                char caracterEvaluado = segundaPalabra.charAt(i);
                if((primeraPalabra.charAt(i)==caracterEvaluado)&&(segundaPalabra.charAt(i)==caracterEvaluado)){
                    igualdades += caracterEvaluado;
                    if (i==0){
                        primeraPalabra=" "+primeraPalabra.substring(i+1);
                        segundaPalabra=" "+segundaPalabra.substring(i+1);
                    }
                    else if((primeraPalabra.length()==i) || (segundaPalabra.length()==i)){
                        primeraPalabra=primeraPalabra.substring(0,i-1)+" ";
                        segundaPalabra=segundaPalabra.substring(0,i-1)+" ";
                    }
                    else{
                        primeraPalabra=primeraPalabra.substring(0,i)+" "+primeraPalabra.substring(i+1);
                        segundaPalabra=segundaPalabra.substring(0,i)+" "+segundaPalabra.substring(i+1);
                    }
                }
                else{igualdades +="#";}
            }
            System.out.println("las igualdades entre las palabras se denotan por un espacio y las diferencias son las siguientes");
            System.out.println("Palabras iniciales: "+palabraTemporal1+" | "+palabraTemporal2);
            System.out.println("Letras diferentes:  "+primeraPalabra+" | "+segundaPalabra);
            System.out.println("Letras idénticas entre palabras: "+igualdades);
        }
        scanner.close();
    }

    private static String reemplazarTodoElTexto(String frase, char antigua, char nueva) {
        String nuevoTexto = "";
        for (int i = 0; i < frase.length(); i++) {
            if (antigua == frase.charAt(i))
                nuevoTexto += nueva;
            else
                nuevoTexto += frase.charAt(i);
        }
        return nuevoTexto;
    }

}
