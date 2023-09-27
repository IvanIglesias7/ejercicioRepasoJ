package ejercicioRepasoJ.empleado;

/**
 * Interfaz de la entidad empleado que se implementará en la clase empleadoImp
 */
public interface empleadoServicio {

	//Añade un empleado a la lista
	public void addEmpleado(empleado e);

	//Muestra la lista con todos los empleados
	public void mostrarLista();

	//Recoge los datos de un empleado
	public empleado recogeEmpleado();
	
	//Modifica un empleado a través de su id
	public void modificaEmpleado(int id);
	
	//Recoge y valida el id de un empleado
	public int preguntaID();
	
	//Exporta toda la lista a un fichero
	public void exportaFicheroLista();
	
	//Pregunta id y exporta un empleado a un fichero (distinto al de la lista)
	public void exportaFicheroEmpleado();
}
