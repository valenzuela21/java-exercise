package org.davidvalenzuela.appfacturas.modelo;

public class ItemFactura {
    private int calidad;
    private Producto producto;

    public ItemFactura(int calidad, Producto producto) {
        this.calidad = calidad;
        this.producto = producto;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calculateImport(){
        return this.calidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto.toString() +
                "\t" +  calidad +
                "\t " + calculateImport();
    }
}
