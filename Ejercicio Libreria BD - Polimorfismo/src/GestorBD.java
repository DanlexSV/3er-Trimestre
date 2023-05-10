import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class GestorBD {

	private static java.sql.Connection afk;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String pwd = "";
	private static final String url = "jdbc:mysql://localhost:3306/libreria";

	public GestorBD() {
		try {
			Class.forName(driver);
			afk = DriverManager.getConnection(url, user, pwd);
			if (afk != null)
				JOptionPane.showMessageDialog(null, "Conexion exitosa");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

	public boolean insertarDatos(Publicacion publi) {
		boolean insertado = false;
		String SQL1 = "INSERT INTO `revista`(`ISBN`, `Titulo`, `Precio`, `Edicion`, `Paginas`) VALUES (?,?,?,?,?)";
		String SQL2 = "INSERT INTO `libro`(`ISBN`, `Titulo`, `Precio`, `Autor`) VALUES (?,?,?,?)";
		try {
			PreparedStatement ps = afk.prepareStatement(SQL1);
			PreparedStatement ps1 = afk.prepareStatement(SQL2);
			if (publi instanceof Revista) {
				Revista rev = (Revista) publi;
				ps.setString(1, rev.getISBN());
				ps.setString(2, rev.getTitulo());
				ps.setDouble(3, rev.getPrecio());
				ps.setString(4, rev.getEdicion());
				ps.setInt(5, rev.getPag());
			} else if (publi instanceof Libro){
				Libro lib = (Libro) publi;
				ps1.setString(1, lib.getISBN());
				ps1.setString(2, lib.getTitulo());
				ps1.setDouble(3, lib.getPrecio());
				ps1.setString(4, lib.getAutor());
			}
			if (ps.executeUpdate() >= 1 || ps1.executeUpdate() >= 1)
				insertado = true;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			insertado = false;
		}
		return insertado;
	}
	
	public ResultSet ConsultaRevista() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `revista`";
		try {
			Statement ps = afk.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error detectado: " + e.getErrorCode());
		}
		return rs;
	}
	
	public ResultSet ConsultaLibro() {
		ResultSet rs = null;
		String SQL = "SELECT * FROM `libro`";
		try {
			Statement ps = afk.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error detectado: " + e.getErrorCode());
		}
		return rs;
	}
}
