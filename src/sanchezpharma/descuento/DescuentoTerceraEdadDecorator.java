package sanchezpharma.descuento;

public class DescuentoTerceraEdadDecorator extends VentaDecorator {
    public DescuentoTerceraEdadDecorator(IVentaMonto ventaDecorada) {
        super(ventaDecorada);
    }

    @Override
    public double calcularTotal() {
        double monto = ventaDecorada.calcularTotal();
        double descuento = monto * 0.10; // 10% de descuento
        System.out.println(" * Aplicando Descuento Tercera Edad (10%): -S/ " + descuento);
        return monto - descuento;
    }
}