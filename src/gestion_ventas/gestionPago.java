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
<<<<<<< HEAD
    
    //por ver
    public void tiposPago() {
        gestionPago gestion = new gestionPago();
        gestion.agregarMetPago(new Pago("Tarjeta de Crédito <(0)>"));
        gestion.agregarMetPago(new Pago("Tarjeta debito <(1)>"));
        gestion.agregarMetPago(new Pago("WebPay <(2)>"));
        gestion.agregarMetPago(new Pago("Mercado Pago <(3)>"));
        gestion.agregarMetPago(new Pago("Transferencia Bancaria <(4)>"));
    }
=======

>>>>>>> branch 'master' of https://github.com/Abilio2122/gestion_ventas.git

<<<<<<< HEAD
	public void mostrarMetodosPago() {
        System.out.println("Métodos de Pago Disponibles:");
        for (Pago pago : listaPago) {
            System.out.println(pago);
        }
    }
=======
    
    //Hay que ver funcion mostrarMetodosPago()
>>>>>>> branch 'master' of https://github.com/Abilio2122/gestion_ventas.git

    
}