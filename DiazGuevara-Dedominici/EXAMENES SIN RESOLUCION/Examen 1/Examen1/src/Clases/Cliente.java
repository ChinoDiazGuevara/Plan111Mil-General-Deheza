
package Clases;

import java.util.*;

public class Cliente {
 
    private String Nombre;
    private int dni;
    private List <Orden> ordenes;

    public Cliente(String Nombre, int dni) {
        this.Nombre = Nombre;
        this.dni = dni;
        ordenes=new ArrayList<>();
        
        
    }

    public String getNombre() {
        return Nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void addOrden(Orden detalle){
        ordenes.add(detalle);
    }
}
