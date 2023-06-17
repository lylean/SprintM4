import java.time.LocalDate;

public class cliente extends usuario{
private String apellidos;
private String telefono;
private String afp;
private int sistemaSalud;
private String direccion;
private String comuna;
private int edad;

public cliente(String nombre, int run , String apellidos,String telefono, String afp,
		int sistemaSalud, String direccion, String comuna, int edad) {
	super(nombre , run, null);
	this.apellidos = apellidos;
	this.telefono = telefono;
	this.afp = afp;
	this.sistemaSalud = sistemaSalud;
	this.direccion = direccion;
	this.comuna = comuna;
	this.edad = edad;
}

public cliente() {
	
}


public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getAfp() {
	return afp;
}

public void setAfp(String afp) {
	this.afp = afp;
}



public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public int getSistemaSalud() {
	return sistemaSalud;
}

public void setSistemaSalud(int sistemaSalud) {
	this.sistemaSalud = sistemaSalud;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getComuna() {
	return comuna;
}

public void setComuna(String comuna) {
	this.comuna = comuna;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String obtenerNombre() {
	return "Nombre Completo " + super.getNombre() + " " + apellidos;
}

public String obtenerSistemaSalud() {
	String resultado;
	if(sistemaSalud == 1) {
		resultado = "Su sistema de salud es Fonasa";
	}else if (sistemaSalud == 2){
		resultado = "Su sistema de salud es Isapre";
	}else { resultado = "Su sitema de salud no es valido";}
	
	return resultado;
}

@Override
public void analizarUsuario() {
	System.out.println("--------------*****************--------------");
	super.analizarUsuario();
	System.out.println("--------------Datos del cliente--------------");
	System.out.println("Direccion y comuna :" + direccion + " " + comuna);
	System.out.println("--------------*****************--------------");
}

@Override
public String toString() {
	return 
			"Apellidos: " + apellidos +
			"\nTelefono: " + telefono +
			"\nAfp=" + afp + 
			"\nSistema Salud: " + sistemaSalud + 
			"\nDireccion: " + direccion +
			"\nComuna=" + comuna + 
			"\nEdad=" + edad;
}




}
