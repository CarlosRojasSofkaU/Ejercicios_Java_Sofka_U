package objetoelectrodomestico;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {
    private int precio_base = 100;
    private String color = "blanco";
    private char consumo_energetico = 'F';
    private int peso = 5;

    public Electrodomestico(){

    }

    public Electrodomestico(int precio_base, int peso){
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(int precio_base, int peso, String color, char consumo_energetico){
        this.precio_base = precio_base;
        this.peso = peso;
        comprobarConsumoEnergetico(consumo_energetico);
        comprobarColor(color);
    }
    /*Getters*/
    public int getPrecioBase(){
        return this.precio_base;
    }
    public int getPeso(){
        return this.peso;
    }
    public String getColor(){
        return this.color;
    }
    public char getConsumoEnergetico(){
        return this.consumo_energetico;
    }
    /*Setters*/
    public void setPrecioBase(int precio_base){
        this.precio_base = precio_base;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setConsumoEnergetico(char consumo_energetico){
        this.consumo_energetico = consumo_energetico;
    }

    private void comprobarConsumoEnergetico(char letra){
        String rango_consumo_energetico = "ABCDEF";
        if (rango_consumo_energetico.contains(Character.toString(letra))){
            setConsumoEnergetico(letra);
        }
        else{setConsumoEnergetico('F');}
    }
    private void comprobarColor(String color){
        color = color.toLowerCase();
        List<String> colores = new ArrayList<String>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        if(colores.contains(color)){
            setColor(color);
        }
        else{setColor("blanco");}
    }
    public double precioFinal(){
        double precio_final=0;
        consumo_energetico = getConsumoEnergetico();
        peso = getPeso();
        switch (consumo_energetico){
            case 'A':
                precio_final = 100;
                break;
            case 'B':
                precio_final = 80;
                break;
            case 'C':
                precio_final = 60;
                break;
            case 'D':
                precio_final = 50;
                break;
            case 'E':
                precio_final = 30;
                break;
            case 'F':
                precio_final = 10;
                break;
        }
        if (0<peso && peso<19){
            precio_final +=10;
        }
        else if (20<peso && peso<49){
            precio_final +=50;
        }
        else if (50<peso && peso<79){
            precio_final +=80;
        }
        else{
            precio_final +=100;
        }
        return precio_final;
    }
}
