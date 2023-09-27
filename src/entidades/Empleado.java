package entidades;

import java.util.Date;

public class Empleado {
	private int numEmpleado;
	private String nombre;
	private String apellidos;
	private String dni;
	private String fechaNac;
	private String titulacion;
	private String numSegSoc;
	private String numCuenta;

	public Empleado(int numEmpleado, String nombre, String apellidos, String dni, String fechaNac, String titulacion,
			String numSegSoc, String numCuenta) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.titulacion = titulacion;
		this.numSegSoc = numSegSoc;
		this.numCuenta = numCuenta;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getNumSegSoc() {
		return numSegSoc;
	}

	public void setNumSegSoc(String numSegSoc) {
		this.numSegSoc = numSegSoc;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni="
				+ dni + ", fechaNac=" + fechaNac + ", titulacion=" + titulacion + "]";
	}
}
