package objetoelectrodomestico;

public class Lavadora extends Electrodomestico{
    private int carga = 5;

    public Lavadora(){

    }
    public Lavadora(int precio_base, int peso){
        super(precio_base, peso);
    }

    public Lavadora(int precio_base, int peso, String color, char consumo_energetico, int carga){
        super(precio_base, peso, color, consumo_energetico);
        this.carga = carga;
    }

    public int getCarga(){
        return this.carga;
    }

    @Override
    public double precioFinal() {
        double precio_final = super.precioFinal();
        carga = getCarga();
        if(carga>30){
            precio_final +=30;
        }
        return precio_final;
    }
}
