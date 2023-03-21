import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EMPRESA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,
				"A ~ Alta Directivo \n" + "B ~ Alta Técnico \n" + "C ~ Alta Oficial \n" + "S ~ Salir");
		String opt = JOptionPane.showInputDialog("Escribe una letra").toUpperCase();
		String nombreFichero;

		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				Utilidades util = new Utilidades();
				Gestionfichero gf = new Gestionfichero();
				ArrayList<Directivo> FicheroDirectivo = new ArrayList<Directivo>();
				nombreFichero = JOptionPane.showInputDialog("Escribe el Nombre de el fichero del Directivo");
				util.AltaDirectivo(nombreFichero);
				FicheroDirectivo = gf.leerFicheroDirectivo(nombreFichero);
				util.printarDirectivo(FicheroDirectivo);
				break;
			case "B":
				Utilidades ut = new Utilidades();
				Gestionfichero gF = new Gestionfichero();
				ArrayList<Tecnico> FicheroTecnico = new ArrayList<Tecnico>();
				nombreFichero = JOptionPane.showInputDialog("Escribe el Nombre de el fichero del Tecnico");
				ut.AltaTecnico(nombreFichero);
				FicheroTecnico = gF.leerFicheroTecnico(nombreFichero);
				ut.printarTecnico(FicheroTecnico);
			case "C":
				Utilidades Util = new Utilidades();
				Gestionfichero GF = new Gestionfichero();
				ArrayList<Oficial> FicheroOficial = new ArrayList<Oficial>();
				nombreFichero = JOptionPane.showInputDialog("Escribe el Nombre de el fichero del Oficial");
				Util.AltaOficial(nombreFichero);
				FicheroOficial = GF.leerFicheroOficial(nombreFichero);
				Util.printarOficial(FicheroOficial);
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			opt = JOptionPane.showInputDialog("Escribe una letra").toUpperCase();
		}
	}
}
