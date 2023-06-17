import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class usuario implements asesoria{
private String nombre;
private LocalDate fechaNac;
private int run;
	
	
	public usuario(String nombre,  int run ,LocalDate fechaNac) {
	this.nombre = nombre;
	this.run = run;
	this.fechaNac = fechaNac;
}

	public usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	
	public void mostrarEdad() {
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fecha = fechaActual.format(formato);
 		Period periodo = Period.between(fechaNac , LocalDate.parse(fecha , formato));
		int edad = periodo.getYears();
		System.out.println("El usuario tiene " + edad + " años");
	}
	
	
	
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre +
				"\nRun: " + run);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + 
				"\nFecha de Nacimiento: " + fechaNac + 
				"\n Run: " + run;
	}

	
	
}
