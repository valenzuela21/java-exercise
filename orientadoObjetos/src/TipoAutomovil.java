public enum TipoAutomovil {
    SEDAN("Sedan", "auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto Grande", 4),
    HATCHBAK("Hatchback", "Auto Compacto", 4),
    PICKUP("Pcikup", "Camioneta", 4),
    COUPE("Coupé", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto Deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4),
    SUV("SUV", "Todo terreno deportivo", 5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
