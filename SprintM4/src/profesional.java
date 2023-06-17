import java.time.LocalDate;

public class profesional extends usuario{
	private String titulo;
	private LocalDate fechaIngreso;
	
	public profesional(String nombre , int run, String titulo, LocalDate fechaIngreso) {
		super(nombre, run , null);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public profesional() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("--------------Datos del profesional--------------");
		System.out.println("Titulo: " + titulo + 
				"\nFecha de Ingreso: " +  fechaIngreso);
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + 
				"\nFecha de Ingreso: " + fechaIngreso;
	}
	
	
	
}
