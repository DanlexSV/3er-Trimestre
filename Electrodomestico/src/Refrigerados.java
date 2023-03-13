
public class Refrigerados extends Electrodomestico {

	private String Modelo;
	private int tamaño;

	public Refrigerados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public double calcularImporte() {
		double PrecioIVA;
		PrecioIVA = (Precio * 21) / 100;
		return PrecioIVA;
	}

	public double calcularImporte(double descuento) {
		double PrecioIVA;
		PrecioIVA = ((Precio * 21) / 100) - descuento;
		return PrecioIVA;
	}
}
