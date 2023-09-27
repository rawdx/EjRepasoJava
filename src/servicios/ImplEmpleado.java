package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entidades.Empleado;

public class ImplEmpleado implements InterfazEmpleado {

	public int contador = 0;

	public void registrarEmpleado(ArrayList<Empleado> empleados) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\tIntroduce el nombre: ");
		String nombre = sc.nextLine();

		System.out.print("\tIntroduce los apellidos: ");
		String apellidos = sc.nextLine();

		System.out.print("\tIntroduce el DNI: ");
		String dni = sc.nextLine();

		System.out.print("\tIntroduce la fecha de nacimiento: ");
		String fechaNac = sc.nextLine();

		System.out.print("\tIntroduce la titulación: ");
		String titulacion = sc.nextLine();

		System.out.print("\tIntroduce el número de la seguridad social: ");
		String numSegSoc = sc.nextLine();

		System.out.print("\tIntroduce el número de cuenta: ");
		String numCuenta = sc.nextLine();

		int numEmpleado = ++contador;

		empleados.add(new Empleado(numEmpleado, nombre, apellidos, dni, fechaNac, titulacion, numSegSoc, numCuenta));

		System.out.println("\n\tEl empleado se ha registrado correctamente.");
	}

	public void modificarEmpleado(ArrayList<Empleado> empleados) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\tIntroduce el número del empleado que deseas modificar:");
		int numEmpleado = Integer.parseInt(sc.nextLine());

		boolean existe = false;
		for (Empleado empleado : empleados) {
			if (empleado.getNumEmpleado() == numEmpleado) {
				existe = true;

				System.out.print("\tIntroduce el nombre: ");
				empleado.setNombre(sc.nextLine());

				System.out.print("\tIntroduce los apellidos: ");
				empleado.setApellidos(sc.nextLine());

				System.out.print("\tIntroduce el DNI: ");
				empleado.setDni(sc.nextLine());

				System.out.print("\tIntroduce la fecha de nacimiento: ");
				empleado.setFechaNac(sc.nextLine());

				System.out.print("\tIntroduce la titulación: ");
				empleado.setTitulacion(sc.nextLine());

				System.out.print("\tIntroduce el número de la seguridad social: ");
				empleado.setNumSegSoc(sc.nextLine());

				System.out.print("\tIntroduce el número de cuenta: ");
				empleado.setNumCuenta(sc.nextLine());
			}
		}
		if (existe)
			System.out.println("\tEl empleado se modificó correctamente.");
		else
			System.out.println("\tEl empleado no existe.");

	}

	public void exportar(ArrayList<Empleado> empleados) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt", true));
			Scanner sc = new Scanner(System.in);

			System.out.println("\n\tSelecciona una opción:");
			System.out.println("\t1. Exportar un empleado");
			System.out.println("\t2. Exportar todo");

			int opcion = sc.nextInt();

			while (opcion != 1 && opcion != 2) {
				System.out.print("\n\t[Error] Introduce un número válido.");
				opcion = sc.nextInt();
			}

			boolean existe = false;
			switch (opcion) {
			case 1:
				System.out.println("\n\tIntroduce el número del empleado que quieres exportar:");
				String numEmpleadoStr = sc.nextLine();
				if (!numEmpleadoStr.isEmpty()) {
					int numEmpleado = Integer.parseInt(numEmpleadoStr);

					for (Empleado empleado : empleados) {
						if (empleado.getNumEmpleado() == numEmpleado) {
							existe = true;
							bw.write(empleado.toString());
							bw.newLine();
							break;
						}
					}
				} else
					System.out.println("\n\t[Error] Debes introducir un número válido.");
			case 2:
				if (!empleados.isEmpty()) {
					existe = true;
					for (Empleado empleado : empleados) {
						bw.write(empleado.toString());
						bw.newLine();
					}
				}
				break;
			}

			bw.close();
			if (existe)
				System.out.println("\n\tLos datos se exportaron correctamente.");
			else
				System.out.println("\n\tNo existen datos para exportar.");

		} catch (IOException e) {
			System.out.println("\n\tError al exportar los datos: " + e.getMessage());
		}

	}
}
