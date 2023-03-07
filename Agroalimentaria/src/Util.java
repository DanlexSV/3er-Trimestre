
import javax.swing.JOptionPane;

public class Util {

	public Frescos pedirDatosFrescos() {
		Frescos fresco = new Frescos();
		fresco.setFechaCaducidad(JOptionPane.showInputDialog(null, "Escriba la fecha de Caducidad"));
		fresco.setEnvasado(JOptionPane.showInputDialog(null, "Escriba Fecha de envasado"));
		fresco.setNumeroLote(JOptionPane.showInputDialog(null, "Escriba el número de lote"));
		fresco.setOrigen(JOptionPane.showInputDialog(null, "Escriba el lugar de origen"));
		return fresco;
	}

	public Congelados pedirDatosCongelados() {
		Congelados congelado = new Congelados();
		congelado.setFechaCaducidad(JOptionPane.showInputDialog(null, "Escriba la fecha de Caducidad"));
		congelado.setTemperatura(JOptionPane.showInputDialog(null, "Escriba la temperatura del producto"));
		congelado.setNumeroLote(JOptionPane.showInputDialog(null, "Escriba el número de lote"));
		return congelado;
	}
	
	public Refrigerados pedirDatosRefrigerados () {
		Refrigerados refri = new Refrigerados();
		refri.setFechaCaducidad(JOptionPane.showInputDialog(null, "Escriba la fecha de Caducidad"));
		refri.setOrganismo(JOptionPane.showInputDialog(null, "Escriba el Organismo"));
		refri.setNumeroLote(JOptionPane.showInputDialog(null, "Escriba el número de lote"));
		refri.setCodigo(JOptionPane.showInputDialog(null, "escriba el codigo"));
		return refri;
	}
}
