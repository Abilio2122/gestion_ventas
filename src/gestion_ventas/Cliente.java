package gestion_ventas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Cliente {
	
       private String rut;
	private String nombre;
	private String password;
	private int edad;
	
        public Cliente(String rut,String nombre, String password, int edad) {
                this.rut = rut;
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
    		String password = lector.readLine();
    		System.out.println("");
    		
    		Cliente cliente = new Cliente(rut,nombre,password,edad);
        	return cliente;
        }
        
        /*public boolean iniciarSesion()throws IOException {
            
        	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        	
        	System.out.println("Por favor, ingrese su nombre de usuario: ");
                String clienteIngresado = lector.readLine();
                
                System.out.println("Ingrese su contraseña: ");
                String passwordIngresada = lector.readLine();
                
                // Verificar si los datos coinciden con el cliente
    		if (clienteIngresado.equals(nombre) && passwordIngresada.equals(password)) {
                    System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                    return true;
                } else {    
                    System.out.println("Inicio de sesión fallido. Por favor, verifique sus credenciales.");
                    return false;
                }
                    
        }*/         

        public String mostrarPerfil() {
            
        	return "Nombre: " + nombre + "\nRut: " + rut + "\nEdad: " + edad;
		//Historial de compra
        }
        
}
