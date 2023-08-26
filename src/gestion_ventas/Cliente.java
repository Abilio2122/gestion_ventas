package gestion_ventas;

public class Cliente {
	
	private String nombre;
	private String rut;
	private int edad;
	
	public Cliente(String rut) {
		this.rut = rut;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getRut() {
		return rut;
	}
	public int getEdad() {
		return edad;
	}
	
	
}
