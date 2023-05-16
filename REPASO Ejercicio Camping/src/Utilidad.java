import javax.swing.JOptionPane;

public class Utilidad {

	public Camping pedirDatosCamping() {
		Camping cam = new Camping();
		cam.setDNI(JOptionPane.showInputDialog("Escriba su DNI"));
		cam.setNumDias(
				Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de días que estará en las tiendas")));
		return cam;
	}

	public Caravana pedirDatosCaravana() {
		Caravana crv = new Caravana();
		crv.setDNI(JOptionPane.showInputDialog("Escriba su DNI"));
		crv.setNumDias(
				Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de días que estará en las tiendas")));
		crv.setMatricula(JOptionPane.showInputDialog("Escriba la matricula del caravana"));
		return crv;
	}
}
