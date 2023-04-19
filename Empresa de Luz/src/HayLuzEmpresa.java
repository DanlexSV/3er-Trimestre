import javax.swing.JOptionPane;

public class HayLuzEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opt = JOptionPane.showInputDialog("Escribe la opcion que desee: ").toUpperCase();
		switch (opt) {
		case "A":
			Autonomo au = new Autonomo();
			au.setConsumo(50);
			au.generarFactura();
			break;
		case "N":
			Clientes cliente =  new Clientes();
			cliente.setConsumo(50);
			cliente.generarFactura();
			break;
		}
	}

}
