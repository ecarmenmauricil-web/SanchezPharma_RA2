package sanchezpharma.venta;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String cliente;
    private List<String> productos = new ArrayList<>();
    private double total;

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void addProducto(String producto) { this.productos.add(producto); }
    public void setTotal(double total) { this.total = total; }

    public void mostrarResumen() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos adquiridos: " + productos);
    }
}