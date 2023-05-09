package example.exercise.involved;

abstract public class Canino extends Mamifero {

    protected  String color;
    protected  String sizeFangs;

    public Canino(String habitat, float largo, float height, float peso, String nameScience, String color, String sizeFangs) {
        super(habitat, largo, height, peso, nameScience);
        this.color = color;
        this.sizeFangs = sizeFangs;
    }

    public String getColor() {
        return color;
    }

    public String getSizeFangs() {
        return sizeFangs;
    }
}
