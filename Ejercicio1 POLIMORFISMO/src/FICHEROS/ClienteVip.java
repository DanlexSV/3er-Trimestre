package FICHEROS;

public class ClienteVip extends Reservas {

	private int NumSocio;

	public ClienteVip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumSocio() {
		return NumSocio;
	}

	public void setNumSocio(int numSocio) {
		NumSocio = numSocio;
	}

	public String MostrarReserva() {
		String texto = "";
		texto += super.MostrarReserva() + ". \n" + "Y el número de socio es: " + NumSocio;
		return texto;
	}
}
