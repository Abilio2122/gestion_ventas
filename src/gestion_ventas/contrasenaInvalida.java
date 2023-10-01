package gestion_ventas;

public class contrasenaInvalida extends Exception {

    public contrasenaInvalida(String contraseña) {
        super(validarContraseña(contraseña));
    }

    private static String validarContraseña(String contraseña) {
        if (contraseña.length() < 2) {
            return "La contraseña ingresada no es válida: Longitud insuficiente";
        }
        return null;
    }
}
