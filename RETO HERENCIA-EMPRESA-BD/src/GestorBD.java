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
	private static final String url = "jdbc:mysql://localhost:3306/empresa";

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

	public boolean insertarDirectivo(Directivo direct) {
		boolean insertado = false;
		String SQL = "INSERT INTO `directivo`(`NOMBRE`, `DNI`, `SALARIO_INIC`, `PLUS_SALARIAL`, `SALARIO_TOTAL`) VALUES (?,?,?,?,?)";
		try {
			PreparedStatement ps = dasv.prepareStatement(SQL);
			ps.setString(1, direct.getNombre());
			ps.setString(2, direct.getDNI());
			ps.setDouble(3, direct.getSalario());
			ps.setDouble(4, direct.getPlus());
			ps.setDouble(5, direct.calcularnomina());
			if (ps.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			insertado = false;
		}
		return insertado;
	}

	public boolean insertarTecnico(Tecnico tec) {
		boolean insertado = false;
		String SQL = "INSERT INTO `tecnico`(`NOMBRE`, `DNI`, `SALARIO_INIC`, `NUM_OBRA`, `SALARIO_TOTAL`, `OFICIO`) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dasv.prepareStatement(SQL);
			ps.setString(1, tec.getNombre());
			ps.setString(2, tec.getDNI());
			ps.setDouble(3, tec.getSalario());
			ps.setDouble(4, tec.getNumobra());
			ps.setDouble(5, tec.calcularnomina());
			ps.setString(6, tec.quiensoy());
			if (ps.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			insertado = false;
		}
		return insertado;
	}

	public boolean insertarOficial(Oficial ofi) {
		boolean insertado = false;
		String SQL = "INSERT INTO `oficial`(`NOMBRE`, `DNI`, `SALARIO_INIC`, `NUM_OBRA`, `SOBRESUELDO`, `SALARIO_TOTAL`, `OFICIO`) VALUES (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dasv.prepareStatement(SQL);
			ps.setString(1, ofi.getNombre());
			ps.setString(2, ofi.getDNI());
			ps.setDouble(3, ofi.getSalario());
			ps.setDouble(4, ofi.getNumobra());
			ps.setDouble(5, ofi.getSobresueldo());
			ps.setDouble(6, ofi.calcularnomina());
			ps.setString(7, ofi.quiensoy());
			if (ps.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			insertado = false;
		}
		return insertado;
	}

	public ResultSet getConsultaDirectivo() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `directivo`";
		try {
			Statement st = dasv.createStatement();
			rs = st.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}

	public ResultSet getConsultaTecnico() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `tecnico`";
		try {
			Statement st = dasv.createStatement();
			rs = st.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}

	public ResultSet getConsultaOficial() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `oficial`";
		try {
			Statement st = dasv.createStatement();
			rs = st.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}
}
