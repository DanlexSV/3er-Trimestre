
public class Libro extends Publicacion {

	private String autor;

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getData() {
		String texto = "";
		texto += ISBN + ", " + titulo + ", " + precio + ", " + autor;
		return texto;
	}
}
