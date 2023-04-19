import java.lang.reflect.Method;

public class WrappaperMetodoGetClass {
    public static void main(String[] args) {
        String text =  "Hola que tal!";
        Class strClass = text.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method method: strClass.getMethods()){
            System.out.println("metodo.getName() = " +  method.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " +  intClass.getSimpleName());
    }
}
