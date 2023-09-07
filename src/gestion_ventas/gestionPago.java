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
    
    public void pagomostrarMetodosPago(){
        System.out.println("Tarjeta De Credito  <(1)>");
        System.out.println("Tarjeta Debito  <(2)>");
        System.out.println("WebPay  <(3)>");
        System.out.println("Mercado Pago  <(4)>");
        System.out.println("Cancelar  <(5)>");
    }
}