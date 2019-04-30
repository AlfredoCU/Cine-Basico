package cine;

// Clase hija Cartelera.
public class Cartelera extends Sala {
    // Atributos privados.
    private int idCartelera;
    private int asientosDisponibles;
    private int asientosOcupados;
    private String horaInicio;
    
    // Constructor. 
    public Cartelera(int idCartelera, int asientosDisponibles, int asientosOcupados, 
            String horaInicio, int idSala, int asientosTotales, String tipoSala,
            String titulo, String genero, String clasificacion, int duracion) {
        super(idSala, asientosTotales, tipoSala, titulo, genero, clasificacion, duracion);
        this.idCartelera = idCartelera;
        this.asientosDisponibles = asientosDisponibles;
        this.asientosOcupados = asientosOcupados;
        this.horaInicio = horaInicio;
    }
    
    // Get y Set.
    public int getIdCartelera() {
        return idCartelera;
    }

    public void setIdCartelera(int idCartelera) {
        this.idCartelera = idCartelera;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
        
    //Mostar infomacion de cartelera.
    public String DatosCartelera() {
        return "\n-Número de Cartelera: " + idCartelera + "\n-Pélicula: " + 
                getTitulo() + "\n-Genero: " + getGenero() + "\n-Clasificación: " + 
                getClasificacion() + "\n-Duración: " + getDuracion() + 
                "\n-Hora de Incio: " + horaInicio + "\n-Número de Sala: " + getIdSala() +
                "\n-Tipo de Sala: " + getTipoSala() + "\n-Total de Asientos: " 
                + getAsientosTotales() + "\n-Asientos Disponibles: " + asientosDisponibles +
                "\n-Asientos Vendidos: " + asientosOcupados;
    }
}