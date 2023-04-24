package org.davidvalenzuela.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;

    private int indexItems;
    public static final int MAX_ITEMS  = 12;

    private static  int ultimoFolder;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolder;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indexItems < MAX_ITEMS){
            this.items[indexItems++] = item;
        }

    }

    public float calcularTotal(){
        float total = 0.0f;
        for(int i = 0; i < indexItems; i++){
            ItemFactura item =  this.items[i];
            total += item.calculateImport();
        }
        return total;
    }

    public String generarDetalle(){
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy ");
        StringBuilder sb = new StringBuilder("Factura N: ");

        sb.append("Fecha emisión: ").append(df.format(this.fecha)).append("\n");
        sb.append(folio)
                .append("\n Cliente: " + cliente.getNombre())
                .append("\n Nif: " + cliente.getNif())
                .append("\n Descripcion: " + this.descripcion)
                .append("\n ")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(int i = 0; i < indexItems; i++){
            ItemFactura item =  this.items[i];
            sb.append(item.toString()).append("\n");
            /*sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCalidad())
                    .append("\t")
                    .append(item.calculateImport())
                    .append("\n")
            ;*/
        }

        sb.append("\n Gran Total: ")
                .append(calcularTotal());

        return sb.toString();

    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
