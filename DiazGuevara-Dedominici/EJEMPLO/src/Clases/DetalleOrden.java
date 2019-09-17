
package Clases;
/**
 * @author Dedominici/DiazGuevara
 * @version 1.0
 */
public class DetalleOrden {
    private Notebook item;
    private float precioUnitario;
    private int cantidad;
/**
 * Detalle de los parametros del contructor
 * @param item
 * @param precioUnitario
 * @param cantidad 
 */
    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
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
