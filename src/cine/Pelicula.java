package cine;

// Clase padre Pelicula.
public class Pelicula {
    // Atributos privados.
    private String titulo;
    private String genero;
    private String clasificacion;
    private int duracion;
    
    // Constructor.
    public Pelicula(String titulo, String genero, String clasificacion, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }
    
    // Get y Set.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}