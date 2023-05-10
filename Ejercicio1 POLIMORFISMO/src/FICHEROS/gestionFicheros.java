package FICHEROS;

import java.io.*;
import java.util.ArrayList;

public class gestionFicheros {
	String NombreFichero = "Reserva.txt";

	public gestionFicheros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void escribirFichero(Reservas reserva) {
		try {
			FileWriter fw = new FileWriter(NombreFichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			if (reserva instanceof ClienteVip) {
				ClienteVip vip = (ClienteVip) reserva;
				bw.write(vip.getNum_Reserva() + ", ");
				bw.write(vip.getComensal() + ", ");
				bw.write(vip.getNumSocio());
			} else {
				bw.write(reserva.getNum_Reserva() + ", ");
				bw.write(reserva.getComensal());
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<Reservas> leerFichero() {
		ArrayList<Reservas> miFichero = new ArrayList<Reservas>();
		String linea = "";
		try {
			FileReader fr = new FileReader(NombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				String[] campos = linea.split(", ");
				if (campos.length == 2) {
					Reservas res =  new Reservas();
					res.setNum_Reserva(Integer.parseInt(campos[0]));
					res.setComensal(campos[1]);
					miFichero.add(res);
				}
				else if (campos.length == 3) {
					ClienteVip vip = new ClienteVip();
					vip.setNum_Reserva(Integer.parseInt(campos[0]));
					vip.setComensal(campos[1]);
					vip.setNumSocio(Integer.parseInt(campos[2]));
					miFichero.add(vip);
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return miFichero;
	}
}
