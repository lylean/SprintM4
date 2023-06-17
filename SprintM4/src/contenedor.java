import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class contenedor {
	private List<capacitacion> capacitaciones;
	private List<asesoria> asesorias;
	
	
public contenedor() {
	this.capacitaciones = new ArrayList<>();
	this.asesorias = new ArrayList<>();
	
	}


public List<capacitacion> getCapacitaciones() {
	return capacitaciones;
}


public void setCapacitaciones(List<capacitacion> capacitaciones) {
	this.capacitaciones = capacitaciones;
}


public List<asesoria> getAsesorias() {
	return asesorias;
}


public void setAsesorias(List<asesoria> asesorias) {
	this.asesorias = asesorias;
}

//******************-***************

public void almacenarCliente(cliente clientes) {
	asesorias.add(clientes);
	
}

public void almacenarProfesional(profesional profesionales) {
	asesorias.add(profesionales);
}

public void almacenarAdministrativo(administrativo administrativos) {
	asesorias.add(administrativos);
}

public void almacenarCapacitacion(capacitacion capacitaciones2) {
	capacitaciones.add(capacitaciones2);
}

//hasNext evalua la posicion actual y verifica si hay una siguiente posicion despues de la que se encuentra, para establecer el limite de ciclo
public void eliminar(int run) {
	Iterator<asesoria> iterator = asesorias.iterator();
    while (iterator.hasNext()) {
        asesoria asesoria = iterator.next();
        if (asesoria instanceof usuario) {
            usuario usuario = (usuario) asesoria;
            if (usuario.getRun() == run) {
                iterator.remove();
                break;
            }
        }
    }
}


public void listarUsuarios() {
	for(asesoria usuario : asesorias) {
		if(usuario instanceof usuario ) {
			usuario usuarioAcc = (usuario) usuario;
			usuarioAcc.analizarUsuario();
		}
	}
}


public void listarUsuariosTipo(String tipo) {
	for(asesoria usuario : asesorias) {
		if(usuario instanceof usuario ) {
			usuario usuarioAcc = (usuario) usuario;
			if(tipo.equalsIgnoreCase("cliente") && usuarioAcc instanceof cliente) {
				usuarioAcc.analizarUsuario();
			}else if(tipo.equalsIgnoreCase("profesional") && usuarioAcc instanceof profesional) {
				usuarioAcc.analizarUsuario();
			}else if(tipo.equalsIgnoreCase("administrativo") && usuarioAcc instanceof administrativo) {
				usuarioAcc.analizarUsuario();
			}
		}
	}
}


public void listarCapacitaciones() {
	// Lógica para mostrar la lista de capacitaciones y los datos de los clientes asociados a cada una
	for (capacitacion capacitacion : capacitaciones) {
        System.out.println("Datos de la capacitación:");
        System.out.println("Identificador: " + capacitacion.getIdentificador());
        System.out.println("Dia: " + capacitacion.getDia());
        System.out.println("Duración: " + capacitacion.getDuracion());

        int clienteRun = capacitacion.getRut();
        usuario clienteAsociado = buscarClientePorRun(clienteRun);
        if (clienteAsociado != null) {
            System.out.println("Cliente asociado:");
            clienteAsociado.analizarUsuario();
        } else {
            System.out.println("No se encontró el cliente asociado con el RUN: " + clienteRun);
        }

        System.out.println("--------------------------");
    }
}

private usuario buscarClientePorRun(int run) {
    for (asesoria asesoria : asesorias) {
        if (asesoria instanceof usuario) {
            usuario usuario = (usuario) asesoria;
            if (usuario.getRun() == run && usuario instanceof cliente) {
                return usuario;
            }
        }
    }
    return null;
}



}
