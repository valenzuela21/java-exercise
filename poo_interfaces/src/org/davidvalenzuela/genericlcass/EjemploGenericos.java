package org.davidvalenzuela.genericlcass;
public class EjemploGenericos {
    public static <T> void printCamion(Camion<T> camion){
        for(T a: camion){
            if(a instanceof  Animal){
                System.out.println(((Animal)a).getNombre() + "Tipo: " + ((Animal)a).getTipo());
            }else if(a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }else if(a instanceof  Maquinaria){
                System.out.println(((Maquinaria) a).getTipo());
            }

        }

    }
    public static void main(String[] args) {
        Camion<Animal> transportAnimal = new Camion<>(5);
        transportAnimal.add(new Animal("Corcel Negro", "Caballo"));
        transportAnimal.add(new Animal("Grillo", "Caballo"));
        transportAnimal.add(new Animal("Topocalma", "Caballo"));
        transportAnimal.add(new Animal("Llama", "Caballo"));

        printCamion(transportAnimal);

        Camion<Maquinaria> transportMachine =  new Camion<>(3);
        transportMachine.add(new Maquinaria("Bulldozer"));
        transportMachine.add(new Maquinaria("Grúa Horquilla"));
        transportMachine.add(new Maquinaria("Perforadora"));

        printCamion(transportMachine);

        Camion<Automovil> transportAuto = new Camion<>(3);
        transportAuto.add(new Automovil("Toyota"));
        transportAuto.add(new Automovil("Mitsubishi"));
        transportAuto.add(new Automovil("Chevrolet"));

        printCamion(transportAuto);
    }
    
}
