
public class Facturacion {
	
	protected String IdFactura;
	protected double neto;
	
	public Facturacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facturacion(String idFactura, double neto) {
		super();
		IdFactura = idFactura;
		this.neto = neto;
	}
	
	public void mostrarFacturacion() {
		System.out.println("El valor de la factura: " + IdFactura + " es: " + neto);
	}
}
