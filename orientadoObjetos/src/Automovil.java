public class Automovil {

    private String fabricante;
    private String modelo;
    private String color =  "gris";
    private double cilindrada;

    int capacidadEstanque = 40;

    Automovil(){

    }

    Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    Automovil(String fabricante, String modelo, String color, double cilindrada){
     this(fabricante, modelo);
     this.color = color;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModel(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return  color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque(){
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }


    public String verDetalle(){
        String sb = "auto.fabricante = " + fabricante +
                "auto.modelo = " + modelo +
                "auto.color = " + color +
                "auto.cilindrada = " + cilindrada;
        return sb;
    }


    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + " fernando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100f));
    }

}
