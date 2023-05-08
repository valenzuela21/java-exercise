package org.david.pooclassabstractas.form.elements.validator;

public class RequireValidate extends  Validator {

    protected  String message = "El campo es requerido";
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean esValid(String value) {
        return (value != null && value.length() > 0);
    }
}
