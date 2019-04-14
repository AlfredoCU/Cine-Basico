package cine;

// Clase hija Sala.
public class Sala extends Pelicula {
    // Atributos privados.
    private int idSala;
    private int asientosTotales;
    private String tipoSala;
    
    // Constructor.
    public Sala(int idSala, int asientosTotales, String tipoSala, String titulo, String genero, String clasificacion, int duracion) {
        super(titulo, genero, clasificacion, duracion);
        this.idSala = idSala;
        this.asientosTotales = asientosTotales;
        this.tipoSala = tipoSala;
    }
    
    // Get y Set.
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getAsientosTotales() {
        return asientosTotales;
    }

    public void setAsientosTotales(int asientosTotales) {
        this.asientosTotales = asientosTotales;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    } 
}