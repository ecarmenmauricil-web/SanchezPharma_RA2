package sanchezpharma.descuento;

public class VentaMontoBase implements IVentaMonto {
    private double montoMonto;

    public VentaMontoBase(double monto) {
        this.montoMonto = monto;
    }

    @Override
    public double calcularTotal() {
        return montoMonto;
    }
}