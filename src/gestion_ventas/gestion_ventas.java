package gestion_ventas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.ArrayList;

public class gestion_ventas {
    
    
    public static void main(String[] args)throws IOException {
            
        gestionCliente gestionCliente = new gestionCliente();
        gestionEventos gestionEventos = new gestionEventos();
        
        Cliente logeado = null;
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("------------------------------");
        System.out.println("|      EventSales Pro        |");
        System.out.println("------------------------------");
		
        System.out.println("- Iniciar sesion (1)"); //Falta elaborar 
        System.out.println("- Registrarse (2)");
        System.out.println("- Salir (3)");
        
        int opc = Integer.parseInt(lector.readLine());
        
        switch (opc) {

            case 1:
                if (logeado == null) {
                    System.out.println("No se ha registrado ningún cliente. Regístrese primero.");
                } else {
                    boolean inicioSesionExitoso = logeado.iniciarSesion();
                    if (inicioSesionExitoso) {
                        // El inicio de sesión fue exitoso, puedes realizar acciones adicionales aquí
                        break;
                    }
                }
                break;

			
            case 2:
                Cliente nuevoCliente = Cliente.registrar();
                gestionCliente.agregarCliente(nuevoCliente);
                break;
			
            case 3:
                System.out.println("------------------------------");
                System.out.println("|            Adios           |");
                System.out.println("------------------------------");
                System.out.println("");
                System.out.println("Muchas Gracias Por Preferirnos");
                System.out.println("------------------------------");
                return;
			
            default:
     
                System.out.println("Ingrese una opcion valida");
                break;
		
        }
		
        while(true) {
            
            System.out.println("------------------------------");
            System.out.println("|    Seleccione una opcion   |");
            System.out.println("------------------------------");
			
            System.out.println("- Ver Perfil (1)");
            System.out.println("- Ver Eventos Disponibles (2)");
            System.out.println("- Ver Recomendaciones (3)");
            System.out.println("- Ver Regiones (4)");
            System.out.println("- (Admin)-Agregar Evento(5)");
            System.out.println("- Cerrar Sesion (6)");
            
            int opc2 = Integer.parseInt(lector.readLine());
			
			
            switch(opc2) {
                        
                case 1:
                            
                    System.out.println("------------------------------");
                    System.out.println("|           Perfil           |");
                    System.out.println("------------------------------");
						
                    logeado.mostrarPerfil();
                    break;
					
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("|           Eventos          |");
                    System.out.println("------------------------------");
                    //
                    ArrayList<Eventos> eventos = gestionEventos.listarEventos();
                    for (Eventos evento : eventos) {
                        System.out.println("ID: " + evento.getIdEvento());
                        System.out.println("Nombre: " + evento.getNombreEvento());
                        System.out.println("Fecha: " + evento.getFechaEvento());
                        System.out.println("Región: " + evento.getRegionEvento());
                        System.out.println();
                    }                     
                    break;
					
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("|        Recomendaciones     |");
                    System.out.println("------------------------------");
                    System.out.println("Segun tu edad, estos son los eventos qeu te recomendamos");
                    //Deaspues hacemos lo de los rango de edad para las recomendaciones
                    break;
					
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("|           Regiones         |");
                    System.out.println("------------------------------");
				
                    System.out.println("Ingrese la region en la que desea buscar eventos");
                    String reg = lector.readLine();
                    break;
					
                case 5:
                    // Solicitar el "rut" del usuario
                    System.out.println("Ingrese contrseña de admin:");
                    try {
                        String contraIngresado = lector.readLine();

                        // Verificar si el "rut" es válido (por ejemplo, compararlo con un "rut" permitido)
                        if (contraIngresado.equals("123")) {
                            // Rut válido, permitir agregar eventos
                            
                            gestionEventos.agregarEvento();
                            
                        } else {
                            // Rut no válido, mostrar un mensaje de error
                            System.out.println("Lo siento, no tiene permiso para agregar eventos.");
                        }
                    } catch (IOException e) {
                        System.err.println("Error al leer la entrada del usuario.");
                    }                    
                    
                    break;
				
                case 6:
                    System.out.println("------------------------------");
                    System.out.println("|            Adios           |");
                    System.out.println("------------------------------");
                    System.out.println("");
                    System.out.println("Muchas Gracias Por Preferirnos");
                    System.out.println("------------------------------");
                    return;
                    
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                    
            }
        }
        
    }
    
}
