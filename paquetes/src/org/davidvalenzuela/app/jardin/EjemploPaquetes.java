package org.davidvalenzuela.app.jardin;

import org.davidvalenzuela.app.hogar.*;
import static org.davidvalenzuela.app.hogar.Persona.saludar;
import static  org.davidvalenzuela.app.hogar.ColorPelo.CAFE;
public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona person  =  new Persona();
        person.setName("David");
        person.setSecondName("Valenzuela");
        person.setColorPelo(CAFE);
        System.out.println(person.getName());

        Perro perro = new Perro();
        perro.name = "Goofy";
        perro.race = "Labrador";

        String game = perro.game(person);
        System.out.println("Game = " + game);

        String saludo = saludar();
        System.out.println("Saludo = " + saludo);
        String generoMuger =  Persona.GENERO_FEMENINO;
        String generoMasculino = Persona.GENERO_MASCULINO;

        System.out.println("generoMasculino = " + generoMasculino);
        System.out.println("generoFemenino =  " + generoMuger);


    }


}
