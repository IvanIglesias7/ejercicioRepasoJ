package ejercicioRepasoJ.empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

}
