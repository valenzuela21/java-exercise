package org.davidjava8.exercise.lambda;

public class ExpressionLambdaFormat {
    public static void main(String[] args) {

        FormarterFrase format =  frase -> {
            return frase.replace(".", " ")
                    .replace(",", "")
                    .replace(" ", "")
                    .toUpperCase();
        };


        String result = format.cleanFormat("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París");
        System.out.println(result);
    }

}
