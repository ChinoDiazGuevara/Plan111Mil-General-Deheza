
package cine;


public class Genero {
 
    private Integer id;
    private String nombre;
    
    public Genero(){
   
    }
public Genero(String nombre){

    this.nombre=nombre;
}

public String getNombre(){
    
    return nombre;
}

public void setNombre(String nombre){
    
    this.nombre=nombre;
}

public Integer getId (){
    return id;
}
    public void setId (Integer id){
        this.id=id;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
