package objetoelectrodomestico;

public class Controlador {//Punto 17
    public static void mostrarPunto17() {
        double precio_electrodomesticos=0;
        double precio_lavadoras=0;
        double precio_televisores=0;
        double precio_absoluto=0;
        Electrodomestico ele1 = new Electrodomestico();
        Electrodomestico ele2 = new Electrodomestico(50,30);
        Electrodomestico ele3 = new Electrodomestico(75,50,"AZUL",'Z');
        Electrodomestico ele4 = new Electrodomestico(40,75,"amarillento", 'A');
        Lavadora lav5 = new Lavadora();
        Lavadora lav6 = new Lavadora(90,33);
        Lavadora lav7 = new Lavadora(20, 80, "negroide",'B',50);
        Television tele8 = new Television();
        Television tele9 = new Television(120,80);
        Television tele10 = new Television(150,100,"Negro",'A', 55,true);
        Electrodomestico[] lista_electrodomesticos = new Electrodomestico[]{ele1, ele2, ele3, ele4, lav5, lav6, lav7, tele8, tele9, tele10};
        for (int i = 0; i < lista_electrodomesticos.length; i++) {
            if (lista_electrodomesticos[i] instanceof Television){
                precio_televisores += lista_electrodomesticos[i].precioFinal();
            }
            else if(lista_electrodomesticos[i] instanceof Lavadora){
                precio_lavadoras += lista_electrodomesticos[i].precioFinal();
            }
            else{
                precio_electrodomesticos += lista_electrodomesticos[i].precioFinal();
            }
        }
        precio_absoluto = precio_electrodomesticos + precio_televisores + precio_lavadoras;
        System.out.println("El precio de las lavadoras es: "+precio_lavadoras+" Euros");
        System.out.println("El precio de los televisores es: "+precio_televisores+" Euros");
        System.out.println("El precio de todos los electrodomésticos es: "+precio_absoluto+" Euros");

    }
}
