public class EjemploArreglosForOdenBurbuja {

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int counter =  0;
        for(int i = 0; i < total - 1; i++){
            for(int j = i; j >= 0  && ((Comparable)arreglo[j]).compareTo(arreglo[j+1]) > 0; j--){
                Object auxiliar = arreglo[j];
                arreglo[j] =  arreglo[j+1];
                arreglo[j+1] =  auxiliar;
                counter++;
            }
        }


        System.out.println(counter);
    }
    public static void main(String[] args) {
        String[] productos = {
                "Kingston Pendrive 64GB",
                "Smasung Galaxy",
                "Discuro Duro SSD Samsung Externo",
                "Asus Notebook",
                "Macbook Air",
                "Bicicle Oxford"
        };

        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("============= Metodo burbuja número 1 ==============");

        for(int i = 0; i < total; i++){
            for(int j =  0;  j < total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] =  productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i] );
        }

        System.out.println("============= Metodo burbuja número 2 ==============");


        for(int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i] );
        }

        System.out.println("============= Metodo burbuja número 3 ==============");

        Integer[] numeros = new Integer[4];



        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Para indice " + i + " : " + numeros[i] );
        }

    }
}
