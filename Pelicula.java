/**
 * Clase que representa una película.
 * Contiene información básica como título, género y año de estreno.
 * 
 * @author Pinto Hernan
 * @version 1.0
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private int anio;

    /**
     * Constructor de la clase Pelicula.
     * 
     * @param titulo título de la película
     * @param genero género de la película
     * @param anio año de estreno
     */
    public Pelicula(String titulo, String genero, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    /** 
     * Devuelve el título de la película.
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el género de la película.
     * @return género
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Devuelve el año de estreno.
     * @return año
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Muestra la información completa de la película.
     * @return cadena con los datos de la película
     */
    @Override
    public String toString() {
        return "Título: " + titulo + " | Género: " + genero + " | Año: " + anio;
    }
}
