import org.davidjava8.lambda.aritmetica.Aritmetica;
import org.davidjava8.lambda.aritmetica.Calculate;

public class ExampleInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma =  Double::sum;
        Aritmetica resta = (a, b) -> a - b;
        Calculate cal =  new Calculate();
        System.out.println(cal.computer(10, 5, suma));
        System.out.println(cal.computer(10, 5, resta));
        System.out.println(cal.computer(10, 5, (a, b) -> a * b));
        System.out.println(cal.computerWithFunction(10, 5 ,(a, b) -> a+b));
    }
}
