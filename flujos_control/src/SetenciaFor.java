public class SetenciaFor {

    public static void main(String[] args) {
        System.out.println("==============================================");
        for(int i = 0; i <= 10; i++){
            if(i >= 5){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("==============================================");
        for(int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        System.out.println("==============================================");

        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(  "i:" + i + " - " + "j:" + j);
        }

    }
}
