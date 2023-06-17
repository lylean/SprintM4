
public class accidente {
private int identificadorAccidente;
private int rut;
private String dia;
private String hora;
private String lugar;
private String origen;
private String consecuencias;

public accidente(int identificadorAccidente, int rut, String dia, String hora, String lugar, String origen,
		String consecuencias) {
	this.identificadorAccidente = identificadorAccidente;
	this.rut = rut;
	this.dia = dia;
	this.hora = hora;
	this.lugar = lugar;
	this.origen = origen;
	this.consecuencias = consecuencias;
}

public accidente() {
	
}

public int getIdentificadorAccidente() {
	return identificadorAccidente;
}

public void setIdentificadorAccidente(int identificadorAccidente) {
	this.identificadorAccidente = identificadorAccidente;
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

public String getOrigen() {
	return origen;
}

public void setOrigen(String origen) {
	this.origen = origen;
}

public String getConsecuencias() {
	return consecuencias;
}

public void setConsecuencias(String consecuencias) {
	this.consecuencias = consecuencias;
}

@Override
public String toString() {
	return "Identificador Accidente: " + identificadorAccidente + 
			"\nRut: " + rut + 
			"\nDia=" + dia + 
			"\nHora: "+ hora + 
			"\nLugar: " + lugar + 
			"\nOrigen: " + origen + 
			"\nConsecuencias: " + consecuencias;
}



}



