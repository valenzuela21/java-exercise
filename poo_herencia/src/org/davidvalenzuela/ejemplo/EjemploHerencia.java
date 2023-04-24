package org.davidvalenzuela.ejemplo;

import org.davidvalenzuela.pooherencia.Alumno;
import org.davidvalenzuela.pooherencia.AlumnoInternacional;
import org.davidvalenzuela.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setName("Andres");
        alumno.setSecondName("Guzma");
        alumno.setNotaCastellano(6.6);
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(3.5);


        AlumnoInternacional alumnoInternacional =  new AlumnoInternacional();
        alumnoInternacional.setName("Peter");
        alumnoInternacional.setSecondName("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setAge(16);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(5.5);
        alumnoInternacional.setNotaMatematica(7.0);

        Profesor profesor = new Profesor();
        profesor.setName("Luci");
        profesor.setSecondName("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getName() + " " +  alumno.getSecondName());
        System.out.println("Profesor " + profesor.getAsignatura() +" : "+ profesor.getName() + " : " +  profesor.getSecondName()) ;
        System.out.println(alumnoInternacional.getName() + " " + alumnoInternacional.getSecondName() + " " + alumnoInternacional.getInstitucion() + " " + alumnoInternacional.getPais() );
        Class clase =  alumnoInternacional.getClass();
        while(clase.getSuperclass()  !=  null){
            String hija  = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija +  " es una clase hija de la clase padre " +  padre);
            clase =  clase.getSuperclass();
        }
    }
}
