package sanchezpharma.producto;

public class ProductoIndividual implements ArticuloVendible {
    private String nombre;
    private double precio;

    public ProductoIndividual(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void mostrarDetalle() {
        System.out.println("  - " + nombre + " : S/ " + precio);
    }
}