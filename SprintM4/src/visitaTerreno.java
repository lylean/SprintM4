public class visitaTerreno {
	private int identificadorVisitaTerreno;
	private int rut;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	public visitaTerreno(int identificadorVistaTerreno, int rut, String dia, String hora, String lugar,
			String comentarios) {
		this.identificadorVisitaTerreno = identificadorVistaTerreno;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public int getIdentificadorVisitaTerreno() {
		return identificadorVisitaTerreno;
	}

	public void setIdentificadorVisitaTerreno(int identificadorVistaTerreno) {
		this.identificadorVisitaTerreno = identificadorVistaTerreno;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Identificador Visita Terreno: " + identificadorVisitaTerreno + 
				"\nRut: " + rut + 
				"\nDia: " + dia + 
				"\nHora: " + hora + 
				"\nLugar: " + lugar + 
				"\nComentarios: " + comentarios;
	}

	
	
}
