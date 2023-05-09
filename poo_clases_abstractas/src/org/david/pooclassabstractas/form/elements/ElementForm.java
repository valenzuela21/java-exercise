package org.david.pooclassabstractas.form.elements;

import org.david.pooclassabstractas.form.elements.validator.Validator;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementForm {

    protected String valor;
    protected String name;

    private List<Validator> validators;
    private List<String> errors;

    public ElementForm(){
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementForm(String name){
        this();
        this.name = name;
    }

    public ElementForm  addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    }

    public String getName() {
        return name;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isValid(){
        for(Validator v: validators){
            if(!v.isValid(this.valor)){
                this.errors.add( String.format(v.getMessage(), name));
            }
        }
        return this.errors.isEmpty();
    }

    abstract public String paintHtml();
    
}
