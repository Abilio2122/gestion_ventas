
package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.io.BufferedReader;
/**
 *
 * @author karth
 */
public class gestionEventos {
    
    private ArrayList<Eventos> listaEventos = new ArrayList<>();
    private HashMap<String,Eventos> mapEventos = new HashMap(); 
    
    //private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    public void agregarEvento(Eventos evento) {
    	
    	if(!mapEventos.containsKey(evento.getIdEvento())) {
    		listaEventos.add(evento);
    		mapEventos.put(evento.getIdEvento(), evento);
            System.out.println("Evento agregado correctamente.");
    	}
    	else {
    		System.out.println("Ya existe este evento o la Id fue mal ingresada");
    	}
        
        /*try {
            System.out.println("Ingrese el id del evento:");
            String idEvento = lector.readLine();
            
            System.out.println("Ingrese el nombre del evento:");
            String nombreEvento = lector.readLine();

            System.out.println("Ingrese la fecha del evento:");
            String fechaEvento = lector.readLine();

            System.out.println("Ingrese la región del evento:");
            String regionEvento = lector.readLine();
            
            Eventos evento = new Eventos(idEvento,nombreEvento, fechaEvento, regionEvento);
            listaEventos.add(evento);

            System.out.println("Evento agregado correctamente.");
            
        } catch (IOException e) {
            System.err.println("Error al leer la entrada del usuario.");
        }*/
        
    }
    public void agregarEvento(String idEvento, String nombreEvento, String fechaEvento, String regionEvento) {
        Eventos nuevoEvento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento);
        agregarEvento(nuevoEvento);
    }
    
    public Eventos buscarEventoPorID(String id) { 
        if(mapEventos.containsKey(id)) {
        	return mapEventos.get(id);
        }
        return null;
    }
    
    public void eliminarEvento(String idEvento) { //En casod e que activemos un apartado pa eliminar eventos aca esta
    	if(mapEventos.containsKey(idEvento)) {
    		Eventos elimina3 = mapEventos.remove(idEvento);
    		listaEventos.remove(elimina3);
    	}
    }
    
    public void listarEventos() {
    	if(mapEventos.isEmpty()) {
    		System.out.println("La lista de Eventos esta vacia");
    	}
        for(Eventos evento : listaEventos) {
        	System.out.println(evento.mostrarEventos());
        }
    }
    
}
