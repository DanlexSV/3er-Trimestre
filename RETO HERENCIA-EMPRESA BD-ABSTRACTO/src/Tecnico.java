
public class Tecnico extends Operario {
	private String especialidad;

	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String especialidad) {
		super();
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public double calcularNomina() {
		return salario;
	}

	public String quiensoy() {
		quienSoy = "Tecnico";
		return quienSoy;
	}
}
