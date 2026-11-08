package sanchezpharma.comprobante;

public class Boleta implements Comprobante {
    @Override
    public void generar(double total) {
        System.out.println("---- BOLETA ELECTRÓNICA ----");
        System.out.println("Total a pagar: S/ " + total);
        System.out.println("----------------------------");
    }
}