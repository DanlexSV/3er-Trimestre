
public class No_Autonomo extends Clientes {
	
	double totalIVA;

	public No_Autonomo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public No_Autonomo(String dNI, String fecha, int nFactura) {
		super(dNI, fecha, nFactura);
		// TODO Auto-generated constructor stub
	}
	
	public void CalcularIVA(double consumo) {
		double total;
		total = (consumo * 0.45 * 30);
		totalIVA = total + (total * 21)/100;
	}
}
