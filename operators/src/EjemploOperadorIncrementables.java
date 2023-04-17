public class EjemploOperadorIncrementables {
    public static void main(String[] args) {

        //Pre Increment
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post Increment
        i = 2;
        j = i++;
        System.out.println("i = " + i );
        System.out.println("j = " + j );

        //Pre Decrement
        i =  3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post Decrement
        i =  4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(j = " + (++j) + ")");
        System.out.println("(j = " + (j++) + ")");
        System.out.println(j);

    }
}
