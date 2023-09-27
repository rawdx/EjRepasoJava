package servicios;

import java.util.Scanner;

public class ImplMenu implements InterfazMenu {
	public int mostrarMenu() {
		System.out.println("\n\tAdministrar Empleados");
		System.out.println("\t--------------------------");
		System.out.println("\t1. Registrar Empleado");
		System.out.println("\t2. Modificar Empleado");
		System.out.println("\t3. Exportar a Fichero");
		System.out.println("\t4. Salir");
		System.out.print("\n\tElige una opción: ");
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		while(opcion < 1 || opcion > 4) {
			System.out.println("[Error] Introduce un numero válido.");
			opcion = sc.nextInt();
		}
		return opcion;
	}
}
