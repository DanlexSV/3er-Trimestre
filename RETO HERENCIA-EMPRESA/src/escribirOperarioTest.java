import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.junit.Test;

public class escribirOperarioTest {

	@Test
	public void test() {
		String nombreFichero;
		Utilidades ut = new Utilidades();
		Gestionfichero gF = new Gestionfichero();
		ArrayList<Tecnico> FicheroTecnico = new ArrayList<Tecnico>();
		nombreFichero = JOptionPane.showInputDialog("Escribe el Nombre de el fichero del Tecnico");
		ut.AltaTecnico(nombreFichero);
		FicheroTecnico = gF.leerFicheroTecnico(nombreFichero);
		ut.printarTecnico(FicheroTecnico);
	}

}
