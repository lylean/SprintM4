import java.time.LocalDate;

public class administrativo extends usuario {
	private String area;
	private String expPrevia;
	
	
	public administrativo(String nombre, int run,String area, String expPrevia) {
		super(nombre, run , null);
		this.area = area;
		this.expPrevia = expPrevia;
	}
	
	public administrativo() {
		
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getExpPrevia() {
		return expPrevia;
	}


	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("--------------Datos del administrativo--------------");
		System.out.println("Area: " + area + 
				"\nExperiencia Previa: " +  expPrevia);
	}

	@Override
	public String toString() {
		return "Area: " + area + 
				"\nExperiencia Previa: " + expPrevia;
	}
	
	
	

}