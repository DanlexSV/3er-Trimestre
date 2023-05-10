package BDATOS;

public class Reserva {

	protected int numReserva;
	protected String Comensal;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum_Reserva() {
		return numReserva;
	}

	public void setNum_Reserva(int numReserva) {
		this.numReserva = numReserva;
	}

	public String getComensal() {
		return Comensal;
	}

	public void setComensal(String comensal) {
		Comensal = comensal;
	}

	public String MostrarReserva() {
		String texto = "";
		texto += "El número de reserva es: " + numReserva + ". \n" + "El nombre comensal es: " + Comensal;
		return texto;
	}
}
