package entretenimiento;

public class Serie implements Entregable{

    private boolean entregado = false;
    private String titulo = "";
    private int numTemporadas = 3;
    private String genero = "";
    private String creador = "";

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String creador, int numTemporadas, String genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = numTemporadas;
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
    public int compareTo(Object segundoObjeto) {
        Serie otraSerie = (Serie) segundoObjeto;
        if (otraSerie.numTemporadas < this.numTemporadas)
            return -1;
        else if (otraSerie.numTemporadas > this.numTemporadas)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"Titulo de la serie: \": " + "\"" + titulo + "\"" + ",\n" +
                "\t\"Creador de la serie: \": " + creador + ",\n" +
                "\t\"Número de temporadas: \": " + "\"" + numTemporadas + "\"" + ",\n" +
                "\t\"Genero de la serie: \": " + genero + ",\n" +
                "\t\"Entregado: \": " + entregado + ",\n" +
                "}\n";
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public int obtenerNumTemporadas() {
        return numTemporadas;
    }

    public String obtenerGenero() {
        return genero;
    }

    public String obtenerCreador() {
        return creador;
    }

    public void definirTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void definirNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void definirGenero(String genero) {
        this.genero = genero;
    }

    public void definirCreador(String creador) {
        this.creador = creador;
    }

}
