
public class Coches extends Vehiculo {

	public Coches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coches(String matricula, double precio) {
		super(matricula, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		return (this.getPrecio() * 0.21) + this.getPrecio();
	}

	@Override
	public String toString() {
		return "El vehiculo con matrícula: " + this.getMatricula() + " es :" + calcularPrecio();
	}
}
