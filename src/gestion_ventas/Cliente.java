package gestion_ventas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        
        
        public static Cliente registrar() throws IOException{
        	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("Registarse");
    		System.out.println("");
    		System.out.println("Nombre");
    		String nombre = lector.readLine();
    		System.out.println("");
    		System.out.println("Edad");
    		int edad = Integer.parseInt(lector.readLine());
    		System.out.println("");
    		System.out.println("Rut");
    		String rut = lector.readLine();
    		System.out.println("");
    		System.out.println("Contraseña");
    		String pasword = lector.readLine();
    		System.out.println("");
    		
    		Cliente cliente = new Cliente(nombre,pasword,edad);
    		cliente.setRut(rut);
    	
        	return cliente;
        }
        
        public static Cliente iniciarSesion()throws IOException {
        	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("Iniciar sesion");
    		System.out.println("");
    		System.out.println("Nombre");
    		String nombre = lector.readLine();
    		System.out.println("");
    		System.out.println("Edad");
    		int edad = Integer.parseInt(lector.readLine());
    		System.out.println("");
    		System.out.println("Rut");
    		String rut = lector.readLine();
    		System.out.println("");
    		System.out.println("Contraseña");
    		String pasword = lector.readLine();
    		System.out.println("");
    		
        	return null;
        }
        
        public void mostrarPerfil()throws IOException {
        	System.out.println("<"+nombre+">");
			System.out.println("<"+edad+">");
			System.out.println("<"+rut+">");
			//Historial de compra
        }
}
