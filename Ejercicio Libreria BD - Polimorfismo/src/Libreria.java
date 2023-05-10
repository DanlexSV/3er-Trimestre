import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opt = JOptionPane
				.showInputDialog("Escriba una de las siguientes opciones:\n" + "A = Alta Libros \n"
						+ "B = Listar Libros \n" + "C = Alta Revistas \n" + "D = Listar Revistas \n" + "S = Salir")
				.toUpperCase();
		GestorBD bd = new GestorBD();
		Vista vi = new Vista();

		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				if (bd.insertarDatos(vi.AltaLibro()))
					JOptionPane.showMessageDialog(null, "Libro registrado con exito.");
				else
					JOptionPane.showMessageDialog(null, "No se ha podido registrar el libro.");
				break;
			case "B":
				ResultSet rs = bd.ConsultaLibro();
				vi.ListarL(vi.LeerLib(rs));
				break;
			case "C":
				if (bd.insertarDatos(vi.AltaRevista()))
					JOptionPane.showMessageDialog(null, "Revista registrada con exito.");
				else
					JOptionPane.showMessageDialog(null, "No se ha podido registrar la revista.");
				break;
			case "D":
				ResultSet rs1 = bd.ConsultaRevista();
				vi.ListarR(vi.LeerRe(rs1));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida \n" + "Escriba una opcion valida.");
				break;
			}
			opt = JOptionPane
					.showInputDialog("Escriba una de las siguientes opciones:\n" + "A = Alta Libros \n"
							+ "B = Listar Libros \n" + "C = Alta Revistas \n" + "D = Listar Revistas \n" + "S = Salir")
					.toUpperCase();
		}
	}

}
