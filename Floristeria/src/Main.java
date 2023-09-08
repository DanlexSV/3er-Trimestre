import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Util u = new Util();
		GestionBD GBD = new GestionBD();

		String opt = JOptionPane.showInputDialog("A.Alta Interior B.Alta Exterior C.Alta Ramos D.Consulta S.Salir")
				.toUpperCase();

		while (!opt.equals("S")) {

			switch (opt) {

			case "A":
				if (GBD.Insertar(u.AltaInterior())) {
					JOptionPane.showMessageDialog(null, "Alta exitosa");
				} else {
					JOptionPane.showMessageDialog(null, "Alta Fallida");
				}
				;
				break;
			case "B":
				if (GBD.Insertar(u.AltaExterior())) {
					JOptionPane.showMessageDialog(null, "Alta exitosa");
				} else {
					JOptionPane.showMessageDialog(null, "Alta Fallida");
				}
				;
				break;
			case "C":
				if (GBD.Insertar(u.AltaRamos())) {
					JOptionPane.showMessageDialog(null, "Alta exitosa");
				} else {
					JOptionPane.showMessageDialog(null, "Alta Fallida");
				}
				;
				break;
			case "D":
				u.Listar(GBD.Consulta());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida");
				break;
			}

			opt = JOptionPane.showInputDialog("A.Alta Interior B.Alta Exterior C.Alta Ramos D.Consulta S.Salir")
					.toUpperCase();

		}

		JOptionPane.showMessageDialog(null, "Bye bye!~~");

	}

}
