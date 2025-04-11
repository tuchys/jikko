package pruebaTecnicaJikko.biblioteca.entidades;

public class libro {
    private String nombre;
    private String escritor;
    private String editorial;
    private boolean disponible;

    public libro(String nombre, String escritor, String editorial) {
        this.nombre = nombre;
        this.escritor = escritor;
        this.editorial = editorial;
        this.disponible = true;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean disponible() {
        return disponible;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
    
}