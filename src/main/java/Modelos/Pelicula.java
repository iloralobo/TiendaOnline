package Modelos;

import java.sql.Time;
import java.util.Objects;

public class Pelicula extends Producto{

    private String director;
    private Time duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String descripcion, double precio, int cantidadEnStock, String director, Time duracion) {
        super(titulo, descripcion, precio, cantidadEnStock);
        this.director = director;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(director, pelicula.director) && Objects.equals(duracion, pelicula.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director, duracion);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
