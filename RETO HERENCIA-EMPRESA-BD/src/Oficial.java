
public class Oficial extends Operario {
	private double sobresueldo;

	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficial(double sobresueldo) {
		super();
		this.sobresueldo = sobresueldo;
	}

	public double getSobresueldo() {
		return sobresueldo;
	}

	public void setSobresueldo(double sobresueldo) {
		this.sobresueldo = sobresueldo;
	}

	public double calcularnomina() {
		double resultado = salario + sobresueldo;
		return resultado;
	}

	public String quiensoy() {
		quienSoy = "Oficial";
		return quienSoy;
	}
}
