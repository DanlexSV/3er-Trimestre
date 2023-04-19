
public class Motos extends Vehiculo {

	public Motos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motos(String matricula, double precio) {
		super(matricula, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPrecio() {
		return (this.getPrecio() * 0.15) + this.getPrecio();
	}

	@Override
	public String toString() {
		return "El vehiculo con matricula: " + this.getMatricula() + " es: " + calcularPrecio();
	}
}
