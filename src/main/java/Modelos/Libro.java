package Modelos;

import java.util.Objects;

public class Libro extends Producto{

    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, double precio, int cantidadEnStock, String autor, int numPaginas) {
        super(titulo, descripcion, precio, cantidadEnStock);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return numPaginas == libro.numPaginas && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autor, numPaginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
