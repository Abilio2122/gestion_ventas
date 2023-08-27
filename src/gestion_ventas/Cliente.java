package gestion_ventas;

public class Cliente {
	
        private String rut;
	private String nombre;
	private String password;
	private int edad;
	
	public Cliente(String rut) {
		this.rut = rut;
	}
        public Cliente(String nombre, String password, int edad) {
		this.nombre = nombre;
                this.password = password;
                this.edad = edad;
	}
	
        public String getRut() {
		return rut;
	}
        
	public String getNombre() {
		return nombre;
	}
        
	public String getPasword() {
		return password;
	}
        
	public int getEdad() {
		return edad;
	}
	
        public void setRut(String rut) {
		this.rut = rut;
	}
	
        public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        public void setPassword(String password) {
		this.password= password;
	}
        
        public void setEdad(int edad) {
		this.edad = edad;
	}
}
