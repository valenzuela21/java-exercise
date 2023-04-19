public class PasarPorValor {
    public static void main(String[] args) {
        Integer i  =  10;
        System.out.println("Inicio el metodod main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i (Se mantiene igual) = " + i);
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el metodo test i = " +  i);
        i =  35;
        System.out.println("Finaliza el metodop test con i = " + i);
    }
}
