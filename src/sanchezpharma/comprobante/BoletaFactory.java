package sanchezpharma.comprobante;

public class BoletaFactory extends ComprobanteFactory {
    @Override
    public Comprobante crearComprobante() {
        return new Boleta();
    }
}