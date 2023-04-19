
public class Autonomo extends Clientes {
	
	double totalIVA;
	
	public Autonomo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void generarFactura() {
		double factura = consumo * 0.30 * 30;
		factura = factura + (factura * 0.10);
		System.out.println("El total de la factura es: " + factura);
	}

}
