package org.example.exercise.business.gerarquia;


public class Cliente extends Persona {

    private int clienteId;


    public Cliente(String numeroFiscal, String nombre, String apellido, String direccion, int clienteId) {
        super(numeroFiscal, nombre, apellido, direccion);
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "clienteId=" + clienteId +
                ',' + super.toString();
    }
}
