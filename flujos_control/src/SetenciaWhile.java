public class SetenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        boolean prueba = true;

        while(i <= 5){
            System.out.println("i =  " + i);
            i++;
        }

        System.out.println("==================================================");

        i = 0;
        while (prueba) {
            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("==================================================");

        prueba = true;
        i = 0;

        do{
            if(i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);

            i++;
        }while (prueba);
    }
}
