package org.david.pooclassabstractas.form.elements.validator;

import org.david.pooclassabstractas.form.elements.validator.message.IMessageFormat;

public class LengthValidate extends Validator implements IMessageFormat {
    protected  String message = "El campo %s debe tener minimo %d caracteres y máximo de %d caracteres";
    private int min;
    private  int max = Integer.MAX_VALUE;

    public LengthValidate(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public LengthValidate() {
    }

    @Override
    public void setMessage(String message) {
        this.message =  message;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        //this.message = String.format(this.message, this.min, this.max);
        if(value == null){
            return true;
        }
        int large = value.length();
        return large >= min && large <=  max;
    }

    @Override
    public String getMessageFormat(String input) {
        return String.format(this.message, input, this.min, this.max);
    }

}
