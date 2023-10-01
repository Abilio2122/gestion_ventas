package gestion_ventas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String rut;
	private String nombre;
	private String password;
	private int edad;
	private List<String> historialCompras;
    private ArrayList<Eventos> listaEventos;

        public Cliente(String rut,String nombre, String password, int edad) {
                this.rut = rut;
                this.nombre = nombre;
                this.password = password;
                this.edad = edad;
                historialCompras = new ArrayList<>();
                listaEventos = new ArrayList<>();
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
    		
    		String password = null;
    		
    		
    		do {
    		    try {
    		        System.out.println("Contraseña");
    		        password = lector.readLine();

    		        if (password != null) {
    		            throw new contrasenaInvalida(password);
    		        }

    		    } catch (contrasenaInvalida e) {
    		        System.out.println(e.getMessage());
    		    }
    		} while (password != null && password.length() < 2);


    		System.out.println("");

    		Cliente cliente = new Cliente(rut, nombre, password, edad);
    		return cliente;

        }
        // acerca de historial de comrpa 
        
        public void agregarCompra(String nomE) {
            historialCompras.add(nomE);
        }
       
        
        public String mostrarPerfil() {
            return "Nombre: " + nombre + "\nRut: " + rut + "\nEdad: " + edad + "\nHistorial de compras: " + historialCompras + "\n";
        }
        
        
    public void agregarEvento(Eventos evento) {
        listaEventos.add(evento);
    }
    
    public void mostrarListaEventos() {
        if (listaEventos.isEmpty()) {
            System.out.println("La lista de eventos está vacía.");
        } else {
            System.out.println("Lista de eventos comprados de" + nombre + ":");
            for (Eventos evento : listaEventos) {
                System.out.println(evento.mostrarEventos());
                System.out.println(); // Salto de línea entre eventos
            }
        }
    }
        
    
}
