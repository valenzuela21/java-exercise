package org.davidvalenzuela.pooherencia;

public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno International: Inicializando Constructor...");
    }

    public AlumnoInternacional(String name, String nameSecond){
        super(name, nameSecond);
    }
    
    public AlumnoInternacional(String name, String nameSecond, String pais){
        super(name, nameSecond);
        this.pais =  pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno extranjero del pais " +  getPais()  +  " mi nombre " +  getName();
    }
}
