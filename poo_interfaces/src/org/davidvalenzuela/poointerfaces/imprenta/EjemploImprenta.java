package org.davidvalenzuela.poointerfaces.imprenta;

import org.davidvalenzuela.poointerfaces.imprenta.model.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen contedino de programación", new Persona("Juan", "Pepino"), "Desarrollador Devops");
        cv.addExperiencia("Aws")
                .addExperiencia("Azure")
                .addExperiencia("Linux")
                .addExperiencia("Docker")
                .addExperiencia("Desarrollador Full Stack");


        Libro book =  new Libro(new Persona("David", "Baldemar"), "Patrones de Diseño", Genero.CIENCIAS);

        book.addPage(new Pagina("Patrón Singleton"))
                .addPage(new Pagina("Patrón Adapater"))
                .addPage(new Pagina("Patrón Observer"))
                .addPage(new Pagina("Patrón Facade"))
                .addPage(new Pagina("Patrón Proxy"))
                .addPage(new Pagina("Patrón Factory"))
                .addPage(new Pagina("Patrón Composite"))
                .addPage(new Pagina("Patrón Fascade"));


        Informe informer =  new Informe(new Persona("Juan", "Volcan"), "Martin Followers", "Estudio sobre azure devops");
        imprimir(cv);
        imprimir(informer);
        imprimir(book);

    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
