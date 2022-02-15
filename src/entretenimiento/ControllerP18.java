package entretenimiento;

import java.rmi.ServerError;
import java.util.Arrays;
import java.util.Random;

public class ControllerP18 {
    public static void probarPunto18(){
        int series_entregadas=0;
        int videojuegos_entregados=0;
        int conteo;
        int mayor;

        Serie ser1 = new Serie();
        Serie ser2 = new Serie("La casa de papel", "Álex Pina");
        Serie ser3 = new Serie("Invincible", "Robert Kirkman");
        Serie ser4 = new Serie("The Walking Dead","Frank Darabont",11, "Apocalípsis zombie");
        Serie ser5 = new Serie("Game Of Thrones","George R. R. Martin",8, "Fantasía medieval");
        Serie [] arreglo_series = new Serie[]{ser1, ser2, ser3, ser4, ser5};
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego("Carlos Duty",20);
        Videojuego juego3 = new Videojuego("The Witcher 3",30);
        Videojuego juego4 = new Videojuego("Darkest Dungeon",50,"RedHook Studios","RPG-Rouguelike");
        Videojuego juego5 = new Videojuego("Hollow Knight",35,"Team Cherry","Metroidvania");
        Videojuego [] arreglo_videojuegos = new Videojuego[]{juego1, juego2, juego3, juego4, juego5};
        Integer[] pos = new  Integer[arreglo_videojuegos.length];

        for (int i = 0; i <3; i++) {
            int a = (int) (Math.random()*5);
            arreglo_series[a].entregar();
            arreglo_videojuegos[a].entregar();
        }
        for (int j = 0; j < arreglo_series.length; j++) {
            if(arreglo_series[j].esEntregado()){
                series_entregadas++;
                arreglo_series[j].devolver();
            }
            if(arreglo_videojuegos[j].esEntregado()){
                videojuegos_entregados++;
                arreglo_videojuegos[j].devolver();
            }
        }
        System.out.println("Se han prestado "+series_entregadas+" series y "+videojuegos_entregados+" videojuegos");

        for (int x = 0; x < arreglo_series.length; x++) {
            conteo = 0;
            for (int y = 0; y < arreglo_series.length; y++) {
                conteo += arreglo_series[x].compareTo(arreglo_series[y]);
            }
            pos[x] = conteo;
        }
        mayor = pos[0];

        for (int x = 1; x < pos.length; x++) {
            if (pos[x] < mayor) {
                mayor = pos[x];
            }
        }
        System.out.println("La serie con más temporadas es:");
        System.out.println(arreglo_series[Arrays.asList(pos).indexOf(mayor)].toString());

        for (int x = 0; x < arreglo_videojuegos.length; x++) {
            conteo = 0;
            for (int y = 0; y < arreglo_videojuegos.length; y++) {
                conteo += arreglo_videojuegos[x].compareTo(arreglo_videojuegos[y]);
            }
            pos[x] = conteo;
        }
        mayor = pos[0];

        for (int x = 1; x < pos.length; x++) {
            if (pos[x] < mayor) {
                mayor = pos[x];
            }
        }
        System.out.println("El videojuego con más horas estimadas es:");
        System.out.println(arreglo_videojuegos[Arrays.asList(pos).indexOf(mayor)].toString());
    }
}
