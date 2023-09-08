
public class Interior extends Planta {

	private String FrecuenciadeRiego;

	public String getFrecuenciadeRiego() {
		return FrecuenciadeRiego;
	}

	public void setFrecuenciadeRiego(String frecuenciadeRiego) {
		FrecuenciadeRiego = frecuenciadeRiego;
	}

	@Override
	double CalcularPrecio() {
		return this.Precio + (this.Precio * 0.21);
	}

}
