
package cine;


public class Sexo {
    
    private String nombre;
    
    public Sexo(){
        
    }
    
    public Sexo(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
}
