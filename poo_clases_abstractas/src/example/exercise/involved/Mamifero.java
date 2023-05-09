package example.exercise.involved;

abstract public class Mamifero {
    protected  String habitat;
    protected  float height;
    protected  float largo;
    protected  float peso;

    protected String nameScience;


    public Mamifero(String habitat, float largo, float height,float peso, String nameScience){
        this.habitat =  habitat;
        this.height = height;
        this.largo =  largo;
        this.peso = peso;
                this.nameScience = nameScience;
    }

    public Mamifero(String habitat, float height, float largo, float peso) {
        this.habitat = habitat;
        this.height = height;
        this.largo = largo;
        this.peso = peso;
    }

    public String getHabitat(){
        return habitat;
    }

    public float getHeight() {
        return height;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNameScience() {
        return nameScience;
    }

    abstract  public String eat();
    abstract  public String sleep();
    abstract public  String runner();
    abstract public String communicate();
}
