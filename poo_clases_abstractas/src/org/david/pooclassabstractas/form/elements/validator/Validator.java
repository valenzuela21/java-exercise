package org.david.pooclassabstractas.form.elements.validator;

abstract public class Validator {

    protected  String message;
    abstract  public void setMessage(String message);
    abstract public String getMessage();
    abstract  public boolean esValid(String value);
}
