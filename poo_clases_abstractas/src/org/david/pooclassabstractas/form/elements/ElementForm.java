package org.david.pooclassabstractas.form.elements;

abstract public class ElementForm {

    protected String valor;
    protected String name;

    public ElementForm(){}

    public ElementForm(String name){
        this();
        this.name = name;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String paintHtml();
    
}
