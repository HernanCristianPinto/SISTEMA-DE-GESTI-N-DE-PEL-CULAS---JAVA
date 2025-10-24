import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una colección de películas.
 * Permite agregar y listar películas.
 * 
 * @author 
 * @version 1.0
 */
public class GestorPeliculas {
    private List<Pelicula> peliculas;

    /**
     * Constructor: inicializa la lista de películas.
     */
    public GestorPeliculas() {
        peliculas = new ArrayList<>();
    }

    /**
     * Agrega una nueva película al sistema.
     * 
     * @param pelicula la película a agregar
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Muestra todas las películas registradas.
     */
    public void mostrarPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }

    /**
     * Método principal de prueba del sistema.
     * @param args argumentos de línea de comando
     */
    public static void main(String[] args) {
        GestorPeliculas gestor = new GestorPeliculas();

        gestor.agregarPelicula(new Pelicula("Inception", "Ciencia Ficción", 2010));
        gestor.agregarPelicula(new Pelicula("Titanic", "Romance", 1997));
        gestor.agregarPelicula(new Pelicula("Avatar", "Aventura", 2009));

        System.out.println("Listado de Películas:");
        gestor.mostrarPeliculas();
    }
}
