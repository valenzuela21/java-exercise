package org.davidvalenzuela.ejemplo;

import org.davidvalenzuela.pooherencia.Alumno;
import org.davidvalenzuela.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setName("Andres");
        alumno.setSecondName("Guzma");

        Profesor profesor = new Profesor();
        profesor.setName("Luci");
        profesor.setSecondName("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getName() + " " +  alumno.getSecondName());
        System.out.println("Profesor" + profesor.getAsignatura() +":"+ profesor.getName() + " " +  profesor.getSecondName()) ;

    }
}
