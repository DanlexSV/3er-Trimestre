import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Utilidades {

	public void printarDirectivo(ArrayList<Directivo> miFicheroDirectivo) {
		String texto = "";
		for (Directivo directivo : miFicheroDirectivo)
			texto += directivo.getData() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public void printarTecnico(ArrayList<Tecnico> FicheroTecnico) {
		String texto = "";
		for (Tecnico tec : FicheroTecnico)
			texto += tec.getData() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public void printarOficial(ArrayList<Oficial> FicheroOficial) {
		String texto = "";
		for (Oficial ofi : FicheroOficial)
			texto += ofi.getData() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public Directivo pedirDatosDirectivos() {
		Directivo directivo = new Directivo();
		directivo.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el directivo"));
		directivo.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el directivo"));
		directivo.setPlus(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Plus salarial de el directivo")));
		directivo.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el directivo")));
		return directivo;
	}

	public Tecnico pedirDatosTecnico() {
		Tecnico tecnico = new Tecnico();
		tecnico.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el tecnico"));
		tecnico.setEspecialidad(JOptionPane.showInputDialog("Escribe la Especialidad de el tecnico"));
		tecnico.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el tecnico"));
		tecnico.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el tecnico")));
		tecnico.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el tecnico")));
		return tecnico;
	}

	public Oficial pedirDatosOficial() {
		Oficial oficial = new Oficial();
		oficial.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el oficia"));
		oficial.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el oficia"));
		oficial.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el oficia")));
		oficial.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el oficia")));
		oficial.setSobresueldo(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Sobresalario de el oficia")));
		return oficial;
	}

	public void AltaDirectivo(String nombreFichero) {
		String nombrefichero = nombreFichero;
		Gestionfichero gf = new Gestionfichero();
		Directivo directivo = new Directivo();
		directivo.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el directivo"));
		directivo.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el directivo"));
		directivo.setPlus(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Plus salarial de el directivo")));
		directivo.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el directivo")));
		gf.escribirDirectivo(directivo, nombrefichero);
	}

	public void AltaTecnico(String nombreFichero) {
		String nombrefichero = nombreFichero;
		Gestionfichero gf = new Gestionfichero();
		Tecnico tecnico = new Tecnico();
		tecnico.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el tecnico"));
		tecnico.setEspecialidad(JOptionPane.showInputDialog("Escribe el Especialidad de el tecnico"));
		tecnico.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el tecnico"));
		tecnico.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el tecnico")));
		tecnico.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el tecnico")));
		gf.escribirOperario(tecnico, nombrefichero);
	}

	public void AltaOficial(String nombreFichero) {
		String nombrefichero = nombreFichero;
		Gestionfichero gf = new Gestionfichero();
		Oficial oficial = new Oficial();
		oficial.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el oficia"));
		oficial.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el oficia"));
		oficial.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el oficia")));
		oficial.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el oficia")));
		oficial.setSobresueldo(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Sobresalario de el oficia")));
		gf.escribirOperario(oficial, nombrefichero);
	}

}
