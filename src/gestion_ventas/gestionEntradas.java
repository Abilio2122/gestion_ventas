package gestion_ventas;

import java.util.ArrayList;
import java.util.HashMap;

public class gestionEntradas {
	private ArrayList<Entrada> listaEntradas = new ArrayList<>();
    private HashMap<String,Entrada> mapEntradas = new HashMap(); 
    
    
    public void agregarEntrada(Entrada entrada) {
    	
    	if(!mapEntradas.containsKey(entrada.getIdEntrada())) {
    		listaEntradas.add(entrada);
    		mapEntradas.put(entrada.getIdEntrada(), entrada);
            System.out.println("Entrada agregada correctamente");
    	}
    	else {
    		System.out.println("Ya existe esta entrada o la Id fue mal ingresada");
    	}
    }
}
