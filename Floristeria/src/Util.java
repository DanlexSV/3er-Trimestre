import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {

	public Interior AltaInterior() {

		Interior in = new Interior();

		in.setEspecie(JOptionPane.showInputDialog("Introduzca el nombre de la especie"));
		in.setOrigen(JOptionPane.showInputDialog("Introduzca el origen de la planta"));
		in.setTipo("Interior");
		in.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio de la planta")));
		in.setFrecuenciadeRiego(JOptionPane.showInputDialog("Introduzca la frecuencia de riego"));

		return in;

	}

	public Exterior AltaExterior() {

		Exterior ex = new Exterior();

		ex.setEspecie(JOptionPane.showInputDialog("Introduzca el nombre de la especie"));
		ex.setOrigen(JOptionPane.showInputDialog("Introduzca el origen de la planta"));
		ex.setTipo("Exterior");
		ex.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio de la planta")));
		ex.setUbicacion(JOptionPane.showInputDialog("Introduzca la ubicacion de la planta"));

		return ex;
	}

	public Ramos AltaRamos() {

		Ramos ra = new Ramos();

		ra.setEspecie(JOptionPane.showInputDialog("Introduzca el nombre de la especie"));
		ra.setOrigen(JOptionPane.showInputDialog("Introduzca el origen de la planta"));
		ra.setTipo("Ramos");
		ra.setNumerodeFlores(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de flores")));
		ra.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio de la planta")));

		return ra;
	}

	public void Listar(ArrayList<Planta> Plantas) {

		for (Planta p : Plantas) {
			if (p instanceof Interior) {
				Interior in = (Interior) p;
				JOptionPane.showMessageDialog(null, in.getEspecie() + ", " + in.getOrigen() + ", " + in.getTipo() + ", "
						+ ", " + in.getFrecuenciadeRiego() + ", " + in.CalcularPrecio());
			} else if (p instanceof Exterior) {
				Exterior ex = (Exterior) p;
				JOptionPane.showMessageDialog(null, ex.getEspecie() + ", " + ex.getOrigen() + ", " + ex.getTipo() + ", "
						+ ex.getUbicacion() + ", " + ex.CalcularPrecio());
			} else {
				Ramos ra = (Ramos) p;
				JOptionPane.showMessageDialog(null, ra.getEspecie() + ", " + ra.getOrigen() + ", " + ra.getTipo() + ", "
						+ ra.getNumerodeFlores() + ", " + ra.CalcularPrecio());
			}
		}
	}
}
