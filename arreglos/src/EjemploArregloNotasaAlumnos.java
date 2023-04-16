import java.util.Scanner;

public class EjemploArregloNotasaAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas , claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrsa 7 notas de estudiantes para matematicas");

        for(int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] =  s.nextDouble();
        }

        System.out.println("Ingrsa 7 notas de estudiantes para historia");
        for(int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrsa 7 notas de estudiantes para lenguage");
        for(int i = 0; i < claseLenguaje.length; i ++){
            claseLenguaje[i] = s.nextDouble();
        }


        for(int i =0; i < 7 ; i++){
            sumNotasMatematicas +=  claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }


        double promedioMatematicas =  (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLanguage = (sumNotasLenguaje/claseLenguaje.length);

        System.out.println("Promedio clase matermaticas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguage: " + promedioLanguage);
        System.out.println("Promedio total curso: " + (promedioHistoria + promedioMatematicas + promedioLanguage)/3 );


        System.out.println("Ingrese el identificador del alumno (de 0-6)");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id] / claseLenguaje[id] / claseMatematicas[id] );
        System.out.println("Promedio alumno No: " + id + " : " + promedioAlumno);

    }
}
