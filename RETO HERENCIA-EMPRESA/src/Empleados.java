
public class Empleados {
	protected String nombre, DNI;
	protected double salario;

	public Empleados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleados(String nombre, String dNI, double salario) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
