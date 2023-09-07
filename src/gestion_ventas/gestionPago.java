package gestion_ventas;

import java.util.ArrayList;

public class gestionPago {
	private ArrayList<Pago> listaPago;
    
    
    public gestionPago() {
    	listaPago = new ArrayList<Pago>();
    }
    
    public void agregarInfoPago(Pago infoPago) {
    	listaPago.add(infoPago);
    }


    
    //Hay que ver funcion mostrarMetodosPago()

    
}