
package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class gestionEventos {
    
    private ArrayList<Eventos> listaEventos;
    private HashMap<String,Eventos> mapEventos; 
    
    
    public ArrayList<Eventos> getListaEventos() {
        return listaEventos;
    }
    
    public gestionEventos() {
    	listaEventos = new ArrayList<Eventos>();
    	mapEventos = new HashMap<String,Eventos>();
    }

    public void importarEventosDesdeCSV(String archivoCSV) {
    	try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
    	    String linea;
    	    int numeroLinea = 1; // Variable para rastrear el número de línea
    	    br.readLine();
    	    while ((linea = br.readLine()) != null) {
    	        String[] campos = linea.split(",");
    	        if (campos.length == 6) {
    	            String idEvento = campos[0];
    	            String nombreEvento = campos[1];
    	            String fechaEvento = campos[2];
    	            String regionEvento = campos[3];
    	            int cantEntradasEvento = Integer.parseInt(campos[4]);
    	            String rangoEtario = campos[5];
    	            Eventos evento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento, cantEntradasEvento, rangoEtario);
    	            agregarEvento(evento);
    	        } else {
    	            throw new excepcionPersonalizada("Error en la línea " + numeroLinea + ": La línea no tiene el formato esperado.");
    	        }
    	        numeroLinea++;
    	    }
    	} catch (excepcionPersonalizada e) {
    	    System.out.println("Error en la importación CSV: " + e.getMessage());
    	} catch (IOException e) {
			e.printStackTrace();
		}

    }

    
    // agregar evento con una variable de tipo evento
    public void agregarEvento(Eventos evento) {
    	try {
    	    if (!mapEventos.containsKey(evento.getIdEvento())) {
    	        listaEventos.add(evento);
    	        mapEventos.put(evento.getIdEvento(), evento);
    	        //System.out.println("Evento agregado correctamente.");
    	    } else {
    	        throw new excepcionPersonalizada("Ya existe este evento o la ID fue mal ingresada.");
    	    }
    	} catch (excepcionPersonalizada e) {
    	    System.out.println("Error: " + e.getMessage());
    	}

    }
    //agrega evento de forma manual dando valores detalle por detalle
    public void agregarEvento(String idEvento, String nombreEvento, String fechaEvento, String regionEvento, int cantidadEntrada,String rangoEtario) {
        Eventos nuevoEvento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento, cantidadEntrada,rangoEtario);
        agregarEvento(nuevoEvento);
        
        
    }
    
    public Eventos buscarEventoPorID(String id) { 
        if(mapEventos.containsKey(id)) {
        	return mapEventos.get(id);
        }
        return null;
    }
    
    
    public void eliminarEvento(String idEvento) {
    	try {
    	    if (mapEventos.containsKey(idEvento)) {
    	        Eventos elimina3 = mapEventos.remove(idEvento);
    	        listaEventos.remove(elimina3);
    	        System.out.println("Evento eliminado correctamente.");
    	    } else {
    	        throw new excepcionPersonalizada("El evento con ID " + idEvento + " no existe.");
    	    }
    	} catch (excepcionPersonalizada e) {
    	    System.out.println("Error: " + e.getMessage());
    	}

    }
    
    public void listarEventos() {
    	if(mapEventos.isEmpty()) {
    		System.out.println("La lista de Eventos esta vacia");
    	}
        for(Eventos evento : listaEventos) {
        	System.out.println(evento.mostrarEventos());
        	System.out.println();
        }
    }
    
    public ArrayList<Eventos> obtenerEventosPorRegion(String nombreRegion) {
        ArrayList<Eventos> eventosPorRegion = new ArrayList<>();
        
        for (Eventos evento : listaEventos) {
            if (evento.getRegionEvento().toLowerCase().contains(nombreRegion.toLowerCase())) {
                eventosPorRegion.add(evento);
            }
        }
        
        return eventosPorRegion;
    }

}
