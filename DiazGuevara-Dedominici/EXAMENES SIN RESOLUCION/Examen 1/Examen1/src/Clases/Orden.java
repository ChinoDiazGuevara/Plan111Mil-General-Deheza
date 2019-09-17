
package Clases;

import java.util.*;


public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date Creacion;
    private Date envio;

    public Orden(int id, Date Creacion, Date envio) {
        this.id = id;
        this.Creacion = Creacion;
        this.envio = envio;
        items=new ArrayList<>();
    }

    public int getNroItems(){
        return items.size();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
  public void agregarItem(DetalleOrden detalle){
      items.add(detalle);
  }
  public float calcularTotalOrden(){
      float totalOrden = 0;
     float cantidad=this.getNroItems();
     for(int i=0;i<cantidad;i++){
         totalOrden=totalOrden+(items.get(i).cantidad)+(items.get(i).getPrecioUnitario());
     }
      return totalOrden;
  }
  
}
