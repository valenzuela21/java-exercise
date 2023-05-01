package org.davidvalenzuela.pooherencia;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando Constructor...");
    }

    public Profesor(String name, String secondName){
        super(name, secondName);
    }

    public Profesor(String name, String secondName, String asignatura ){
        super(name, secondName);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos días soy el profesor de " +  getAsignatura() +  ", mi nombre es " +  getName();
    }


    @Override
    public String toString() {
        return super.toString() + "\nasignatura='" + asignatura + '\'';
    }
}
