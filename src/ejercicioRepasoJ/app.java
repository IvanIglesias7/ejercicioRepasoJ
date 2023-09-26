package ejercicioRepasoJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicioRepasoJ.empleado.empleado;
import ejercicioRepasoJ.empleado.empleadoImp;
import ejercicioRepasoJ.empleado.menu.menu;

public class app {

	public static void main(String[] args) {

		menu m = new menu();
		empleadoImp eimp = new empleadoImp();

		boolean salir = false;

		while (!salir) {

			int opcion = m.menu();

			switch (opcion) {
			case 1:
				empleado e = eimp.recogeEmpleado();
				eimp.addEmpleado(e);
				break;

			case 2:
				eimp.mostrarLista();
				break;

			case 3:
				System.out.println("opcion " + opcion);
				break;

			case 0:
				System.out.println("Hasta otra!");
				salir = true;
				break;
			default:
				System.out.println("Valor erróneo.");
			}
		}

	}
}
