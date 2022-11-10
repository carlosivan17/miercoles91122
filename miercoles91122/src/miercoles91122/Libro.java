package miercoles91122;

public class Libro {
	private String ISBN;
	private String Nombre;
	private String Autor;
	private int NumPaginas;
	public Libro(String iSBN, String nombre, String autor, int numPaginas) {
		super();
		ISBN = iSBN;
		Nombre = nombre;
		Autor = autor;
		NumPaginas = numPaginas;
	}
	public void mostrar() {
		System.out.println("El libro se llama " + Nombre);
		System.out.println("El ISBN del " + Nombre + " es de " + ISBN);
		System.out.println("El autor del " + Nombre + " es " + Autor);
		System.out.println("El numero de paginas del " + Nombre + " es de " + NumPaginas);
	}
	public String mostrarISBN() {
		return ISBN;
	}
	public void ponerISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String mostrarNombre() {
		return Nombre;
	}
	public void ponerNombre(String nombre) {
		Nombre = nombre;
	}
	public String mostrarAutor() {
		return Autor;
	}
	public void ponerAutor(String autor) {
		Autor = autor;
	}
	public int mostrarNumPaginas() {
		return NumPaginas;
	}
	public void ponerNumPaginas(int numPaginas) {
		NumPaginas = numPaginas;
	}
	

}
