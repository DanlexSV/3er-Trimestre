package FICHEROS;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Util {
	
	public void printarReservas(ArrayList<Reservas> miFicheroReservas) {
		String texto = "";
		for (Reservas res : miFicheroReservas) {
			if (res instanceof ClienteVip) {
				ClienteVip vip = (ClienteVip) res;
				texto += vip.MostrarReserva() + "\n";
			}
			else
				texto += res.MostrarReserva() + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}
