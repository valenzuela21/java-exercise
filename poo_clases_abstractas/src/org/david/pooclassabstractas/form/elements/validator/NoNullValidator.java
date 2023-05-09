package org.david.pooclassabstractas.form.elements.validator;

public class NoNullValidator extends Validator {

    protected  String message = "El campo %s no puede ser nulo";
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
        return (value != null);
    }
}
