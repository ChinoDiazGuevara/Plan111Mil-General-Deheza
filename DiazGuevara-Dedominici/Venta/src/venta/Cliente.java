package venta;

import java.util.ArrayList;
import java.util.List;
/**
 * aca empieza esto!
 * @author capacitacion12
 */
public class Cliente {
    private String nombre;
    private int dni;
    List<Orden> ordenes = new ArrayList<>();
/**
 * no se que es esto, pero anda!
 * @param nombre
 * @param dni 
 */
public Cliente (String nombre, int dni){
    this.nombre= nombre;
    this.dni= dni;
}

public String getNombre(){
    return nombre;
}
public int getDni(){
    return dni;
}
public void addOrden(){
}
}
