package org.davidvalenzuela.ejemplo;

import org.davidvalenzuela.pooherencia.Alumno;
import org.davidvalenzuela.pooherencia.AlumnoInternacional;
import org.davidvalenzuela.pooherencia.Persona;
import org.davidvalenzuela.pooherencia.Profesor;

public class EjemploHerenciaConstrucciones {
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
        System.out.println("Imprimiendo datos en común de Persona: ");
        System.out.println("nombre: " + persona.getName() + " , apellido: " + persona.getSecondName() + " , edad: " + persona.getAge() + ", email" + persona.getEmail());
        if(persona instanceof  Alumno){
            System.out.println("Imprimir los datos del tipo Alumno: ");
            System.out.println("Institución: " +  ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaNotaHistory());
            System.out.println("Mota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof  AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idiomas: " +  ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("===========================Sobre Escritura Calcular Promedio ================================");
            System.out.println("Imprimir los datos del tipo profesor: " + ((Alumno) persona).calculateAverage()  );
            System.out.println("=============================================================================================");
        }
        if(persona instanceof  Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " +  ((Profesor) persona).getAsignatura());
        }
        System.out.println("========================== Sobre Escritura Saludar =============================");
        System.out.println(persona.saludar());
        System.out.println("================================================================================");


    }
}
