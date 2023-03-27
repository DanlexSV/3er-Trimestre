import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class CONCENSONARIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gestionBD gb = new gestionBD();
		// System.out.println(gb.insertar());
		Vista vt = new Vista();
		JOptionPane.showMessageDialog(null, "Las opciones son: \n" + "A para dar de Alta \n" + "B para Consultar \n" + "S para Salir");
		String opcion = JOptionPane.showInputDialog("Escriba una opcion");
		while (!opcion.equals("S")) {
			switch (opcion) {
			case "A":
				if (gb.insertarCoche(vt.PedirDatos()))
					JOptionPane.showMessageDialog(null, "Coche registrado con exito");
				else
					JOptionPane.showMessageDialog(null, "Coche no registrado con exito");
				break;
			case "B":
				ResultSet result = gb.getConsulta();
				vt.MostrarDatos(result);
				break;
			case "C":
				gb.getConsultallyId(JOptionPane.showInputDialog(""));
			default:
			}
			opcion = JOptionPane.showInputDialog("Escriba una opcion");
		}

		

	}
}
