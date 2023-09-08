package gestion_ventas;

import java.util.ArrayList;
import java.io.*;

public class gestionPago {
	private ArrayList<Pago> listaPago;
        
        private ArrayList<String> metodosDePago;
        
    
    public gestionPago() {
    	listaPago = new ArrayList<Pago>();
        metodosDePago = new ArrayList<>();
        metodosDePago.add("Tarjeta De Credito");
        metodosDePago.add("Tarjeta Debito");
        metodosDePago.add("WebPay");
        metodosDePago.add("Mercado Pago");
    }
    

      
        //Funcion efectuarPago, aún falta por ver.
    
    public void efectuarPago(String idPago)throws IOException{
        System.out.println("Elige un metodo de pago:");
        System.out.println("");
        for (int i = 0; i < metodosDePago.size(); i++) {
            System.out.println(i + ": " + metodosDePago.get(i));
        }
        
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int opc;
        
        
        try {
            opc = Integer.parseInt(lector.readLine());
            
            if (opc >= 0 && opc < metodosDePago.size()) {
                String metodoElegido = metodosDePago.get(opc);
                System.out.println("Has elegido: " + metodoElegido);
                System.out.println("");
                
                Pago nuevoPago = new Pago(idPago,metodoElegido, 13);
                
                listaPago.add(nuevoPago);
                
                
            } else {
                System.out.println("Ha cancelado");
                
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un número válido.");
        }
        
        
        
    }
}