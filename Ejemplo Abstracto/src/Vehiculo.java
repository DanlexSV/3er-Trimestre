
public abstract class Vehiculo {
	protected String matricula;
	protected double precio;

	public Vehiculo(String matricula, double precio) {
		super();
		this.matricula = matricula;
		this.precio = precio;
	}

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}

	public double getPrecio() {
		return precio;
	}

	abstract double calcularPrecio();
}
