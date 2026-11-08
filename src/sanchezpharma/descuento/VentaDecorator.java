package sanchezpharma.descuento;

public abstract class VentaDecorator implements IVentaMonto {
    protected IVentaMonto ventaDecorada;

    public VentaDecorator(IVentaMonto ventaDecorada) {
        this.ventaDecorada = ventaDecorada;
    }
}