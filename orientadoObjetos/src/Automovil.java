public class Automovil implements  Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona condutor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    private int indexRueda = 0;


    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "rojo";
    public static final String COLOR_AMARILLO = "amarillo";
    public static final String COLOR_AZUL = "azul";
    public static final String COLOR_BLANCO = "blanco";

    public static final String COLOR_GRIS = "gris";


    Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona condutor) {
        this(fabricante, modelo, color);
        this.motor = motor;
        this.estanque = estanque;
        this.condutor = condutor;
    }


    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona condutor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque, condutor);
        this.ruedas =  ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModel() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String verDetalle() {
        String sb = "auto.id = " + id +
                "\n auto.fabricante = " + fabricante +
                "\n auto.modelo = " + modelo +
                "\n auto.color = " + color.getColor();
        if (this.getTipo() != null) {
            sb += "\n auto.tipo = " + getTipo().getNombre();
        }
        if(this.motor != null) {
            sb += "\n auto.cilindrada = " + this.motor.getCilindrada();
        }

                sb += "\n auto.colorPatente = " + Automovil.colorPatente.getColor();
        return sb;
    }


    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return fabricante + " " + modelo + " fernando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (estanque.getCapacidad() * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (estanque.getCapacidad() * (porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModel()));
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public TipoAutomovil getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getCondutor() {
        return condutor;
    }

    public void setCondutor(Persona condutor) {
        this.condutor = condutor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRuedas(Rueda rueda){
        this.ruedas[indexRueda++] = rueda;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "auto.id = " + this.id + "\'" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadEstanque=" + estanque.getCapacidad() +
                '}';
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
