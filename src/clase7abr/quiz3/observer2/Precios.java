package clase7abr.quiz3.observer2;
// Sistema de precios de un supermercado

public class Precios {
    String producto;
    int precio;

    Modificaciones modificador = new Modificaciones() {
    };

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
        modificador.modificarPrecio(); // Si se cambia el precio del producto es necesario que se modifique en todos
        // los equipos donde está registrado
    }
}
