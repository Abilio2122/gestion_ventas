package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;

public class gestionEntradas {
private ArrayList<Entrada> listaEntradas;
    private HashMap<String,Entrada> mapEntradas; 
    
    public gestionEntradas() {
    	listaEntradas = new ArrayList<Entrada>();
    	mapEntradas = new HashMap<String,Entrada>();
    }
    
    public void agregarEntrada(Entrada entrada) {
        try {
            if (!mapEntradas.containsKey(entrada.getIdEntrada())) {
                listaEntradas.add(entrada);
                mapEntradas.put(entrada.getIdEntrada(), entrada);
                System.out.println("Entrada agregada correctamente.");
            } else {
                throw new Exception("Ya existe esta entrada o la ID fue mal ingresada.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public void agregarEntrada(String idEntrada, String tipoEvento, int precioEntrada) {
        Entrada nuevaEntrada = new Entrada(idEntrada, tipoEvento, precioEntrada);
        agregarEntrada(nuevaEntrada);
    }
    
    public Entrada buscarEntradaPorID(String id) { 
        if(mapEntradas.containsKey(id)) {
        	return mapEntradas.get(id);
        }
        return null;
    }

}
