package gestion_ventas;


public class Pago{
    
    private String metodoPago;
    
    public Pago(String metodoPago) {

        this.metodoPago = metodoPago;
    }
    public void mostrarInfo(Cliente n, Cliente r){
    	String name=n.getNombre();
    	String id=r.getRut();
    	
    	System.out.println("¿Estos son sus datos?");
        System.out.println("-"+name);
        System.out.println("-"+id);
        System.out.println("si/no");
        System.out.println("el metodo de pago es:"+metodoPago);
        
    }
    

    

}
    
    