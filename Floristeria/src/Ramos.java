
public class Ramos extends Planta {

	private int NumerodeFlores;

	public int getNumerodeFlores() {
		return NumerodeFlores;
	}

	public void setNumerodeFlores(int numerodeFlores) {
		NumerodeFlores = numerodeFlores;
	}

	@Override
	double CalcularPrecio() {
		return this.Precio + (2 * this.NumerodeFlores);
	}

}
