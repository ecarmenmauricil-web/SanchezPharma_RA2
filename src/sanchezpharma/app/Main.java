package sanchezpharma.app;

import sanchezpharma.configuracion.ConfiguracionSistema;
import sanchezpharma.cliente.*;
import sanchezpharma.producto.*;
import sanchezpharma.venta.*;
import sanchezpharma.descuento.*;
import sanchezpharma.comprobante.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");

        // 1. SINGLETON
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        System.out.println("Iniciando Sistema de: " + config.getNombreEmpresa());
        System.out.println("=====================================================\n");

        // 2. ADAPTER
        System.out.println(">> VALIDANDO CLIENTE (Patrón Adapter)");
        IValidadorCliente validador = new ValidadorAdapter(new ValidadorAntiguo());
        String dniCliente = "74125896";
        boolean esValido = validador.validarDocumento(dniCliente);
        System.out.println("DNI " + dniCliente + " ¿es válido?: " + (esValido ? "SÍ" : "NO"));
        System.out.println();

        // 3. COMPOSITE
        System.out.println(">> ARMANDO PRODUCTOS (Patrón Composite)");
        ArticuloVendible pastilla = new ProductoIndividual("Paracetamol 500mg", 1.50);
        ArticuloVendible vitamina = new ProductoIndividual("Vitamina C", 3.50);
        KitProductos kitSalud = new KitProductos("Kit Salud Básica");
        kitSalud.agregarArticulo(pastilla);
        kitSalud.agregarArticulo(vitamina);
        kitSalud.mostrarDetalle();
        System.out.println("Precio total del Kit: S/ " + kitSalud.getPrecio());
        System.out.println();

        // 4. BUILDER
        System.out.println(">> REGISTRANDO VENTA (Patrón Builder)");
        VentaBuilder builder = new VentaBuilder();
        Venta miVenta = builder.asignarCliente("Cliente General")
                .agregarItem(kitSalud.getNombre(), kitSalud.getPrecio())
                .construir();
        miVenta.mostrarResumen();
        System.out.println();

        // 5. DECORATOR
        System.out.println(">> CALCULANDO TOTALES (Patrón Decorator)");
        IVentaMonto ventaProcesada = new VentaMontoBase(kitSalud.getPrecio());
        ventaProcesada = new DescuentoTerceraEdadDecorator(ventaProcesada);
        double totalFinal = ventaProcesada.calcularTotal();
        System.out.println("Monto Final a Pagar: S/ " + totalFinal);
        System.out.println();

        // 6. FACTORY METHOD
        System.out.println(">> GENERANDO COMPROBANTE (Patrón Factory Method)");
        ComprobanteFactory factory = new BoletaFactory();
        Comprobante comprobante = factory.crearComprobante();
        comprobante.generar(totalFinal);
    }
}