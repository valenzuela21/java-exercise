package org.david.pooclassabstractas.form.elements.validator;

public class NumberValidate extends Validator {
     protected String message =  "El unput debe ser un número";


    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean esValid(String value) {
        try{
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }


}
