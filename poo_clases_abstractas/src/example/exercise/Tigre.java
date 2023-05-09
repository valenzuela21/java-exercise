package example.exercise;

import example.exercise.involved.Felino;

public class Tigre extends Felino {


    private String specieTigre;

    public Tigre(String habitat, float largo, float height, float peso, String nameScience, float sizeFangs, int velocity, String specieTigre) {
        super(habitat, largo, height, peso, nameScience, sizeFangs, velocity);
        this.specieTigre = specieTigre;
    }

    public String getSpecieTigre() {
        return specieTigre;
    }

    @Override
    public String eat() {
        return "El Tigre " + specieTigre + " caza solitario en los manglares y bosqies monzónicos de " +  habitat;
    }

    @Override
    public String sleep() {
        return "El Tigre  " + specieTigre + " duerme en la selva de " +  habitat;
    }

    @Override
    public String runner() {
        return "El tigre " + specieTigre + "corre a " +  velocity + ".km/hr";
    }

    @Override
    public String communicate() {
        return "El Tigre ruge y agacha sus orejas";
    }
}
