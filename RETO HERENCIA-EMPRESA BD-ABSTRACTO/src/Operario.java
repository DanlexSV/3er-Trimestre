
abstract public class Operario extends Empleados {
	protected int numobra;
	protected String quienSoy;

	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operario(int numobra) {
		super();
		this.numobra = numobra;
	}

	public int getNumobra() {
		return numobra;
	}

	public void setNumobra(int numobra) {
		this.numobra = numobra;
	}

	public String getQuienSoy() {
		return quienSoy;
	}

	public void setQuienSoy(String quienSoy) {
		this.quienSoy = quienSoy;
	}

	abstract double calcularNomina();

}
