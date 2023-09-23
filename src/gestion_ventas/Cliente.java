package gestion_ventas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Cliente {
	
       private String rut;
	private String nombre;
	private String password;
	private int edad;
	 private List<String> historialCompras = new ArrayList<>();;

        public Cliente(String rut,String nombre, String password, int edad) {
                this.rut = rut;
                this.nombre = nombre;
                this.password = password;
                this.edad = edad;
	}
	
        public String getRut() {
		return rut;
	}
       
    //Getters
        
	public String getNombre() {
		return nombre;
	}
        
	public String getPasword() {
		return password;
	}
        
	public int getEdad() {
		return edad;
	}
	
	// Setters
	
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
        
        // acerca de historial de comrpa 
        
        public void agregarCompra(String nomE) {
            historialCompras.add(nomE);
        }

        
        public String mostrarPerfil() {
            
        	return "Nombre: " + nombre + "\nRut: " + rut + "\nEdad: " + edad + "\nHistorial de compras: " + historialCompras;
        }
        
        

        
}