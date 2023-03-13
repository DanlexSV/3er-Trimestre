
public class PequeñoElectrodomestico extends Electrodomestico {

	private String color;

	public PequeñoElectrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calcularImporte() {
		double PrecioFinal;
		PrecioFinal = (Precio * 21) / 100;
		return PrecioFinal;
	}

	public double calcularImporte(int cantidad) {
		double PrecioFinal;
		PrecioFinal = ((Precio * 21) / 100) * cantidad;
		return PrecioFinal;
	}
}
