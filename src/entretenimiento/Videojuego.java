package entretenimiento;

public class Videojuego implements Entregable {

    private boolean entregado = false;
    private String titulo = "";
    private int horasEstimadas = 10;
    private String genero = "";
    private String compania = "";

    public Videojuego() {}

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String compania, String genero) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
        this.genero = genero;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"Titulo del videojuego: \": " + "\"" + titulo + "\"" + ",\n" +
                "\t\"Compañia del videojuego: \": " + compania + ",\n" +
                "\t\"Horas estimadas para coronarlo: \": " + "\"" + horasEstimadas + "\"" + ",\n" +
                "\t\"Genero del videojuego: \": " + genero + ",\n" +
                "\t\"Entregado: \": " + entregado + ",\n" +
                "}\n";
    }

    @Override
    public int compareTo(Object segundoObjeto) {
        Videojuego otroVideojuego = (Videojuego) segundoObjeto;
        if (otroVideojuego.horasEstimadas < this.horasEstimadas)
            return -1;
        else if (otroVideojuego.horasEstimadas > this.horasEstimadas)
            return 1;
        else
            return 0;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public int obtenerHorasEstimadas() {
        return horasEstimadas;
    }

    public String obtenerGenero() {
        return genero;
    }

    public String obtenerCompania() {
        return compania;
    }

    public void definirTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void definirHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void definirGenero(String genero) {
        this.genero = genero;
    }

    public void definirCompania(String compania) {
        this.compania = compania;
    }

}
