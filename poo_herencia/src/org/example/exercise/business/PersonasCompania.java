package org.example.exercise.business;

import org.example.exercise.business.gerarquia.Gerente;

public class PersonasCompania {
    public static void main(String[] args) {
        Gerente gerente  = new Gerente(57000.00, 25, 2000.00, "12.345.678-9", "John", "Roe", "cra 49 no.90 -90");
        gerente.aumentarRemuneracion(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);
    }
}
