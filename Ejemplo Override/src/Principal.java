
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Facturacion fact = new Facturacion("001", 20.5);
		FacturacionIVA factIVA = new FacturacionIVA("002", 20.5);
		
		fact.mostrarFacturacion();
		factIVA.mostrarFacturacion();
		factIVA.calcularIVA();
		
		System.out.println(factIVA.toString());
		System.out.println(fact.toString());
	}

}
