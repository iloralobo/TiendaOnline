package Modelos;

import java.util.List;
import java.util.Objects;

public class TiendaOnline {

    private List<Producto> listaProducto;

    public List<Producto> agregarProducto(Producto producto){
        listaProducto.add(producto);
        return listaProducto;
    }

    public List<Producto> buscarProducto(Producto producto){
        listaProducto.indexOf(producto);
        return listaProducto;
    }

    public List<Producto> eliminarProducto(Producto producto){
        listaProducto.remove(producto);
        return listaProducto;
    }

    public TiendaOnline() {
    }

    public TiendaOnline(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public List<Producto> getProducto() {
        return listaProducto;
    }

    public void setProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiendaOnline that = (TiendaOnline) o;
        return Objects.equals(listaProducto, that.listaProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaProducto);
    }

    @Override
    public String toString() {
        return "TiendaOnline{" +
                "listaProducto=" + listaProducto +
                '}';
    }

}
