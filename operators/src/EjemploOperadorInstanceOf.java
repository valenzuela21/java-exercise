import javax.sound.sampled.FloatControl;
import java.util.concurrent.Flow;

public class EjemploOperadorInstanceOf {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase string";

        boolean c1 = texto instanceof  Integer;
        System.out.println("Texto es tipo Integer: " +  c1);


        Number num =  7;

        boolean c2 = num instanceof  Integer;
        System.out.println("Numero es tipo Integer: " +  c2);

        boolean c3 = num instanceof Long;
        System.out.println("Numero es tipo Long: " +  c3);

        boolean c4 = num instanceof Double;
        System.out.println("Numero es tipo Long: " +  c4);

        boolean b1 = texto instanceof String;
        System.out.println("Texto es de tipo String: " + b1);

        boolean b2 = texto instanceof Object;
        System.out.println("Texto es de tipo Object: " + b2);

        boolean b3 = num instanceof  Integer;
        System.out.println("Numero es de tipo Integer: " + b3);

        boolean b4 = num instanceof Number;
        System.out.println("Numero es de tipo Number: " + b4);

        boolean b5 = num instanceof Object;
        System.out.println("Numero es de tipo Object: " + b5);

        Double decimal = 45.56;
        boolean b6 = decimal instanceof Number;
        System.out.println("Numero es tipo Decimal: " + b6);

        Boolean valid =  false;
        boolean b7  = valid instanceof Boolean;
        System.out.println("Boolean es tipo Boolean: " + b7);

        Float decimal2 = 45.56f;
        boolean b8 =  decimal2  instanceof Number;
        System.out.println("Boolean es tipo Number: " + b8);

        boolean b9 =  decimal2  instanceof Float;
        System.out.println("Boolean es tipo Double: " + b9);


        Number num2 = Integer.valueOf(7);
        String text2 = String.valueOf("Hola Mundo");
        Boolean valid2 = Boolean.valueOf(true);
        Float numberfloat =  Float.valueOf(90.08f);

    }
}
