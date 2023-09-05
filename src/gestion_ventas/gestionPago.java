package gestion_ventas;

import java.util.ArrayList;

public class gestionPago {
	private ArrayList<Pago> listaPago;
    
    
    public gestionPago() {
    	listaPago = new ArrayList<Pago>();
    }
    
    public void agregarMetPago(Pago metPago) {
    	listaPago.add(metPago);
    }

    public void tiposPago() {
        gestionPago gestion = new gestionPago();
        gestion.agregarMetPago(new Pago("Tarjeta de Crédito"));
        gestion.agregarMetPago(new Pago("Tarjeta debito"));
        gestion.agregarMetPago(new Pago("WebPay"));
        gestion.agregarMetPago(new Pago("Mercado Pago"));
        gestion.agregarMetPago(new Pago("Transferencia Bancaria"));
    }
}

	/*public void mostrarMetodosPago() {
        System.out.println("Métodos de Pago Disponibles:");
        for (String metodo : listaPago) {
            System.out.println(metodo);
        }
    }*/