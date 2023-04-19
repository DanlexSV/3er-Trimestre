
public class Clientes {
	
	protected String DNI, Fecha;
	protected int NFactura;
	protected double consumo;

	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clientes(String dNI, String fecha, int nFactura) {
		super();
		DNI = dNI;
		Fecha = fecha;
		NFactura = nFactura;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public int getNFactura() {
		return NFactura;
	}

	public void setNFactura(int nFactura) {
		NFactura = nFactura;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public void generarFactura() {
		double factura = consumo * 0.45 * 30;
		factura = factura + (factura * 0.21);
		System.out.println("El total de la factura es: " + factura);
	}
}
