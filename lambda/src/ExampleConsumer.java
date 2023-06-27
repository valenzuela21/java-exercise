import org.davidjava8.lambda.model.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExampleConsumer {
    public static void main(String[] args) {
        Consumer<Date> consumer = date -> {
            SimpleDateFormat  f  =  new SimpleDateFormat("yyy-MM-dd");
            System.out.printf(f.format(date));

        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> consumerBi =  (String name, Integer age) -> System.out.println(name + ", tiene " +  age + "años!");
        consumerBi.accept("Pepe", 20);


        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello World Lambda");

        List<String> names = Arrays.asList("andres", "pepe", "Luz", "Paco");
        names.forEach(consumer2);

        Supplier<User> createUser = User::new;

        User user =  createUser.get();
        BiConsumer<User, String> assignName = User::setName;

        assignName.accept(user, "Andrés");
        System.out.println("Name User: " + user.getName());

        Supplier<String> provider = () -> "Hello world Suplier";
        System.out.println(provider.get());
    }
}
