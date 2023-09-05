
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
    
    private ArrayList<Eventos> listaEventos;
    private HashMap<String,Eventos> mapEventos; 
    
    
    public gestionEventos() {
    	listaEventos = new ArrayList<Eventos>();
    	mapEventos = new HashMap<String,Eventos>();
    }
    
    
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
    
    public void eliminarEvento(String idEvento) { //En caso de que activemos un apartado pa eliminar eventos aca esta
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
