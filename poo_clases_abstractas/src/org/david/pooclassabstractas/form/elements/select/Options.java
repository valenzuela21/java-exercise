package org.david.pooclassabstractas.form.elements.select;

public class Options {

    private String valor;
    private String name;
    private boolean selected;

    public Options() {
    }

    public Options(String valor, String name) {
        this.valor = valor;
        this.name = name;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public Options setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }
}
