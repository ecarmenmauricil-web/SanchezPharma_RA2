package sanchezpharma.producto;

import java.util.ArrayList;
import java.util.List;

public class KitProductos implements ArticuloVendible {
    private String nombreKit;
    private List<ArticuloVendible> articulos = new ArrayList<>();

    public KitProductos(String nombreKit) {
        this.nombreKit = nombreKit;
    }

    public void agregarArticulo(ArticuloVendible articulo) {
        articulos.add(articulo);
    }

    @Override
    public double getPrecio() {
        return articulos.stream().mapToDouble(ArticuloVendible::getPrecio).sum();
    }

    @Override
    public String getNombre() { return nombreKit; }

    @Override
    public void mostrarDetalle() {
        System.out.println("Paquete [ " + nombreKit + " ] incluye:");
        for(ArticuloVendible art : articulos) {
            art.mostrarDetalle();
        }
    }
}