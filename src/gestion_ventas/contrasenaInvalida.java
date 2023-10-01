package gestion_ventas;

public class contrasenaInvalida extends Exception {

    public contrasenaInvalida(String contraseña) {
        super(validarContraseña(contraseña));
    }

    private static String validarContraseña(String contraseña) {
        if (contraseña.length() < 2) {
            return "La contraseña ingresada no es válida: Longitud insuficiente";
        }
        // Agrega aquí más condiciones de validación según tus requerimientos
        // Por ejemplo, si la contraseña debe contener números y letras, puedes agregar esa validación.

        // Si la contraseña cumple con todos los requisitos, devuelve null para indicar que es válida.
        return null;
    }
}
