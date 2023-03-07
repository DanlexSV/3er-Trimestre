
public class Agro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Util util = new Util();
		gestionFichero gf = new gestionFichero();
		Frescos lechuga = util.pedirDatosFrescos();
		gf.escribirFrescos(lechuga);
	}

}
