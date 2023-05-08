import org.david.pooclassabstractas.form.elements.ElementForm;
import org.david.pooclassabstractas.form.elements.InputForm;
import org.david.pooclassabstractas.form.elements.SelectForm;
import org.david.pooclassabstractas.form.elements.TextAreaForm;
import org.david.pooclassabstractas.form.elements.select.Options;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EjemploFrom {
    public static void main(String[] args) {

        InputForm userName =  new InputForm("username");
        InputForm password =  new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm age = new InputForm("Age", "edad");

        TextAreaForm experience =  new TextAreaForm("Experience", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguage");
        Options java  = new Options("1", "Java");
        Options typescript = new Options("4", "TypeScript");
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
        password.setValor("12345");
        email.setValor("jhon.doe@correo.com");
        age.setValor("25");
        experience.setValor("... más 10m años experiencia");
        typescript.setSelected(true);

        List<ElementForm> elements = Arrays.asList(userName, password, email, age, experience, lenguaje, saludar);

        elements.forEach(e -> {
            System.out.println(e.paintHtml());
            System.out.println("<br>");
        });




    }
}
