
public class Autonomo extends Clientes {
	
	double totalIVA;
	
	public Autonomo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void CalcularIVA(double consumo) {
		double total;
		total = (consumo * 0.30 * 30);
		totalIVA = total + (total * 11)/100;
	}

}
