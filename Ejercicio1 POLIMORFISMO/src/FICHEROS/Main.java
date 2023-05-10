package FICHEROS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opt = JOptionPane.showInputDialog("Escribe una de las opciones").toUpperCase();
		gestionFicheros gf = new gestionFicheros();
		Util util = new Util();

		while (!opt.equals("S")) {
			switch (opt) {
			case "A":
				ClienteVip vip = new ClienteVip();
				vip.setNum_Reserva(Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de reserva")));
				vip.setComensal(JOptionPane.showInputDialog("Escribe el nombre del Comensal"));
				vip.setNumSocio(Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de socio")));
				gf.escribirFichero(vip);
				break;
			case "B":
				Reservas res = new Reservas();
				res.setNum_Reserva(Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de reserva")));
				res.setComensal(JOptionPane.showInputDialog("Escribe el nombre del Comensal"));
				gf.escribirFichero(res);
				break;
			case "C":
				ArrayList<Reservas> FicheroVIP = new ArrayList<Reservas>();
				FicheroVIP = gf.leerFichero();
				util.printarReservas(FicheroVIP);
				break;
			case "D":
				ArrayList<Reservas> FicheroNM = new ArrayList<Reservas>();
				FicheroNM = gf.leerFichero();
				util.printarReservas(FicheroNM);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			opt = JOptionPane.showInputDialog("Escribe una de las opciones").toUpperCase();
		}
	}
}
