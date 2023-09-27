package controladores;

import java.util.ArrayList;

import entidades.Empleado;
import servicios.ImplEmpleado;
import servicios.ImplMenu;
import servicios.InterfazEmpleado;
import servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		try {
			InterfazMenu menu = new ImplMenu();
			InterfazEmpleado empleado = new ImplEmpleado();
			
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			
			int opcion;
			do
			{
			    opcion = menu.mostrarMenu();

			    switch (opcion)
			    {
			        case 1:
			            empleado.registrarEmpleado(empleados);
			            break;
			        case 2:
			            empleado.modificarEmpleado(empleados);
			            break;
			        case 3:
			            empleado.exportar(empleados);
			            break;
			    }
			} while (opcion != 4);
			
			
		} catch (Exception err) {
			System.out.println("Error:" + err);
		}

	}

}
