package org.davidvalenzuela.ejemplo;

import org.davidvalenzuela.pooherencia.Alumno;
import org.davidvalenzuela.pooherencia.AlumnoInternacional;
import org.davidvalenzuela.pooherencia.Persona;
import org.davidvalenzuela.pooherencia.Profesor;

public class EjemploSobrecargaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("David", "Garzon", 13, "Instituto Nacional");
        alumno.setAge(25);
        alumno.setInstitucion("Nacional Colormbia");
        alumno.setEmail("coreeo@gmail.com");
        alumno.setNotaCastellano(6.6);
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematica(3.5);

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Pan", "Australia");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setAge(16);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(5.5);
        alumnoInternacional.setNotaMatematica(7.0);

        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setAge(37);


        System.out.println("================================");
        print(alumno);
        System.out.println("================================");
        print(alumnoInternacional);
        System.out.println("================================");
        print(profesor);

    }

    public static void print(Persona persona) {
        System.out.println("==============================================");
        System.out.println(persona);

    }
}
