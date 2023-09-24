package gestion_ventas;

import java.util.ArrayList;

public class Recomendacion {
	public void recomendacion(Cliente cliente, gestionEventos gestor) {
    	int edadC = cliente.getEdad();
    	
    	ArrayList<Eventos> listaEventos = gestor.getListaEventos();
    	for (Eventos evento : listaEventos) {
            String rangoEtario = evento.getRangoEtario();
            String[] edades = rangoEtario.split("-");
            
            if(edades.length == 2) {
            	int edadMin = Integer.parseInt(edades[0]);
            	int edadMax = Integer.parseInt(edades[1]);
            	
            	if(edadC >= edadMin && edadC <= edadMax) {
            		System.out.println("ID: " + evento.getIdEvento() + "\nNombre: " + evento.getNombreEvento() + "\nFecha: " + evento.getFechaEvento() + "\nRegion: " + evento.getRegionEvento() + "\nRango Etario: " + rangoEtario);
            	}
            }
    	}
    }
}
