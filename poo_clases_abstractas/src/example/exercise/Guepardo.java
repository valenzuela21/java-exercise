package example.exercise;

import example.exercise.involved.Felino;

public class Guepardo extends Felino {


    public Guepardo(String habitat, float largo, float height, float peso, String nameScience, float sizeFangs, int velocity) {
        super(habitat, largo, height, peso, nameScience, sizeFangs, velocity);
    }

    @Override
    public String eat() {
        return "El guepardo caza junto a su grupo en las llanuras africanas, con una mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String sleep() {
        return "El Guepardo duerme en las estapas africanas";
    }

    @Override
    public String runner() {
        return "El Guepardo es el felino mas rapido del mundo, corre a " + velocity + "Km/hr";
    }

    @Override
    public String communicate() {
        return "El Guepardo ruge no tan fuerte como el Leon";
    }
}
