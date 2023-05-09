package example.exercise;

import example.exercise.involved.Felino;

public class Leon extends Felino {
    private int numManada;
    private double powerRoarDecibel;

    public Leon(String habitat, float largo, float height, float peso, String nameScience, float sizeFangs, int velocity, int numManada, double powerRoarDecibel) {
        super(habitat, largo, height, peso, nameScience, sizeFangs, velocity);
        this.numManada = numManada;
        this.powerRoarDecibel = powerRoarDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPowerRoarDecibel() {
        return powerRoarDecibel;
    }

    @Override
    public String eat() {
        return "El Leon casa junto a su grupo de "+ numManada +" individuales en als llanuras africanas";
    }

    @Override
    public String sleep() {
        return "El Leon duerme en las estepas africanas";
    }

    @Override
    public String runner() {
        return "El leon corre a "+ velocity +" km/hr";
    }

    @Override
    public String communicate() {
        return "El elon ruge fuerte a " + powerRoarDecibel + "deciceles";
    }
}
