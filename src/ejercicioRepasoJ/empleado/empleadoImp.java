package ejercicioRepasoJ.empleado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Implementacion de la inferfaz empleadoServicio
 */
public class empleadoImp implements empleadoServicio {

	List<empleado> listaEmpleados = new ArrayList<empleado>();

	public empleadoImp() {
	}

	public void addEmpleado(empleado e) {
		listaEmpleados.add(e);

	}

	public void mostrarLista() {

		for (empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}

	}

	public empleado recogeEmpleado() {
		Scanner scan = new Scanner(System.in);
		empleado e = new empleado();

		System.out.println("Nombre: ");
		while (!scan.hasNext("[A-Za-z]+")) {
			System.out.println("Eso no parece un nombre. Inténtalo de nuevo:");
			scan.next();
		}
		e.setNombre(scan.next());

		System.out.println("Apellidos: ");
		while (!scan.hasNext("[A-Za-z]+")) {
			System.out.println("Eso no parece un apellido. Inténtalo de nuevo:");
			scan.next();
		}
		e.setApellidos(scan.next());

		System.out.println("DNI: ");
		while (!scan.hasNext()) {
			System.out.println("Eso no parece un DNI. Inténtalo de nuevo:");
			scan.next();
		}
		e.setDni(scan.next());

		System.out.println("FechaNac: ");
		while (!scan.hasNext()) {
			System.out.println("Eso no parece una fecha de nacimiento. Inténtalo de nuevo:");
			scan.next();
		}
		e.setFechaNac(scan.next());

		System.out.println("Titulación más alta: ");
		while (!scan.hasNext("[A-Za-z]+")) {
			System.out.println("Eso no parece una titulacion. Inténtalo de nuevo:");
			scan.next();
		}
		e.setTitulacionA(scan.next());

		System.out.println("Número de Seguridad Social: ");
		while (!scan.hasNextInt()) {
			System.out.println("Eso no es un número");
			scan.next();
		}
		e.setnSeguridad(scan.nextInt());

		System.out.println("Número de cuenta: ");
		while (!scan.hasNextInt()) {
			System.out.println("Eso no es un número");
			scan.next();
		}
		e.setnCuenta(scan.nextInt());

		return e;

	}

	@Override
	public void modificaEmpleado(int id) {

		for (empleado empleado : listaEmpleados) {

			if (empleado.nEmpleado == id) {

				System.out.println("Modifiquemos el empleado con DNI: " + empleado.dni);

				// Pregunto todos los datos y lo añado a la lista
				addEmpleado(recogeEmpleado());

				// Elimino los datos del empleado
				listaEmpleados.remove(empleado);
			} else
				break;
		}
	}

	@Override
	public int preguntaID() {
		int id;
		boolean existe = true;
		Scanner scan = new Scanner(System.in);

		System.out.println("Empleados: ");

		mostrarLista();

		System.out.println("Introduzca el id del empleado: ");

		while (!scan.hasNextInt() || !existe) {
			System.out.println("Eso no es un número");
			scan.next();

			for (empleado empleado : listaEmpleados) {
				if (scan.nextInt() != empleado.nEmpleado) {

					System.out.println("Ese empleado no existe");
					existe = false;
				}
			}
		}
		id = scan.nextInt();

		return id;
	}

	public void exportaFicheroLista() {

		try {
			String ruta = "ListaEmpleados.txt";
			String contenido = null;
			File file = new File(ruta);

			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (empleado empleado : listaEmpleados) {

				bw.write(empleado.toStringFichero());
				bw.write("\n");
			}

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void exportaFicheroEmpleado() {
		
		int id = preguntaID();
		
		try {
            String ruta = "ArchivoEmpleado.txt";
            String contenido = null;
            File file = new File(ruta);
            
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (empleado empleado : listaEmpleados) {
            	if(empleado.nEmpleado == id) {
            		bw.write(empleado.toStringFichero());
            		}
            	}
           
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        
		
	}

}
	
}
