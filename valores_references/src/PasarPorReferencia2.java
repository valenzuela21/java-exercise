class Persona {
    private  String nombre;
    public void moficarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String readName() {
        return nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona =  new Persona();
        persona.moficarNombre("Andrés");

        System.out.println("Iniciamos el metodo main");
        System.out.println("persona.readName() = " + persona.readName());
        System.out.println("Antes de llamar el metodo test");
        test(persona);
        System.out.println("Después de llamar el metodo test");
        System.out.println("persona.readName() = " + persona.readName());
        System.out.println("¡Finaliza el metodo main con los datos del arreglo modificado!");
    }
    public static void test(Persona persona){

        System.out.println("Iniciamos el método test");

        persona.moficarNombre("Pepe");


        System.out.println("Finaliza le metodo test");

    }
}

