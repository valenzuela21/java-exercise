package org.davidjava8.exercise.lambda;


import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String, Integer> contadorPalabras(String frase);
}
