package miercoles91122;

public class AppLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro("12345", "Viaje al centro de la tierra", "Julio Verne", 151);
		Libro libro2 = new Libro("98765", "Azul", "Ruben Dario", 155);
		
		System.out.println("El libro 1 es: ");
		libro1.mostrar();
		System.out.println();
		System.out.println("El libro 2 es: ");
		libro2.mostrar();
		System.out.println();
		
		if(libro1.mostrarNumPaginas() > libro2.mostrarNumPaginas()) {
			System.out.println(libro1.mostrarNombre() + " tiene mas paginas que " + libro2.mostrarNombre());
		}
		else if(libro1.mostrarNumPaginas() == libro2.mostrarNumPaginas()) {
			System.out.println("El " + libro1.mostrarNombre() + " tienen la misma cantidad de paginas que " + libro2.mostrarNombre());
			}
		else {
			System.out.println(libro2.mostrarNombre()+ " tiene mas paginas que " + libro1.mostrarNombre());
		}
		}
	}
