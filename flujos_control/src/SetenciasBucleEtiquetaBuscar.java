public class SetenciasBucleEtiquetaBuscar {
    public static void main(String[] args) {
        String frase1 = "Tres triste tigres tragan trigo en un trigal";
        int cantidad = 0;

        String palabra = "trigo";
        char letra = 'g';
        int maxPalabra = palabra.length();
        int maxFrase = frase1.length() - maxPalabra;


        buscar: for(int i = 0; i <= maxFrase; i++){
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if(frase1.charAt(k++) != palabra.charAt(j) ){
                    continue buscar;
                }
            }
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + "en la frase" );

        System.out.println("=============================================");

        String frase2 = "Tres tristes tigres tragan trigo en un trigal";

        int max = frase2.length();
        int cantidad1 = 0;

        for(int i = 0; i < max; i++){
            if(frase2.charAt(i) != letra) {
                continue;
            }
            cantidad1++;
        }

        System.out.println("Encontrado =  " + cantidad1 + " veces el caracter " +  letra + "en la  frase");

    }
}
