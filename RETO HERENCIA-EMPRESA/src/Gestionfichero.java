import java.io.*;

public class Gestionfichero {
	
	public void escribirDirectivo(Directivo directivo, String nombrefichero) {
		try {
			FileWriter fw = new FileWriter(nombrefichero, true);
			BufferedWriter bw = new BufferedWriter(fw);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
