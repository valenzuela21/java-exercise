package org.david.pooclassabstractas.form.elements;

public class TextAreaForm extends  ElementForm{
    private int files;
    private int columns;

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, int files, int columns) {
        super(name);
        this.files = files;
        this.columns = columns;
    }

    public int getFile() {
        return files;
    }

    public void setFile(int file) {
        this.files = file;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String paintHtml() {
        return "<textarea name='"+this.name+"' cols='"+this.columns+"' rows='"+this.files+"'>"+this.valor+"</textarea>";
    }
}
