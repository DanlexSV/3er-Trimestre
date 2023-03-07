import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gestionFichero {

	public void escribirFrescos(Frescos fresco) {
		try {
			FileWriter fw = new FileWriter("Frescos.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(fresco.getEnvasado() + "," + fresco.getFechaCaducidad() + "," + fresco.getNumeroLote() + ","
					+ fresco.getOrigen() + "\n");
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void escribirCongelados(Congelados congelado) {
		
	}
	
	public void escribrRefrigerados(Refrigerados refri) {
		
	}
}
