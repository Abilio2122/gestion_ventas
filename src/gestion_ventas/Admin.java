package gestion_ventas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Admin {
	private gestionEventos eventos = new gestionEventos();
    private String contrasena;
    private String archivoCSV; // Ruta del archivo CSV de eventos

    public Admin(String contrasena, String archivoCSV) {
        this.contrasena = contrasena;
        this.archivoCSV = archivoCSV;
    }


    public boolean verificarContrasena(String contrasenaIngresada) {
        return this.contrasena.equals(contrasenaIngresada);
    }

    public void agregarEvento(Eventos evento) {
        // Agregar el evento al archivo CSV
        guardarEnCSV(evento);
        
     // Recargar los eventos desde el archivo CSV
        eventos.importarEventosDesdeCSV(archivoCSV);
    }

    private void guardarEnCSV(Eventos evento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCSV, true))) {
            // Escribe los datos del evento en el formato CSV
            String lineaCSV = evento.getIdEvento() + "," +
                              evento.getNombreEvento() + "," +
                              evento.getFechaEvento() + "," +
                              evento.getRegionEvento() + "," +
                              evento.getCantEntradasEvento() + "," +
                              evento.getRangoEtario();
            writer.write(lineaCSV);
            writer.newLine(); // Agrega una nueva línea para el siguiente evento
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV de eventos.");
        }
    }
}
