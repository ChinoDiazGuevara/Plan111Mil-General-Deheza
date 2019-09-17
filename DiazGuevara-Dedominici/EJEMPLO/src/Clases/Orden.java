
package Clases;

import java.util.*;


public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;
 

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        items=new ArrayList<>();
    }

    public Orden() {
    }
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    public int getNroItems(){
       return items.size();
    }
      
    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    
    
    
    
    
}
