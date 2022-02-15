package objetoelectrodomestico;

public class Television extends Electrodomestico{
    private int resolucion = 20;
    private boolean sintonizador_TDT = false;

    public Television(){

    }

    public Television(int precio, int peso) {
        super(precio, peso);
    }

    public Television(int precio, int peso, String color, char consumo_energetico, int resolucion, boolean sintonizador_TDT){
        super(precio, peso, color, consumo_energetico);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public int getResolucion(){
        return this.resolucion;
    }
    public boolean getSintonizadorTDT(){
        return this.sintonizador_TDT;
    }

    @Override
    public double precioFinal() {
        double precio_final = super.precioFinal();
        resolucion = getResolucion();
        sintonizador_TDT = getSintonizadorTDT();
        if (resolucion>40){precio_final = (precio_final) + (precio_final*0.3);}
        else if(sintonizador_TDT){precio_final +=50;}
        return precio_final;
    }
}
