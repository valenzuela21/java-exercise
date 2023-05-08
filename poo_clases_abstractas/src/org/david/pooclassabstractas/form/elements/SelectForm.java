package org.david.pooclassabstractas.form.elements;

import org.david.pooclassabstractas.form.elements.select.Options;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm {

    private List<Options> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<Options>();
    }

    public SelectForm(String name, List<Options> options) {
        super(name);
        this.options = options;
    }


    public SelectForm addOptions(Options option) {
        this.options.add(option);
        return this;
    }

    @Override
    public String paintHtml() {
        StringBuilder sb = new StringBuilder("<select");
        sb.append("name='")
                .append(this.name)
                .append("'>");

        for (Options option : this.options) {
            sb.append("\n<option value='")
                    .append(option.getValor())
                    .append("'");
            if (option.isSelected()) {
                sb.append(" selected");
                this.valor =  option.getValor();
            }
            sb.append(">").append(option.getName()).append("</option>");
        }

        sb.append("</select>");
        return sb.toString();
    }
}
