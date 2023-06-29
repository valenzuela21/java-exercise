package org.davidjava8.exercise.lambda;

import java.util.Collections;

public class ExpressionsLambda {

    public static void main(String[] args) {
        ContadorPalabras contador =  frase -> {
            String[] array = frase.replace(".", "").replace(",", "").toLowerCase().split(" ");
            int max = 0;
            String letters = null;
            for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {

                    if(array[i].equalsIgnoreCase(array[j])){
                        count++;
                    }

                    if(count > max){
                        max = count;
                        letters = array[i];
                    }

                }

            }
            return Collections.singletonMap(letters, max);
        };

        contador.contadorPalabras("Yo ni te comozco, ni te he visto, ni se tu nombre, ni te hablaré, ni me interesa")
                .forEach((k, v) -> System.out.println("Letter: " +  k +  " ,repeat letters: " +  v  +  " number of times"));

    }



}
