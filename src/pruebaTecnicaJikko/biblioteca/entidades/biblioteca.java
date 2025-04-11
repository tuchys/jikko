package pruebaTecnicaJikko.biblioteca.entidades;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private List<libro> libros;
    private List<miembro> miembros;
    
    public biblioteca() {
        libros = new ArrayList<>();
        miembros = new ArrayList<>();
    }

    public void agregarLibro(libro libro) {
        libros.add(libro);
    }

    public void mostrarLibrosDisponibles() {
        for (libro libro : libros) {
            if (libro.disponible()) {
                System.out.println(libro.getNombre() + " por " + libro.getEscritor());
            }
        }
    }
    
    public void agregarMiembro(miembro miembro) {
    	miembros.add(miembro);
    }

    public void mostrarMiembros() {
        for (miembro miembro : miembros) {
            System.out.println(miembro.getNombre() + " ID: " + miembro.getId());
        }
    }
    
    public libro buscarPorTitulo(String titulo) {
        for (libro libro : libros) {
            if (libro.getNombre().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}