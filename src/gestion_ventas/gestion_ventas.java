package gestion_ventas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class gestion_ventas {
    
    
    public static void main(String[] args)throws IOException {
            
        gestionCliente gestionCliente = new gestionCliente();
        gestionEventos gestionEventos = new gestionEventos();
        gestionPago gestionPago = new gestionPago();
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("------------------------------");
        System.out.println("|      EventSales Pro        |");
        System.out.println("------------------------------");
		
        System.out.println("- Registrarse (1)");
        System.out.println("- Salir (2)");
        
        int opc = Integer.parseInt(lector.readLine());
        
        
        
        switch (opc) {

            case 1:
            	 Cliente nuevoCliente = Cliente.registrar();
                 gestionCliente.agregarCliente(nuevoCliente);
                 break;
			
            case 2:
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
            
            gestionEventos.agregarEvento(new Eventos("2345","One piece","31 de agosto","Viña del Mar"));
			
            switch(opc2) {
                        
                case 1:
                            
                    System.out.println("------------------------------");
                    System.out.println("|           Perfil           |");
                    System.out.println("------------------------------");
						
                    gestionCliente.listar();
                    break;
					
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("|           Eventos          |");
                    System.out.println("------------------------------");
                    gestionEventos.listarEventos(); 
                    System.out.println("");
                    
                    System.out.println("Ingrese la Id del evento al que desea asistir");
                    String i_d = lector.readLine();
                    Eventos encontrado = gestionEventos.buscarEventoPorID(i_d);
                    if(encontrado != null) {
                    	System.out.println("Evento encontrado:");
                    	System.out.println(encontrado.mostrarEventos());
                    	
                    	//aqui trabajo con 
                    	
                    	
                    	//Aqui debemos seguir con el pago
                        
                        
                        
                        gestionPago.mostrarMetodosPago(); //Se muestran los metodos de pago disponibles
                        
                        
                        
                    }else {
                    	System.out.println("El id ingresado no existe");
                    }
                    break;
					
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("|        Recomendaciones     |");
                    System.out.println("------------------------------");
                    System.out.println("Segun tu edad, estos son los eventos que te recomendamos");
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
                            
                        	System.out.println("Ingrese el id del evento:");
                            String idEvento = lector.readLine();
                            
                            System.out.println("Ingrese el nombre del evento:");
                            String nombreEvento = lector.readLine();

                            System.out.println("Ingrese la fecha del evento:");
                            String fechaEvento = lector.readLine();

                            System.out.println("Ingrese la región del evento:");
                            String regionEvento = lector.readLine();
                            
                            String idEntrada =idEvento;
                            
                            System.out.println("Ingrese el tipo de evento:");
                            String typeEvent = lector.readLine();
                            
                            System.out.println("Ingrese el precio que tendrá la entrada:");
                            int precioEntrada = Integer.parseInt(lector.readLine());
                            


                            
                            Eventos nuevoEvento = new Eventos(idEvento,nombreEvento, fechaEvento, regionEvento);
                            gestionEventos.agregarEvento(nuevoEvento);
                            
                            System.out.println("");
                            
                            //Se implentará en un futuro un límite de entradas fijas para un evento//
                            
                            Entrada nuevaEntrada = new Entrada(idEntrada,typeEvent,precioEntrada);
                            nuevoEvento.agregarEntrada(nuevaEntrada);

                            
                            
                            
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
