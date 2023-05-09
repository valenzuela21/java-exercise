package org.david.pooclassabstractas.form.elements.validator;

public class NumberValidate extends Validator {
     protected String message =  "El campo  %s  debe ser un número";


    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        try{
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }


}
