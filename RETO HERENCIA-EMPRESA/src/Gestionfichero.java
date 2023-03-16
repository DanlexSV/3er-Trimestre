import java.io.*;
import java.util.ArrayList;

public class Gestionfichero {

	public Gestionfichero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void escribirDirectivo(Directivo directivo, String nombrefichero) {
		try {
			FileWriter fw = new FileWriter(nombrefichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(directivo.getNombre() + " - " + directivo.getDNI() + " - " + directivo.getSalario() + " - "
					+ directivo.getPlus() + " - " + directivo.calcularnomina() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void escribirOperario(Tecnico tecnico, String nombrefichero) {
		try {
			FileWriter fw = new FileWriter(nombrefichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(tecnico.getNombre() + " - " + tecnico.getDNI() + " - " + tecnico.getSalario() + " - "
					+ tecnico.getNumobra() + " - " + tecnico.calcularnomina() + " - " + tecnico.quiensoy() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void escribirOperario(Oficial oficial, String nombrefichero) {
		try {
			FileWriter fw = new FileWriter(nombrefichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(oficial.getNombre() + " - " + oficial.getDNI() + " - " + oficial.getSalario() + " - "
					+ oficial.getNumobra() + " - " + oficial.getSobresueldo() + " - " + oficial.calcularnomina() + " - "
					+ oficial.quiensoy() + "\n");
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ArrayList<Directivo> leerFicheroDirectivo(String nombreFichero) {
		ArrayList<Directivo> miFicheroDirectivo = new ArrayList<Directivo>();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				Directivo dt = new Directivo();
				String[] campo = linea.split(" - ");
				dt.setNombre(campo[0]);
				dt.setDNI(campo[1]);
				dt.setSalario(Double.parseDouble(campo[2]));
				dt.setPlus(Double.parseDouble(campo[3]));
				dt.setSalarioFinal(Double.parseDouble(campo[4]));
				miFicheroDirectivo.add(dt);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return miFicheroDirectivo;
	}

	public ArrayList<Tecnico> leerFicheroTecnico(String nombreFichero) {
		ArrayList<Tecnico> miFichero = new ArrayList<Tecnico>();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				Tecnico tec = new Tecnico();
				String[] campos = linea.split(" - ");
				tec.setNombre(campos[0]);
				tec.setDNI(campos[1]);
				tec.setSalario(Double.parseDouble(campos[2]));
				tec.setNumobra(Integer.parseInt(campos[3]));
				tec.setSalarioFinal(Double.parseDouble(campos[4]));
				tec.setQuienSoy(campos[5]);
				miFichero.add(tec);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return miFichero;
	}

	public ArrayList<Oficial> leerFicheroOficial(String nombreFichero) {
		ArrayList<Oficial> miFichero = new ArrayList<Oficial>();
		String linea = "";
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				Oficial of = new Oficial();
				String[] campos = linea.split(" - ");
				of.setNombre(campos[0]);
				of.setDNI(campos[1]);
				of.setSalario(Double.parseDouble(campos[2]));
				of.setNumobra(Integer.parseInt(campos[3]));
				of.setSobresueldo(Double.parseDouble(campos[4]));
				of.setSalarioFinal(Double.parseDouble(campos[5]));
				of.setQuienSoy(campos[6]);
				miFichero.add(of);
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
