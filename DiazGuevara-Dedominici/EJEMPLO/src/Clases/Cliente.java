
package Clases;

import java.util.*;


public class Cliente {
    private String nombre;
    private int dni;
    private List <Orden> ordenes;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        ordenes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
 public void addorden(Orden o){
     ordenes.add(o);
 }
}
