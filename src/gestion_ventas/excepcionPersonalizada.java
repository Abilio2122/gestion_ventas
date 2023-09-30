package gestion_ventas;


public class excepcionPersonalizada extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public excepcionPersonalizada(String mensaje) {
        super(mensaje);
    }

    public static void verificarContraseña(String contraseña) throws excepcionPersonalizada {
        if (contraseña.length() < 2) {
            throw new excepcionPersonalizada("La contraseña ingresada no es válida");
        }
    }
}


