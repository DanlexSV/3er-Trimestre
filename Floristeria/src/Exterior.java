
public class Exterior extends Planta {

	private String Ubicacion;

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	@Override
	double CalcularPrecio() {
		return this.Precio + (this.Precio * 0.15);
	}

}
