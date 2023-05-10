
public class Revista extends Publicacion {

	private String edicion;
	private int pag;

	public Revista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		String texto = "";
		texto += ISBN + ", " + titulo + ", " + precio + ", " + edicion + ", " + pag;
		return texto;
	}
	
}
