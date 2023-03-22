import java.sql.DriverManager;
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
			sI.execute("INSERT INTO `coche`(`Agencia`, `Modelo`, `Kilometraje`, `Año`) VALUES ('Hyundai', 'Tucson', 0, 2023)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insertado;
	}
 }
