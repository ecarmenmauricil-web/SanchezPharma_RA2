package sanchezpharma.venta;

public class VentaBuilder {
    private Venta venta;

    public VentaBuilder() {
        this.venta = new Venta();
    }

    public VentaBuilder asignarCliente(String nombre) {
        venta.setCliente(nombre);
        return this;
    }

    public VentaBuilder agregarItem(String producto, double precio) {
        venta.addProducto(producto);
        return this;
    }

    public Venta construir() {
        return this.venta;
    }
}