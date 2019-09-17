 
package Clases;

public class DetalleOrden {
private Notebook item;
private float precioUnitario;
public int cantidad;

    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    DetalleOrden() {
    }

    public Notebook getItem() {
        return item;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }



}

