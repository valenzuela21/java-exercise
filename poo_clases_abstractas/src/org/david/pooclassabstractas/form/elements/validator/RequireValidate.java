package org.david.pooclassabstractas.form.elements.validator;

public class RequireValidate extends  Validator {

    protected  String message = "El campo %s es requerido";
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && value.length() > 0);
    }
}
