package org.davidjava8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculate {
    public double computer(double a, double b, Aritmetica lambda){
        return lambda.operacion(a, b);
    }

    public double computerWithFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
}
