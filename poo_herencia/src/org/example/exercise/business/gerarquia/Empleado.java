package org.example.exercise.business.gerarquia;

public class Empleado extends Persona {

    private int empleadoId;
    private double remuneracion;

    public Empleado(int empleadoId , double remuneracion, String numeroFiscal, String nombre, String apellido, String direccion) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;

    }


    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }


    public void aumentarRemuneracion(int porecentaje) {
        this.remuneracion += remuneracion * porecentaje / 100;
    }


    @Override
    public String toString() {
        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + super.toString();
    }
}
