
public class revision {
	private int identificadorRevision;
	private int identificadorVisitaTerreno; 
	private String nombreRevision;
	private String detalle;
	private int estado;
	
	
	public revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreRevision, String detalle,
			int estado) {
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	
	public revision() {
		
	}

	public int getIdentificadorRevision() {
		return identificadorRevision;
	}

	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}

	public int getIdentificadorVisitaTerreno() {
		return identificadorVisitaTerreno;
	}

	public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
		this.identificadorVisitaTerreno = identificadorVisitaTerreno;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Identificador Revision: " + identificadorRevision + 
				"\nIdentificador Visita Terreno: " + identificadorVisitaTerreno + 
				"\nNombre de Revision: " + nombreRevision + 
				"\nDetalle: " + detalle+ 
				"\nEstado: " + estado;
	}
	
	
}
