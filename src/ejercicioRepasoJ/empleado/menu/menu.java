package ejercicioRepasoJ.empleado.menu;

import java.util.Scanner;

/**
 * Menú que muestra las distintas opciones a ejecutar
 */
public class menu {

	public int menu() {

		int opcion = -1;
		Scanner scan = new Scanner(System.in);
		boolean valido = false;

		do {
			System.out.println("1. Añadir empleado.");
			System.out.println("2. Modificar empleado.");
			System.out.println("3. Exportar lista de empleados a fichero.");
			System.out.println("4. Exportar empleado a fichero");
			System.out.println("5. Mostrar empleados.");
			System.out.println("0. Salir");

			System.out.println("Elige una opción");

			if (scan.hasNextInt()) {
				opcion = scan.nextInt();
				if (opcion >= 0 && opcion <= 4) {
					valido = true;
				} else {
					System.out.println("Opción no válida. Inténtalo de nuevo.");
					scan.nextLine(); // descarta la entrada incorrecta
				}
			} else {
				System.out.println("Eso no es un número. Inténtalo de nuevo.");
				scan.nextLine(); // descarta la entrada incorrecta
			}

		} while (!valido);

		return opcion;
	}
}
