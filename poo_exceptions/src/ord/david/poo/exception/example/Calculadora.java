package ord.david.poo.exception.example;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DiviByZeroException {
        if(divisor == 0){
            throw  new DiviByZeroException("No se puede dividir por cero!");
        }
        return numerador / (double)divisor;
    }


    public double dividir(String numerador, String divisor) throws DiviByZeroException, NumberFormatPersonException {
        try {
            int num =  Integer.parseInt(numerador);
            int div =  Integer.parseInt(divisor);

            return this.dividir(num, div);
        }catch (NumberFormatException e){
            throw new NumberFormatPersonException("Debe Ingresar un número en  el campo numerador o divisor");
        }

    }

}
