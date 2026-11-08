package sanchezpharma.configuracion;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instancia;
    private String nombreEmpresa;
    private String moneda;

    private ConfiguracionSistema() {
        this.nombreEmpresa = "Droguería Sánchez Pharma";
        this.moneda = "PEN (Soles)";
    }

    public static synchronized ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public String getMoneda() { return moneda; }
}

