package servicios;

import java.util.ArrayList;

import entidades.Empleado;

public interface InterfazEmpleado {
	public void registrarEmpleado(ArrayList<Empleado> empleados);
	public void modificarEmpleado(ArrayList<Empleado> empleados);
	public void exportar(ArrayList<Empleado> empleados);
}
