package BDATOS;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestorBD {
	
	private static java.sql.Connection dasv;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String pwd = "";
	private static final String url = "jdbc:mysql://localhost:3306/polimorfismo";
	
	public GestorBD() {
		try {
			Class.forName(driver);
			dasv = DriverManager.getConnection(url, user, pwd);
			if (dasv != null)
				JOptionPane.showMessageDialog(null, "Conexion");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public boolean insertarDatos(Reserva re) {
		boolean insertado = false;
		String SQL = "INSERT INTO `reservas`(`num_reserva`, `comensal`, `VIP`) VALUES (?,?,?)";
		try {
			PreparedStatement ps = dasv.prepareStatement(SQL);
			if (re instanceof ClienteVip) {
				ClienteVip vp = (ClienteVip) re;
				ps.setInt(1, vp.getNum_Reserva());
				ps.setString(2, vp.getComensal());
				ps.setInt(3, vp.getNumSocio());
			} else {
				ps.setInt(1, re.getNum_Reserva());
				ps.setString(2, re.getComensal());
			}
			if (ps.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			insertado = false;
		}
		return insertado;
	}
	
	/*public void getDatos(ArrayList<Reserva> datos) {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `reservas`";
		try {
			Statement st = dasv.createStatement();
			rs = st.executeQuery(SQL);
			if (rs.getInt(3) == 0) {
				
			}
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
	}*/
	
}
