import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class gestionBD {

	private static java.sql.Connection conn;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String pwd = "";
	private static final String url = "jdbc:mysql://localhost:3306/concensonario";

	public gestionBD() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			if (conn != null)
				System.out.println("Conexion");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

	public boolean insertar() {
		boolean insertado = false;
		Statement sI;
		try {
			sI = conn.createStatement();
			sI.execute(
					"INSERT INTO `coche`(`Agencia`, `Modelo`, `Kilometraje`, `Año`) VALUES ('Hyundai', 'Tucson', 0, 2023)");
			insertado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			insertado = false;
			e.printStackTrace();
		}
		return insertado;
	}

	public boolean insertarCoche(Coche micoche) {
		boolean insertado = false;
		/*Manera 1*/
		//String sql = "INSERT INTO `coche`(`Agencia`, `Modelo`, `Kilometraje`, `Año`) VALUES ('" + micoche.getAgencia()
		//		+ "', '" + micoche.getModelo() + "', " + micoche.getKilometraje() + ", " + micoche.getAño() + ");";
		String sql1 = "INSERT INTO `coche`(`Agencia`, `Modelo`, `Kilometraje`, `Año`) VALUES (?,?,?,?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.setString(1, micoche.getAgencia());
			ps.setString(2, micoche.getModelo());
			ps.setInt(3, micoche.getKilometraje());
			ps.setInt(4, micoche.getAño());
			if (ps.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return insertado;
	}
	
	public ResultSet getConsulta() {
		ResultSet rs = null;
		String sql = "Select * From `coche`";
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}
	
	public ResultSet getConsultallyId(String Ident) {
		ResultSet rs = null;
		String sql = "SELECT * FROM `coche` WHERE `Ident` = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Ident);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return rs;
	}

}
