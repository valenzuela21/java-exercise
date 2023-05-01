package org.davidvalenzuela.pooherencia;

public class Alumno extends Persona {

    private  String institucion;
    private double notaMatematica;
    private double notaCastellano;

    private double notaNotaHistory;

    public Alumno(){
        System.out.println("Alumno: Inicializando Constructor...");
    }

    public Alumno(String name,  String nameSecond){
        super(name, nameSecond);
    }

    public Alumno(String name, String secondName, int age){
        super(name, secondName, age);
    }

    public Alumno(String name, String secondName, int age, String institucion){
        super(name, secondName, age);
        this.institucion = institucion;
    }

    public Alumno(String name, String secondName, int age, String institucion, double notaMatematica, double notaCastellano, double notaNotaHistory){
        this(name, secondName, age, institucion);
        this.notaMatematica =  notaMatematica;
        this.notaCastellano =  notaCastellano;
        this.notaNotaHistory = notaNotaHistory;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaNotaHistory() {
        return notaNotaHistory;
    }

    public void setNotaNotaHistory(double notaNotaHistory) {
        this.notaNotaHistory = notaNotaHistory;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es " + getName();
    }

    public double calculateAverage(){
        System.out.println("calculate: " + Alumno.class.getCanonicalName());
        return (notaNotaHistory + notaCastellano + notaMatematica) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n institucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaNotaHistory=" + notaNotaHistory +
                ", promedio=" + this.calculateAverage();
    }
}
