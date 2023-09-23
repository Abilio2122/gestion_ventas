
package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class gestionEventos {
    
    private ArrayList<Eventos> listaEventos;
    private HashMap<String,Eventos> mapEventos; 
    
    
    public gestionEventos() {
    	listaEventos = new ArrayList<Eventos>();
    	mapEventos = new HashMap<String,Eventos>();
    }
    
    public void importarEventosDesdeCSV(String archivoCSV) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 5) { 
                    String idEvento = campos[0];
                    String nombreEvento = campos[1];
                    String fechaEvento = campos[2];
                    String regionEvento = campos[3];
                    int cantEntradasEvento = Integer.parseInt(campos[4]); // Obtener el número de entradas desde el CSV
                    Eventos evento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento, cantEntradasEvento);
                    agregarEvento(evento);
                } else {
                    System.out.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al importar eventos desde el archivo CSV: " + e.getMessage());
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
                //throw new Exception("Ya existe este evento o la Id fue mal ingresada.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //agrega evento de forma manual dando valores detalle por detalle
    public void agregarEvento(String idEvento, String nombreEvento, String fechaEvento, String regionEvento, int cantidadEntrada) {
        Eventos nuevoEvento = new Eventos(idEvento, nombreEvento, fechaEvento, regionEvento, cantidadEntrada);
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
                throw new Exception("El evento con ID " + idEvento + " no existe.");
            }
        } catch (Exception e) {
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
    
    
    
}
