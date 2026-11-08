package sanchezpharma.comprobante;

public class Factura implements Comprobante {
    @Override
    public void generar(double total) {
        System.out.println("---- FACTURA ELECTRÓNICA ----");
        System.out.println("Subtotal: S/ " + (total / 1.18));
        System.out.println("IGV (18%): S/ " + (total - (total / 1.18)));
        System.out.println("Total a pagar: S/ " + total);
        System.out.println("-----------------------------");
    }
}