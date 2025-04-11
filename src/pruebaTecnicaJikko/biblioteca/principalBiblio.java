package pruebaTecnicaJikko.biblioteca;

import pruebaTecnicaJikko.biblioteca.entidades.*;

public class principalBiblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear biblioteca y libros con editoriales
        biblioteca biblioteca = new biblioteca();

        libro libro1 = new libro("Crónica de una muerte anunciada", "Gabriel García Márquez", "Editorial Sudamericana");
        libro libro2 = new libro("Cómo hacer que te pasen cosas buenas", "Marian Rojas Estapé", "Espasa");
        libro libro3 = new libro("La Bruja", "Germán Castro Caycedo", "Planeta");
        libro libro4 = new libro("It", "Stephen King", "Viking Press");
        libro libro5 = new libro("Un exorcista cuenta su historia", "Gabriel Amorth", "Paulinas");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        // Crear miembros
        miembro lida = new miembro("Lida Guerrero", 1);
        miembro laura = new miembro("Laura Gómez", 2);
        biblioteca.agregarMiembro(lida);
        biblioteca.agregarMiembro(laura);

        // Mostrar libros disponibles
        System.out.println("Libros disponibles");
        biblioteca.mostrarLibrosDisponibles();

        //presta un libro
        System.out.println("\n miembro presta 'It'");
        libro buscado1 = biblioteca.buscarPorTitulo("It");
        if (buscado1 != null) {
            lida.prestarLibro(buscado1);
        }

        // Laura presta "Cómo hacer que te pasen cosas buenas"
        System.out.println("\n miembro presta 'Cómo hacer que te pasen cosas buenas' ");
        libro buscado2 = biblioteca.buscarPorTitulo("Cómo hacer que te pasen cosas buenas");
        if (buscado2 != null) {
            laura.prestarLibro(buscado2);
        }

        // Mostrar libros disponibles después de préstamos
        System.out.println("\nLibros disponibles");
        biblioteca.mostrarLibrosDisponibles();

        // Lida devuelve "It"
        System.out.println("\n miembro devuelve 'It' ");
        lida.devolverLibro(buscado1);

        // Mostrar libros disponibles al final
        System.out.println("\n Libros disponibles al final");
        biblioteca.mostrarLibrosDisponibles();
	}

}