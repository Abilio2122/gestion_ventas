package gestion_ventas;

import java.io.IOException;

public class Eventos {
    private String idEvento;
    private String nombreEvento;
    private String fechaEvento;
    private String regionEvento;
    private int cantEntradasEvento;
    private String rangoEtario;

    
    gestionEntradas gestionEntradas = new gestionEntradas();
        
    public Eventos(String idEvento, String nombreEvento, String fechaEvento, String regionEvento, int cantEntradasEvento, String rangoEtario) {
        	this.idEvento=idEvento;
        	this.nombreEvento=nombreEvento;
        	this.fechaEvento=fechaEvento;
            this.regionEvento=regionEvento;
            this.cantEntradasEvento=cantEntradasEvento;
            this.rangoEtario = rangoEtario;
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
        
        public String getRegionEvento(){
            return regionEvento;
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
        
        public String getRangoEtario() {
        	return rangoEtario;
        }
        
        public void setRangoEtario(String rangoEtario) {
        	this.rangoEtario = rangoEtario;
        }
               
        public String mostrarEventos() {
        	return "ID: " + idEvento + "\nNombre: " + nombreEvento + "\nFecha: " + fechaEvento + "\nRegion: " + regionEvento + "\nRango Etario: " + rangoEtario;
                
        }
        
        public void agregarEntrada(Entrada entrada ){
            gestionEntradas.agregarEntrada(entrada);
        }        
        
        
        public boolean verificarLimiteEntradaEvento() {
        	try {
        	    if (cantEntradasEvento > 0) {
        	        cantEntradasEvento--;
        	        System.out.println("Ingreso Para compra de entrada exitoso!.");
        	        System.out.println("");
        	        return true;
        	    } else {
        	        throw new excepcionPersonalizada("Lamentamos decirle que no quedan entradas para este evento.");
        	    }
        	} catch (excepcionPersonalizada e) {
        	    System.out.println("Error al verificar la disponibilidad de entradas: " + e.getMessage());
        	    System.out.println("");
        	    return false;
        	}

        }

}
