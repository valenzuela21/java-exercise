public class SetenciaIfElse {
    public static void main(String[] args) {
        float promedio = 6.2f;

        if(promedio >= 6.5) {
            System.out.println("Felicitaciones Excelente Promedio!");
        }else if(promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        }else if(promedio >= 5.0 ){
            System.out.println("Bueno promedfio!");
        }else if(promedio >= 4.0){
            System.out.println("Regualr, necesitas esforzarte un poco más");
        }else{
            System.out.println("Reprobado!");
        }
        System.out.println("Tu promedio es" + promedio);

    }
}