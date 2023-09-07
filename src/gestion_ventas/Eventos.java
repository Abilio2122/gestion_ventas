package gestion_ventas;

import java.io.IOException;

public class Eventos {
	private String idEvento;
	private String nombreEvento;
	private String fechaEvento;
    private String regionEvento;
    private int cantEntradasEvento;

    
    gestionEntradas gestionEntradas = new gestionEntradas();
        
    public Eventos(String idEvento, String nombreEvento, String fechaEvento, String regionEvento) {
        	this.idEvento=idEvento;
        	this.nombreEvento=nombreEvento;
        	this.fechaEvento=fechaEvento;
            this.regionEvento=regionEvento;
	}
	
    
    	//Getters
    
        public String getIdEvento() {
        	return idEvento;
        }
        
        public String getNombreEvento(){
            return nombreEvento;
        }
                
        public String getFechaEvento(){
            return fechaEvento;
        }
        
        public int getCantEntradasEvento() {
        	return cantEntradasEvento;
        }
        
        //Setters
            
        public void setidEvento(String idEvento) {
        	this.idEvento = idEvento;
        }
        
        public void setNombreEvento(String nombreEvento) {
        	this.nombreEvento = nombreEvento;
        }
        
        public void setFechaEvento(String fechaEvento) {
        	this.fechaEvento = fechaEvento;
        }
        
        public void setRegionEvento(String regionEvento) {
        	this.regionEvento = regionEvento;
        }
        
        public void setCantEntradasEvento(int cantEntradasEvento) {
        	this.cantEntradasEvento = cantEntradasEvento;
        }
        
        
               
        public String mostrarEventos() {
        	return "ID: " + idEvento + "\nNombre: " + nombreEvento + "\nFecha: " + fechaEvento + "\nRegion: " + regionEvento;
                
        }
        
        public void agregarEntrada(Entrada entrada ){
            gestionEntradas.agregarEntrada(entrada);
        }        
        
}
