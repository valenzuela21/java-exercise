public class SetenciasBucleEtiquetas{
    public static void main(String[] args) {
        System.out.println("===================== With for Day Weeks ======================");


        bucle: for(int i = 0; i <= 7; i++){
            System.out.println();
            int j = 0;
            while (j <= 8){
                if(i == 6 || i == 7){
                    System.out.println("Día " + i + ": Descanso el fin de semana.");
                    continue bucle;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }
        System.out.println("===================== With for ======================");

        bucle1: for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println();
        System.out.println("===================== With While ======================");

        bucle2: for(int i = 0; i < 5; i++){
            System.out.println();
            int j = 0;
            while(j < 5){
                if(i == 2){
                    continue  bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }

        System.out.println();
        System.out.println("=================== Whith for =======================");

        etiqueta1: for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    break etiqueta1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }

    }
}
