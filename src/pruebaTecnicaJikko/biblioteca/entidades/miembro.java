package pruebaTecnicaJikko.biblioteca.entidades;

import java.util.ArrayList;
import java.util.List;

public class miembro {
	private String nombre;
	private int id;
    private List<libro> librosPrestados;
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLibrosPrestados(List<libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
    public List<libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public miembro(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(libro libro) {
        if (libro.disponible()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println(nombre + " ha prestado el libro: " + libro.getNombre());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver();
            System.out.println(nombre + " ha devuelto el libro: " + libro.getNombre());
        } else {
            System.out.println("Este libro no fue prestado por " + nombre);
        }
    }

}