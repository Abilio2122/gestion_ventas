package gestion_ventas;

import java.util.ArrayList;

public class Entrada {
    private String idEntrada;
	private String tipoEvento;
	private int precioEntrada;

	
	public Entrada (String idEntrada, String tipoEvento, int precioEntrada) {
		this.idEntrada = idEntrada;
		this.tipoEvento = tipoEvento;
		this.precioEntrada = precioEntrada;
	}

	//Getters
	
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	
	public String getIdEntrada() {
		return idEntrada;
	}
	
	public String getTipoEvento() {
		return tipoEvento;
	}
    
	// Setters 
	
    public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}
	
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
}
