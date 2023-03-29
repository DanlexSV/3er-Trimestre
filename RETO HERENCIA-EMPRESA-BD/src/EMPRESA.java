import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class EMPRESA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorBD gb = new GestorBD();
        Vista v = new Vista();
		JOptionPane.showMessageDialog(null,
				"A ~ Insertar un nuevo Directivo \n" + "B ~ Insertar un nuevo Tecnico \n"
						+ "C ~ Insertar un nuevo Oficial \n" + "D ~ Consultar la tabla Directivo \n"
						+ "E ~ Consultar la tabla Tecnico \n" + "F ~ Consultar la tabla Oficial \n" + "S ~ Salir");
		String opt = JOptionPane.showInputDialog("Escoge una de las opciones").toUpperCase();

		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				if (gb.insertarDirectivo(v.pedirDatosDirectivos()))
					JOptionPane.showMessageDialog(null, "Empleado registrado");
				else
					JOptionPane.showMessageDialog(null, "Empleado no registrado");
				break;
			case "B":
				if (gb.insertarTecnico(v.pedirDatosTecnico()))
					JOptionPane.showMessageDialog(null, "Empleado registrado");
				else 
					JOptionPane.showMessageDialog(null, "Empleado no registrado");
				break;
			case "C":
				if (gb.insertarOficial(v.pedirDatosOficial()))
					JOptionPane.showMessageDialog(null, "Empleado registrado");
				else
					JOptionPane.showMessageDialog(null, "Empleado no registrado");
				break;
			case "D":
				ResultSet rs = gb.getConsultaDirectivo();
				v.mostrarDatos(rs, 5);
				break;
			case "E":
				ResultSet res = gb.getConsultaTecnico();
				v.mostrarDatos(res, 6);
				break;
			case "F":
				ResultSet result = gb.getConsultaOficial();
				v.mostrarDatos(result, 7);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			JOptionPane.showMessageDialog(null,
					"A ~ Insertar un nuevo Directivo \n" + "B ~ Insertar un nuevo Tecnico \n"
							+ "C ~ Insertar un nuevo Oficial \n" + "D ~ Consultar la tabla Directivo \n"
							+ "E ~ Consultar la tabla Tecnico \n" + "F ~ Consultar la tabla Oficial \n" + "S ~ Salir");
			opt = JOptionPane.showInputDialog("Escribe una de las opciones").toUpperCase();
		}
	}
}
