package org.david.pooclassabstractas.form.elements.validator;

public class EmailValidate  extends  Validator{


    protected String message =  "El campo %s no es valido formato";

    private final static String EMAIL_REGEX =  "^(.+)@(.+)$";

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
        return value.matches(EMAIL_REGEX);
    }
}
