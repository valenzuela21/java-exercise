import org.david.pooclassabstractas.form.elements.*;
import org.david.pooclassabstractas.form.elements.select.Options;
import org.david.pooclassabstractas.form.elements.validator.*;

import java.util.Arrays;
import java.util.List;


public class EjemploFrom {
    public static void main(String[] args) {

        InputForm userName =  new InputForm("username");
        userName.addValidator(new RequireValidate());
        InputForm password =  new InputForm("clave", "password");
        password.addValidator(new RequireValidate());
        password.addValidator(new LengthValidate(6, 12));
        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequireValidate())
                .addValidator(new EmailValidate());

        InputForm age = new InputForm("Age", "edad");
        age.addValidator(new NumberValidate());

        TextAreaForm experience =  new TextAreaForm("Experience", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguage");
        lenguaje.addValidator(new NoNullValidator());

        Options java  = new Options("1", "Java");
        Options typescript = new Options("4", "TypeScript").setSelected(true);
        lenguaje.addOptions(java)
                .addOptions(new Options("2","Python"))
                .addOptions(new Options("3","Javascript"))
                .addOptions(typescript)
                .addOptions(new Options("5","PHP"));


        ElementForm saludar = new ElementForm() {
            @Override
            public String paintHtml() {
                return "<input disabled name='"+this.name+"' value=\"\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola este campo esta desabilitado!");
        userName.setValor("Jhon.doe");
        password.setValor("12345678");
        email.setValor("jhon.doe@correo.com");
        age.setValor("25");
        experience.setValor("... más 10m años experiencia");
        //typescript.setSelected(true);

        List<ElementForm> elements = Arrays.asList(userName, password, email, age, experience, lenguaje, saludar);


        elements.forEach(e -> {
            if(!e.isValid()){
                e.getErrors().forEach(System.out::println);
            }
        });

        elements.forEach(e -> {
            System.out.println(e.paintHtml());
            System.out.println("<br>");
        });




    }
}
