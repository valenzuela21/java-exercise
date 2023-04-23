public enum Color {
    ROJO("rojo"),
    AMARLLO("amarillo"),
    AZUL("azul"),
    GRIS("gris"),
    MORADO("morado"),
    NARANJA("naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
