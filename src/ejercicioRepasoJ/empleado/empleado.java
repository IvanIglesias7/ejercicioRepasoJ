package ejercicioRepasoJ.empleado;

public class empleado {

	String nombre;
	String apellidos;
	String dni;
	String fechaNac;
	String titulacionA;
	int nSeguridad;
	int nCuenta;

	public empleado(String nombre, String apellidos, String dni, String fechaNac, String titulacionA, int nSeguridad,
			int nCuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.titulacionA = titulacionA;
		this.nSeguridad = nSeguridad;
		this.nCuenta = nCuenta;
	}

	public empleado() {
		super();
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

	public String getTitulacionA() {
		return titulacionA;
	}

	public void setTitulacionA(String titulacionA) {
		this.titulacionA = titulacionA;
	}

	public int getnSeguridad() {
		return nSeguridad;
	}

	public void setnSeguridad(int nSeguridad) {
		this.nSeguridad = nSeguridad;
	}

	public int getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", fechaNac=" + fechaNac
				+ ", titulacionA=" + titulacionA + ", nSeguridad=" + nSeguridad + ", nCuenta=" + nCuenta + "]";
	}

}
