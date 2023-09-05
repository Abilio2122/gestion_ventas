package gestion_ventas;


public class Pago{
    
    private String idPago;
    private int montoPago;
    private String metodoPago;
    
    public Pago(String idPago) {
        this.idPago = idPago;
    }
    
    public Pago(String metodoPago, int montoPago) {
        this.metodoPago = metodoPago;
        this.montoPago = montoPago;
    }
    
    public String getIdPago() {
		return idPago;
    }
    public int getMontoPago() {
		return montoPago;
    }
    public String getMetodoPago() {
		return metodoPago;
    }
    
    public void setIdPago(String idPago) {
		this.idPago = idPago;
    }
   
    public void setMontoPago(int montoPago) {
		this.montoPago = montoPago;
    }
    public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
    }
    
    public void mostrarInfo(Cliente n, Cliente r){
    	String name=n.getNombre();
    	String id=r.getRut();
    	
    	System.out.println("¿Estos son sus datos?");
        System.out.println("-"+name);
        System.out.println("-"+id);
        System.out.println("si/no");
        
        ///////////////////////////
        System.out.println("el metodo de pago es:"+metodoPago);
        
    }
}
    
    