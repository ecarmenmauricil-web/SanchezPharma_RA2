package sanchezpharma.cliente;

public class ValidadorAdapter implements IValidadorCliente {
    private ValidadorAntiguo validadorAntiguo;

    public ValidadorAdapter(ValidadorAntiguo validador) {
        this.validadorAntiguo = validador;
    }

    @Override
    public boolean validarDocumento(String documento) {
        try {
            int dni = Integer.parseInt(documento);
            return validadorAntiguo.checkDni(dni);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}