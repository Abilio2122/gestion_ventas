package gestion_ventas;

public class Eventos {
	private String idEvento;
	private String nombreEvento;
	private String fechaEvento;
        private String regionEvento;
	
	public Eventos(String idEvento) {
		this.idEvento=idEvento;
	}
        
        public Eventos(String nombreEvento, String fechaEvento, String regionEvento) {
		this.nombreEvento=nombreEvento;
		this.fechaEvento=fechaEvento;
                this.regionEvento=regionEvento;
	}
	
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
}
