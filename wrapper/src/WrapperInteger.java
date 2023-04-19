public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo =  32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;

        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        int num2 = intObjeto.intValue();

        System.out.println("num = " +  num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("Valor = " + valor);

        Short shortObjecto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjecto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " +  byteObjeto);

        Long longObject =  intObjeto.longValue();
        System.out.println("longObjecto = " + longObject);
    }
}
