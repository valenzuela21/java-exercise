import java.util.Random;

public class EjemploClaseMAthRandom {
    public static void main(String[] args){

        String[]  colors =  {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random);

        random *= colors.length;
        System.out.println("random = " + random);

        random =  Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colors[(int) random]);


        Random randomObj =  new Random();
        int randomInt =  15 + randomObj.nextInt(25-15+1);
        //long randomLong =  randomObj.nextLong();
        System.out.println("ramdomIn = " +  randomInt);

        randomInt = randomObj.nextInt(colors.length);
        System.out.println("ramdonInt = " +  randomInt);
        System.out.println("colors = " + colors[randomInt]);

    }
}
