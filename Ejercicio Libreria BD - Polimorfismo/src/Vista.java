import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vista {

	public Revista AltaRevista() {
		Revista re = new Revista();
		re.setISBN(JOptionPane.showInputDialog("Escriba el ISBN de la revista."));
		re.setTitulo(JOptionPane.showInputDialog("Escriba el titulo asignado."));
		re.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio correspondiente.")));
		re.setEdicion(JOptionPane.showInputDialog("Escriba la edicion actual."));
		re.setPag(Integer.parseInt(JOptionPane.showInputDialog("Escriba el número de paginas.")));
		return re;
	}

	public Libro AltaLibro() {
		Libro lb = new Libro();
		lb.setISBN(JOptionPane.showInputDialog("Escriba el ISBN del libro."));
		lb.setTitulo(JOptionPane.showInputDialog("Escriba el titulo asignado."));
		lb.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio correspondiente.")));
		lb.setAutor(JOptionPane.showInputDialog("Escriba el autor del libro."));
		return lb;
	}

	public ArrayList<Revista> LeerRe(ResultSet rs) {
		ArrayList<Revista> lectura = new ArrayList<Revista>();
		int i = 0;
		try {
			while (rs.next()) {
				i++;
				JOptionPane.showMessageDialog(null, rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3)
						+ ", " + rs.getString(4) + ", " + rs.getString(5));
			}
			if (i == 0)
				JOptionPane.showMessageDialog(null, "No hay datos en Revista.");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error detectado: " + e.getErrorCode());
		}
		return lectura;
	}

	public ArrayList<Libro> LeerLib(ResultSet rs) {
		ArrayList<Libro> lector = new ArrayList<Libro>();
		int i = 0;
		try {
			while (rs.next()) {
				i++;
				JOptionPane.showMessageDialog(null,
						rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4));
			}
			if (i == 0)
				JOptionPane.showMessageDialog(null, "No hay datos en Revista.");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error detectado: " + e.getErrorCode());
		}
		return lector;
	}

	public void ListarR(ArrayList<Revista> revista) {
		String texto = "";
		for (Revista re : revista)
			texto += re.getData() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}

	public void ListarL(ArrayList<Libro> libro) {
		String texto = "";
		for (Libro lb : libro)
			texto += lb.getData() + "\n";
		JOptionPane.showMessageDialog(null, texto);
	}
}
