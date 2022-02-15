package semana;

import java.time.LocalDateTime;

public class FechaYHoraActual {
    private static LocalDateTime fechaTiempo = LocalDateTime.now();

    public static void consultarFechaYHoraActual(){//Punto 13
        String mes = String.valueOf(fechaTiempo.getMonthValue());
        if(fechaTiempo.getMonthValue()<10){mes="0"+mes;}
        System.out.println("A continuación aparecerá la fecha y hora actual:");
        System.out.println("("+fechaTiempo.getYear()+"/"+mes+"/"+fechaTiempo.getDayOfMonth()+
                ")("+fechaTiempo.getHour()+":"+fechaTiempo.getMinute()+":"+fechaTiempo.getSecond()+")");
    }
}
