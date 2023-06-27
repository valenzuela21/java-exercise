import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {

    public static void main(String[] args) {
        Function<String, String> f1 =  param -> "Hola que tal " +  param;
        String result =  f1.apply("Andres");

        System.out.println(result);

        Function<String, String> f2 = String::toUpperCase;

        System.out.println( f2.apply("Andres"));

        BiFunction<String, String, String> f3 = (a, b)-> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String r2 =  f3.apply("Andres", "Jose");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 =  String::compareTo;
        System.out.println(f4.apply("andres", "andres"));

        BiFunction<String, String, String> f5 =  String::concat;
        System.out.println(f5.apply("Andres ", "Jose"));



    }
}
