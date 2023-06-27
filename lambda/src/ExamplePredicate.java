import org.davidjava8.lambda.model.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {
        Predicate<Integer>  test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " +  r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("Andres", "Andres"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> j>i;
        boolean r2 =  t4.test(5, 10);
        System.out.println(r2);


        User a =  new User();
        User b =  new User();
        a.setName("maria");
        b.setName("cata");
        BiPredicate<User, User> t5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println(t5.test(a,b));
    }
}
