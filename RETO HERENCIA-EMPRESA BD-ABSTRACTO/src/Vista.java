import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Vista {

	public Directivo pedirDatosDirectivos() {
		Directivo directivo = new Directivo();
		directivo.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el directivo"));
		directivo.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el directivo"));
		directivo.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el directivo")));
		directivo.setPlus(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Plus salarial de el directivo")));
		return directivo;
	}

	public Tecnico pedirDatosTecnico() {
		Tecnico tecnico = new Tecnico();
		tecnico.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el tecnico"));
		tecnico.setEspecialidad(JOptionPane.showInputDialog("Escribe la Especialidad de el tecnico"));
		tecnico.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el tecnico"));
		tecnico.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el tecnico")));
		tecnico.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el tecnico")));
		return tecnico;
	}

	public Oficial pedirDatosOficial() {
		Oficial oficial = new Oficial();
		oficial.setDNI(JOptionPane.showInputDialog("Escribe el DNI de el oficia"));
		oficial.setNombre(JOptionPane.showInputDialog("Escribe el Nombre de el oficia"));
		oficial.setNumobra(Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de obra de el oficia")));
		oficial.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Salario de el oficia")));
		oficial.setSobresueldo(Double.parseDouble(JOptionPane.showInputDialog("Escribe el Sobresalario de el oficia")));
		return oficial;
	}

	public void mostrarDatos(ResultSet rs, int num) {
		int i = 0;
		try {
			while (rs.next()) {
				i++;
				switch (num) {
				case 5:
					JOptionPane.showMessageDialog(null, rs.getString(1) + ", " + rs.getString(2) + ", "
							+ rs.getString(3) + ", " + rs.getString(4) + ", " + rs.getString(5));
					break;
				case 6:
					JOptionPane.showMessageDialog(null,
							rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)
									+ ", " + rs.getString(5) + ", " + rs.getString(6));
					break;
				case 7:
					JOptionPane.showMessageDialog(null,
							rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getString(4)
									+ ", " + rs.getString(5) + ", " + rs.getString(6) + ", " + rs.getString(7));
					break;
				}
			}
			if (i == 0)
				JOptionPane.showMessageDialog(null, "No hay datos");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}