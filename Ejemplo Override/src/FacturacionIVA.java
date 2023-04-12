
public class FacturacionIVA extends Facturacion {
	
	double total;

	public FacturacionIVA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturacionIVA(String idFactura, double neto) {
		super(idFactura, neto);
		// TODO Auto-generated constructor stub
	}
	
	public void calcularIVA() {
		total = neto + (neto * 21)/100;
	}
	
	@Override
	public void mostrarFacturacion() {
		calcularIVA();
		System.out.println("Factura " + IdFactura + " es: " + total);
	}
	
	@Override
	public String toString() {
		return "Valor con IVA: " + total;
	}
}
