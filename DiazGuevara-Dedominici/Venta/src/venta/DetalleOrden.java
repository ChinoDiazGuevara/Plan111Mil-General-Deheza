package venta;

public class DetalleOrden {
    private Notebook item;
    private float precioUnitario;
    private int cantidad;

public DetalleOrden (Notebook item, float precioUnitario, int cantidad){
    this.item= item;
    this.precioUnitario= precioUnitario;
    this.cantidad= cantidad;
}

public float getPrecioUnitario(){
    return precioUnitario;
}
public int getCantidad(){
    return cantidad;
}
}
