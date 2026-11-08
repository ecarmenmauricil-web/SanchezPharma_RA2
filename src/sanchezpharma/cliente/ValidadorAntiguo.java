package sanchezpharma.cliente;

public class ValidadorAntiguo {
    // Valida solo enteros de 8 dígitos
    public boolean checkDni(int dniNumber) {
        return String.valueOf(dniNumber).length() == 8;
    }
}