package fundamentoclases;

public class Persona{
    public static int IMC_SOBREPESO = 1;
    public static int IMC_NORMAL = 0;
    public static int IMC_BAJO_PESO = -1;
    private char HOMBRE = 'H';
    private char MUJER = 'M';
    private int CIFRAS_DEL_DNI = 8;
    private char[] LETRAS_EN_EL_CASTELLANO = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
            'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    private int MAYORIA_DE_EDAD = 18;

    private int MINIMA_EDAD = 0;
    private int MAXIMA_EDAD = 150;



    private String nombre = "";
    private int edad = 0;
    private char sexo = HOMBRE;
    private double peso = 0;
    private double altura = 0;
    private String dni;

    public Persona() {
        dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

        dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

        dni = generarDNI();
    }

    public void definirAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            System.out.println("La altura no puede negativa o cero, permanece con el valor anterior");
    }

    public void definirPeso(double peso) {
        if (altura > 0)
            this.peso = peso;
        else
            System.out.println("El peso no puede negativa o cero, permanece con el valor anterior");
    }

    public void definirNombre(String nombre) {
        this.nombre = nombre;
    }

    public void definirSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void definirEdad(int edad) {
        if (edad >= MINIMA_EDAD && edad <= MAXIMA_EDAD)
            this.edad = edad;
        else
            System.out.println("La edad debe estar entre " + MINIMA_EDAD + " y " + MAXIMA_EDAD);
    }

    public int calcularIMC() {
        double IMC =  peso / Math.pow(altura, 2);
        if (IMC < 20)
            return IMC_BAJO_PESO;
        else if (IMC > 25)
            return IMC_SOBREPESO;
        else
            return IMC_NORMAL;
    }

    public boolean esMayorDeEdad() {
        return edad >= MAYORIA_DE_EDAD;
    }

    public char comprobarSexo(char sexo) {
        return sexo == MUJER? MUJER:HOMBRE;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"nombre\": " + "\"" + nombre + "\"" + ",\n" +
                "\t\"edad\": " + edad + ",\n" +
                "\t\"sexo\": " + "\"" + sexo + "\"" + ",\n" +
                "\t\"peso\": " + peso + ",\n" +
                "\t\"altura\": " + altura + ",\n" +
                "\t\"DNI\": " + "\"" + dni + "\"\n" +
                "}\n";
    }

    private String generarDNI() {
        return generarNumeroDNIDe8Cifras() + generarLetraMayuscula();
    }

    private String generarNumeroDNIDe8Cifras() {
        String numero = "";
        for (int i = 0; i < CIFRAS_DEL_DNI; i++)
            numero += generarNumeroDeUnaCifra();
        return numero;
    }

    private int generarNumeroDeUnaCifra() {
        return (int) Math.floor(Math.random()*(9-1));
    }

    private char generarLetraMayuscula() {
        int posicion = (int) Math.floor(Math.random()*(LETRAS_EN_EL_CASTELLANO.length - 2));
        return Character.toUpperCase(LETRAS_EN_EL_CASTELLANO[posicion]);
    }
}

