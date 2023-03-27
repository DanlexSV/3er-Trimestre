import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Vista {

	public void MostrarDatos(ResultSet rs) {
		int i = 0;
		try {
			while (rs.next()) {
				i++;
				JOptionPane.showMessageDialog(null, rs.getString("Agencia") + rs.getString("Modelo")
						+ rs.getString("Kilometraje") + rs.getString("Año"));
			}
			if (i == 0)
				JOptionPane.showMessageDialog(null, "No hay datos");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public Coche PedirDatos() {
		Coche micoche = new Coche();
		micoche.setAgencia(JOptionPane.showInputDialog("Escriba la Agencia del coche"));
		micoche.setModelo(JOptionPane.showInputDialog("Escriba el Modelo del coche"));
		micoche.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog("Escriba el Kilometraje del coche")));
		micoche.setAño(Integer.parseInt(JOptionPane.showInputDialog("Escriba el Año del coche")));
		return micoche;
	}
}
