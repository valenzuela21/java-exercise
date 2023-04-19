public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad  =  {10, 11, 12};
        System.out.println("Iniciamos el metodo main");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +  edad[i]);
        }
        System.out.println("Antes de llamar el metodo test");
        test(edad);
        System.out.println("Después de llamar el metodo test");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " +  edad[i]);
        }
        System.out.println("¡Finaliza el metodo main con los datos del arreglo modificado!");
    }
    public static void test(int[] edadArreglo){

        System.out.println("Iniciamos el método test");
        for(int i = 0; i < edadArreglo.length; i++){
           edadArreglo[i] = edadArreglo[i] + 20;
         }
        System.out.println("Finaliza le metodo test");

    }
}
