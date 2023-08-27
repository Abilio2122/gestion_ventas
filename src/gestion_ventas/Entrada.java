package gestion_ventas;

import java.util.ArrayList;

public class Entrada {
	private String tipoEvento;
	private String idEntrada;
	private int precioEntrada;
	private ArrayList<Cliente> arrayEntradas = new ArrayList<>();

	
	public Entrada (String idEntrada, String tipoEvento, int precioEntrada) {
		this.idEntrada = idEntrada;
		this.tipoEvento = tipoEvento;
		this.precioEntrada = precioEntrada;
	}
	
	public int getPrecioEntrada() {
		return precioEntrada;
	}
	
	public String getIdEntrada() {
		return idEntrada;
	}
	
	public String getTipoEvento() {
		return tipoEvento;
	}
	
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}
	
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
}
