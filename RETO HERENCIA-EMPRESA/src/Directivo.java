
public class Directivo extends Empleados {
	private double plus;

	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directivo(double plus) {
		super();
		this.plus = plus;
	}

	public double getPlus() {
		return plus;
	}

	public void setPlus(double plus) {
		this.plus = plus;
	}

	public double calcularnomina() {
		double calculo;
		calculo = salario + plus;
		return calculo;
	}
	
	public String getData() {
		String ret = "";
		ret += super.getData() + " - " + plus + " - " + salarioFinal;
		return ret;
	}
}
