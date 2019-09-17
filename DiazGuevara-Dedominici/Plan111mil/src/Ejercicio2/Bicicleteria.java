
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
private List<Bicicleta> bicicletas;
private float ganancias;
private int cantidadDeVentas;

public Bicicleteria(){
bicicletas=new ArrayList<Bicicleta>();
cantidadDeVentas=0;
ganancias=0;
}
public void addBicicleta(Bicicleta nuevabici){
this.bicicletas.add(nuevabici);    
}

public void venderBicicleta(Bicicleta bicicleta){
    this.bicicletas.remove(bicicleta);
    cantidadDeVentas++;
    ganancias=ganancias+bicicleta.getprecio();
}

public Bicicleta buscarBicicleta(String nroDeSerie){
    for (Bicicleta bici:bicicletas){
        if(bici.getnroDeSerie().equals(nroDeSerie)){
            return bici;
        }
    }
    return null;
}




}