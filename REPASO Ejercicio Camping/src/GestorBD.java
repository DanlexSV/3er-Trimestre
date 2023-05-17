import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GestorBD {

	private static java.sql.Connection dasv;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String pwd = "";
	private static final String url = "jdbc:mysql://localhost:3306/camping";

	public GestorBD() {
		try {
			Class.forName(driver);
			dasv = DriverManager.getConnection(url, user, pwd);
			if (dasv != null) {
				JOptionPane.showMessageDialog(null, "Conexion");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
	}

	public boolean insertarDatos(Camping cam) {
		boolean insert = false;
		String SQL = "INSERT INTO `camping`(`Plaza`, `DNI`, `estancia_dias`, `Caravana`) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = dasv.prepareStatement(SQL);
			if (cam instanceof Caravana) {
				Caravana crv = (Caravana) cam;
				ps.setString(1, crv.getDNI());
				ps.setInt(2, crv.getNumDias());
				ps.setString(3, crv.getMatricula());
			} else {
				ps.setString(1, cam.getDNI());
				ps.setInt(2, cam.getNumDias());
			}
			if (ps.executeUpdate() >= 1)
				insert = true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			insert = false;
		}
		return insert;
	}
	
	public ResultSet maxPlaza() {
		ResultSet rs = null;
		String SQL = "SELECT MAX(`Plaza`) FROM `camping`";
		try {
			Statement st = dasv.prepareStatement(SQL);
			rs = st.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error(es) detectados: " + e.getMessage());
		}
		return rs;
	}
}
