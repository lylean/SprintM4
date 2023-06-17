import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class main {
 private static contenedor contenedores;
 
	public static void main(String[] args) {
		Scanner Pan = new Scanner(System.in);
		contenedores = new contenedor();
		
		int opcion;
		do {
			mostrarMenu();
			opcion = Integer.parseInt(Pan.nextLine());
			switch(opcion) {
			case 1:
				agregarCliente(Pan);
				break;
			case 2:
				agregarProfesional(Pan);
				break;
			case 3:
				agregarAdministrativo(Pan);
				break;
			case 4:
				agregarCapacitacion(Pan);
				break;
			case 5:
				eliminarUsuario(Pan);
				break;
			case 6:
				listarUsuarios();
				break;
			case 7:
				listarUsuariosPorTipo(Pan);				
				break;
			case 8:
				listarCapacitaciones();
				break;
			case 9:
				System.out.println("Saliendo del programa...");
				break;
				
			default:System.out.println("Opcion invalida, intente nuevamente");
			}
			
		} while(opcion != 9);
	}

	
	public static void mostrarMenu() {
		System.out.println("*****************************************************");
		System.out.println("*            Bienvenido a la empresa CUAK           *");
		System.out.println("*****************************************************");
		System.out.println("Seleccione el numero de la opcion que desea utilizar:");
		System.out.println("(1)Agregar Cliente");
		System.out.println("(2)Agregar Profesional");
		System.out.println("(3)Agregar Administrativo");
		System.out.println("(4)Agregar Capacitacion");
		System.out.println("(5)Eliminar usuario");
		System.out.println("(6)Listar todos los usuarios");
		System.out.println("(7)Listar usuario por tipo");
		System.out.println("(8)Listar capacitaciones");
		System.out.println("(9)Salir");
		System.out.println("*****************************************************");
	}
	
	public static void agregarCliente(Scanner Pan) {
		String nombre, apellido, telefono, afp, direccion, comuna;
		int run, edad;
		System.out.println("--------------Datos Generales----------");
		//para atrapar name con las condiciones que pide
		do {
			System.out.println("Ingrese el nombre");
			nombre = Pan.nextLine();
			if (nombre.length() < 10 || nombre.length() > 50) {
                System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
            }
		} while (nombre.isEmpty() || nombre.length() < 10 || nombre.length() > 50);
		
		//atrapar el run con la condiciones que pide
		do {
		    System.out.println("Ingrese el RUN del cliente: ");
		    while (!Pan.hasNextInt()) {
		        System.out.println("Ingrese un valor numérico válido.");
		        Pan.next();  // Descarta la entrada no válida
		    }
		    run = Pan.nextInt();
		    Pan.nextLine();

		    if (run >= 99999999) {
		        System.out.println("El RUN debe ser menor a 99.999.999");
		    }
		} while ( run >= 99999999);
		
		
		System.out.println("--------------Datos del cliente--------");
		//atrapar el apellido con la condiciones que pide
		do {
			System.out.println("Ingrese el apellido");
			apellido = Pan.nextLine();
			if (apellido.length() < 10 || apellido.length() > 50) {
                System.out.println("El apellido debe tener entre 10 y 50 caracteres.");
            }
		}while(apellido.isEmpty() || apellido.length() < 10 || apellido.length() > 50);
		
		//atrapar el telefono con la condiciones que pide
		do {
			System.out.println("Ingrese el telefono del cliente:");
	        telefono = Pan.nextLine();
	        if(telefono.isEmpty()) {
	        	System.out.println("El campo es obligatorio, digite un telefono valido");
	        }
		}while(telefono.isEmpty());
        
		//atrapar el afp con la condiciones que pide
		do {
	        System.out.println("Ingrese Afp del cliente:");
	        afp = Pan.nextLine();
	        if(afp.length() < 4 || afp.length() > 30) {
	        	System.out.println("afp debe tener entre 4 y 30 caracteres");
	        }
		}while(afp.length() < 4 || afp.length() > 30);
		
		
		
        System.out.println("Ingrese el numero del Sistema de salud: 1 (Fonasa) o 2 (Isapre)");
        int sistemaSalud = Integer.parseInt(Pan.nextLine());
        
      //atrapar el direccion con la condiciones que pide
        do {
        	System.out.println("Ingrese direccion del cliente:");
            direccion = Pan.nextLine();
            if(direccion.length() > 70) {
            	System.out.println("maximo de 70 caracteres sobre pasados");
            }
        }while(direccion.length() > 70);
        
      //atrapar el comuna con la condiciones que pide
        do {
        	System.out.println("Ingrese la comuna del cliente:");
            comuna = Pan.nextLine();
            if(comuna.length() > 50) {
            	System.out.println("maximo de 50 caracteres sobre pasados");
            }
        }while(comuna.length() > 50);
        
        //atrapar edad con las condiciones que pide
        do {
		    System.out.println("Ingrese la edad del cliente: ");
		    while (!Pan.hasNextInt()) {
		        System.out.println("Ingrese un valor numérico válido.");
		        Pan.next();  // Descarta la entrada no válida
		    }
		    edad = Pan.nextInt();
		    Pan.nextLine();

		    if (edad < 0 || edad > 150) {
		        System.out.println("la edad debe estar entre 0 a 150");
		    }
		} while (edad < 0 || edad > 150);
        cliente cliente = new cliente(nombre, run , apellido, telefono, afp , sistemaSalud, direccion, comuna , edad);
        contenedores.almacenarCliente(cliente);
        System.out.println("Cliente ha sido agregado correctamente");
	}
	
	
	public static void agregarProfesional(Scanner Pan) {
		//esto es para darle el formato ingresado para que acepte el contendo al momento de convertirlo como LocalDate
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String nombre, titulo;
		        LocalDate fecha = null;
		        boolean formatoCorrecto = false;
				int run;
				
				System.out.println("--------------Datos Generales----------");
				//para atrapar name con las condiciones que pide
				do {
					System.out.println("Ingrese el nombre");
					nombre = Pan.nextLine();
					if (nombre.length() < 10 || nombre.length() > 50) {
		                System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
		            }
				} while (nombre.isEmpty() ||nombre.length() < 10 || nombre.length() > 50);
				
				//atrapar el run con la condiciones que pide
				do {
				    System.out.println("Ingrese el RUN del cliente: (Sin guiones , ni puntos) ");
				    while (!Pan.hasNextInt()) {
				        System.out.println("Ingrese un valor numérico válido.");
				        Pan.next();  // Descarta la entrada no válida
				    }
				    run = Pan.nextInt();
				    Pan.nextLine();

				    if (run >= 99999999) {
				        System.out.println("El RUN debe ser menor a 99.999.999.9 sin guiones, ni puntos");
				    }
				} while (run >= 99999999);
				
		        System.out.println("--------------Datos del Profesional--------");
		        
		        //atrapar titulo con ls condiciones que pide
		        do {
		        	System.out.println("Ingrese el titulo del profesional:");
		            titulo = Pan.nextLine();
		            if(titulo.length() < 10 ||titulo.length() > 50) {
		            	System.out.println("el titulo debe tener entre 10 y 50 caracteres");
		            }
		        }while(titulo.isEmpty() || titulo.length() < 10 || titulo.length() > 50);
		        
		        
		      //atrapar fecha con ls condiciones que pide
		        while (!formatoCorrecto) {
		            System.out.print("Ingrese la fecha de ingreso del profesional (dd-MM-yyyy): ");
		            String fechaString = Pan.nextLine();
		            
		            try {
		                fecha = LocalDate.parse(fechaString, formato);
		                System.out.println(fecha);
		                formatoCorrecto = true;
		            } catch (Exception e) {
		                System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
		            }
		        }
        profesional profesional = new profesional(nombre, run ,titulo, fecha);
        contenedores.almacenarProfesional(profesional);
        System.out.println("Profesional ha sido agregado correctamente.");
		
	}
	
	
	
	public static void agregarAdministrativo(Scanner Pan) {
		String nombre, area, experiencia;
		int run;
		
		
		System.out.println("--------------Datos Generales----------");
		//para atrapar name con las condiciones que pide
		do {
			System.out.println("Ingrese el nombre");
			nombre = Pan.nextLine();
			if (nombre.length() < 10 || nombre.length() > 50) {
                System.out.println("El nombre debe tener entre 10 y 50 caracteres.");
            }
		} while (nombre.isEmpty() || nombre.length() < 10 || nombre.length() > 50);
		
		//atrapar el run con la condiciones que pide
		do {
		    System.out.println("Ingrese el RUN del cliente: ");
		    while (!Pan.hasNextInt()) {
		        System.out.println("Ingrese un valor numérico válido.");
		        Pan.next();  // Descarta la entrada no válida
		    }
		    run = Pan.nextInt();
		    Pan.nextLine();

		    if (run >= 99999999) {
		        System.out.println("El RUN debe ser menor a 99.999.999.");
		    }
		} while (run >= 99999999);
		
        System.out.println("--------------Datos Administrativo----------");
        
        //atrapar area con las condiciones que pide
        do {
        	 System.out.println("Ingrese el area:");
             area = Pan.nextLine();
            if(area.length() < 5 ||area.length() > 20) {
            	System.out.println("el area debe tener entre 5 y 20 caracteres");
            }
        }while(area.isEmpty() || area.length() < 5 || area.length() > 20);
        
      //atrapar experiencia previa con las condiciones que pide
        do {
        	System.out.println("Ingrese Experiencia Previa (en años)");
            experiencia = Pan.nextLine();
           if(experiencia.length() > 100) {
           	System.out.println("campo con maximo 100 caracteres");
           }
       }while(experiencia.length() > 100);
        administrativo administrativo = new administrativo(nombre, run ,area , experiencia);
        contenedores.almacenarAdministrativo(administrativo);
        System.out.println("Administrativo ha sido agregado correctamente.");
	}
	
	
	
	
	public static void agregarCapacitacion(Scanner Pan) {
		int identificador, rutCliente, cantidad;
		boolean capturaCorrecta;
		String dia, lugar, duracion, hora;
		
		//volver a identificador obligatorio como pide
		do {
			capturaCorrecta = false;
			
			System.out.println("ingrese el identificador de la capacitacion");
		    while (!Pan.hasNextInt()) {
		        System.out.println("Ingrese un valor numérico válido.");
		        Pan.next();  // Descarta la entrada no válida
		    }
		    identificador = Pan.nextInt();
		    Pan.nextLine();
		    
		    if (identificador < 0) {
		        System.out.println("El identificador debe ser un número mayor o igual a cero.");
		    } else {
		        capturaCorrecta = true;
		    }
		} while (!capturaCorrecta);
		
		//captura el rut del cliente con las condiciones que pide
		do {
			capturaCorrecta = false;
			
			System.out.println("ingrese el rut del cliente que desea crear la capacitacion");
		    while (!Pan.hasNextInt()) {
		        System.out.println("Ingrese un valor numérico válido.");
		        Pan.next();  // Descarta la entrada no válida
		    }
		    rutCliente = Pan.nextInt();
		    Pan.nextLine();
		    
		    if (rutCliente < 0) {
		        System.out.println("El rut del cliente debe ser un número mayor o igual a cero.");
		    } else {
		        capturaCorrecta = true;
		    }
		} while (!capturaCorrecta);
		
		
		//atrapar el dia con las condiciones que pide
        do {
            System.out.println("Ingrese el día de la capacitación (Lunes - Domingo): ");
            dia = Pan.nextLine();

            if (!esDiaValido(dia)) {
                System.out.println("Día no válido. Intente nuevamente.");
            }
        } while (!esDiaValido(dia));
        
        //atrapar la hora de la capacitacion que pide
        do {
            System.out.print("Ingresa la hora (formato HH:MM): ");
            hora = Pan.nextLine().trim();
        } while (!esHoraValida(hora));
        
        //atrapar lugar con las condiciones que pide
        do {
        	System.out.println("Ingrese el lugar de la capacitación: ");
            lugar = Pan.nextLine();
           if(lugar.length() < 10 || lugar.length() > 50) {
           	System.out.println("el lugar debe tener minimo 10 caracteres y maximo 50 caracteres");
           }
       }while(lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        
      //atrapar duracion previa con las condiciones que pide
        do {
        	System.out.println("Ingrese duracion de la capacitacion (en minutos): ");
            duracion = Pan.nextLine();
            if(duracion.length() > 70) {
            	System.out.println("maximo de 70 caracteres superado.");
            }
        }while(duracion.length() > 70);
        
      //atrapar la cantidad de asistentes con la condiciones que pide
      		do {
      			System.out.println("Cantidad de Asistentes: ");
      		    while (!Pan.hasNextInt()) {
      		        System.out.println("Ingrese un valor numérico válido.");
      		      Pan.next();  // Descarta la entrada no válida
      		    }
      		    cantidad = Pan.nextInt();
      		  Pan.nextLine();

      		    if (cantidad >= 1000) {
      		        System.out.println("La cantidad maxima de 1000 para los asistentes de la capacitacion superado");
      		    }
      		} while (cantidad >= 1000);
        capacitacion capacitacion = new capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidad);
        contenedores.almacenarCapacitacion(capacitacion);
        System.out.println("Capacitación ha sido agregada correctamente.");
	}
	
	
	public static void eliminarUsuario(Scanner Pan) {
		System.out.println("Si desea eliminar un usuario del registro digite el run de dicho usuario:");
		int runEliminar = Integer.parseInt(Pan.nextLine());
		contenedores.eliminar(runEliminar);
		System.out.println("¡El usuario ha sido eliminado exitosamente!");
	}
	
	
	
	
	//fn listar usuarios 'ordernar'
	public static void listarUsuarios() {
		List<asesoria> asesorias = contenedores.getAsesorias();
        for (asesoria asesoria : asesorias) {
            if (asesoria instanceof usuario) {
                usuario usuario = (usuario) asesoria;
                usuario.analizarUsuario();
                System.out.println();
            }
        }
	}
	
	
	public static void listarUsuariosPorTipo(Scanner Pan) {
		System.out.println("Digite el numero del tipo del Usuario que desea buscar");
		System.out.println("1- Cliente \n2- Profesional \n3-Administrativo");
		int tipo = Integer.parseInt(Pan.nextLine());
		String busqueda="";
		if(tipo==1) {
			busqueda = "cliente";
		}else if(tipo==2) {
			busqueda = "profesional";
		}else if(tipo==3) {
			busqueda = "administrativo";
		}else {};
		contenedores.listarUsuariosTipo(busqueda);
	}
	
	
	public static void listarCapacitaciones() {
		contenedores.listarCapacitaciones();
	}
	
	
	
	
	
	private static boolean esDiaValido(String dia) {
	    // Convertir a minúsculas para evitar problemas de mayúsculas/minúsculas
	    dia = dia.toLowerCase();

	    // Verificar si el día ingresado coincide con alguno de los días de la semana
	    return dia.equals("lunes") ||
	           dia.equals("martes") ||
	           dia.equals("miércoles") ||
	           dia.equals("miercoles") ||
	           dia.equals("jueves") ||
	           dia.equals("viernes") ||
	           dia.equals("sábado") ||
	           dia.equals("sabado") ||
	           dia.equals("domingo");
	}
	
	public static boolean esHoraValida(String hora) {
        if (hora.length() != 5) {
            return false;
        }

        String[] partes = hora.split(":");
        if (partes.length != 2) {
            return false;
        }

        try {
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
  }
	
	
	
	
}



