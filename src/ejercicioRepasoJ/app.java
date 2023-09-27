package ejercicioRepasoJ;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicioRepasoJ.empleado.empleado;
import ejercicioRepasoJ.empleado.empleadoImp;
import ejercicioRepasoJ.empleado.menu.menu;

/**
 * aplicación que muestra un menú y ejecuta ciertas acciones según input del usuario
 */
public class app {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		menu m = new menu();
		empleadoImp eimp = new empleadoImp();
		int id= 0;

		boolean salir = false;

		while (!salir) {

			int opcion = m.menu();
			id++;
			switch (opcion) {
			case 1:
				
				empleado e = eimp.recogeEmpleado();
				e.setnEmpleado(id);
				eimp.addEmpleado(e);
				break;

			case 2:
				
				eimp.modificaEmpleado(eimp.preguntaID());
				break;

			case 3:
				
				eimp.exportaFicheroLista();
				 break;

			case 4:
				eimp.exportaFicheroEmpleado();
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
