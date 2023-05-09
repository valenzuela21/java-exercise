package example.exercise.involved;

abstract public class Felino extends Mamifero {

    protected  float sizeFangs;
    protected  int velocity;

    public Felino(String habitat, float largo, float height, float peso, String nameScience, float sizeFangs, int velocity) {
        super(habitat, largo, height, peso, nameScience);
        this.sizeFangs = sizeFangs;
        this.velocity = velocity;
    }

    public float getSizeFangs() {
        return sizeFangs;
    }

    public int getVelocity() {
        return velocity;
    }
}
