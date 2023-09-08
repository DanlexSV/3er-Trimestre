import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestionBD {

	private static java.sql.Connection conn;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String pwd = "";
	private static final String url = "jdbc:mysql://localhost:3306/Floristeria?serverTimezone=UTC";

	public GestionBD() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			if (conn != null) {
				JOptionPane.showMessageDialog(null, "CONEXION");
			} else {
				JOptionPane.showMessageDialog(null, "NO CONEXION");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public boolean Insertar(Planta p) {
		boolean insertado = false;

		if (p instanceof Interior) {
			Interior in = (Interior) p;
			String sql = "INSERT INTO `Floristeria`(`Especie`, `Origen`, `Tipo`, `Precio`, `FrecuenciadeRiego`) VALUES (?,?,?,?,?)";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, in.getEspecie());
				ps.setString(2, in.getOrigen());
				ps.setString(3, in.getTipo());
				ps.setDouble(4, in.getPrecio());
				ps.setString(5, in.getFrecuenciadeRiego());
				if (ps.executeUpdate() >= 1) {
					insertado = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} else if (p instanceof Exterior) {
			Exterior ex = (Exterior) p;
			String sql = "INSERT INTO `Floristeria`(`Especie`, `Origen`, `Tipo`, `Precio`, `Ubicacion`) VALUES (?,?,?,?,?)";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, ex.getEspecie());
				ps.setString(2, ex.getOrigen());
				ps.setString(3, ex.getTipo());
				ps.setDouble(4, ex.getPrecio());
				ps.setString(5, ex.getUbicacion());
				if (ps.executeUpdate() >= 1) {
					insertado = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} else {
			Ramos ra = (Ramos) p;
			String sql = "INSERT INTO `Floristeria`(`Especie`, `Origen`, `Tipo`, `Precio`, `NumerodeFlores`) VALUES (?,?,?,?,?)";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, ra.getEspecie());
				ps.setString(2, ra.getOrigen());
				ps.setString(3, ra.getTipo());
				ps.setDouble(4, ra.getPrecio());
				ps.setInt(5, ra.getNumerodeFlores());
				if (ps.executeUpdate() >= 1) {
					insertado = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		return insertado;
	}

	public ArrayList<Planta> Consulta() {
		ArrayList<Planta> Plantas = new ArrayList<Planta>();
		ResultSet rs = null;
		String sql = "SELECT * FROM `Floristeria`";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		try {
			while (rs.next()) {
				if (rs.getString("Tipo").equals("Interior")) {

					Interior in = new Interior();

					in.setEspecie(rs.getString("Especie"));
					in.setOrigen(rs.getString("Origen"));
					in.setTipo(rs.getString("Tipo"));
					in.setPrecio(rs.getDouble("Precio"));
					in.setFrecuenciadeRiego(rs.getString("FrecuenciadeRiego"));

					Plantas.add(in);

				} else if (rs.getString("Tipo").equals("Exterior")) {

					Exterior ex = new Exterior();

					ex.setEspecie(rs.getString("Especie"));
					ex.setOrigen(rs.getString("Origen"));
					ex.setTipo(rs.getString("Tipo"));
					ex.setPrecio(rs.getDouble("Precio"));
					ex.setUbicacion(rs.getString("Ubicacion"));

					Plantas.add(ex);

				} else {
					Ramos ra = new Ramos();

					ra.setEspecie(rs.getString("Especie"));
					ra.setOrigen(rs.getString("Origen"));
					ra.setTipo(rs.getString("Tipo"));
					ra.setPrecio(rs.getDouble("Precio"));
					ra.setNumerodeFlores(rs.getInt("NumerodeFlores"));

					Plantas.add(ra);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return Plantas;
	}
}