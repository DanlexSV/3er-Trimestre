import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Escribe una de las siguientes opciones:");
		String menu = JOptionPane
				.showInputDialog("A ~ Calcular precio del coche \n" + "B ~ Calcular precio de la moto \n" + "S ~ Salir")
				.toUpperCase();

		while (!menu.equals("S")) {
			switch (menu) {
			case "A":
				Coches coche = new Coches("123HKL", 10000);
				System.out.println(coche.toString());
				break;
			case "B":
				Motos moto = new Motos("987DFL", 8000);
				System.out.println(moto.toString());
				break;
			default: JOptionPane.showMessageDialog(null, "Opcion no valida, intentalo de nuevo");
				break;
			}
			menu = JOptionPane
					.showInputDialog(
							"A ~ Calcular precio del coche \n" + "B ~ Calcular precio de la moto \n" + "S ~ Salir")
					.toUpperCase();
		}
	}

}
