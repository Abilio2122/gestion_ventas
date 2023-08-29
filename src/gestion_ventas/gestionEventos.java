
package gestion_ventas;

import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
/**
 *
 * @author karth
 */
public class gestionEventos {
    
    private ArrayList<Eventos> listaEventos = new ArrayList<>();
    private BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    public void agregarEvento() {
        
        try {
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
        }
        
    }
    
    public Eventos buscarEventoPorID(String id) {
        for (Eventos evento : listaEventos) {
            if (evento.getIdEvento().equals(id)) {
                return evento; // Retorna el evento encontrado
            }
        }
        return null; // Retorna null si no se encontró el evento con el ID especificado
    }
    
    public ArrayList<Eventos> listarEventos() {
        return listaEventos;
    }
    
}
