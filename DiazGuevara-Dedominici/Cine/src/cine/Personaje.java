
package cine;


public class Personaje {
    
    private String nombreenpelicula;
    private Actor actor;
    private Rol rol;
    
    public Personaje(){
        
    }
    
    public Personaje(String nombreenpelicula, Actor actor, Rol rol){
        this.nombreenpelicula=nombreenpelicula;
        this.actor=actor;
        this.rol=rol;
    }
    
    public String getNombreenpelicula(){
        return nombreenpelicula;
    }
    
    public void setNombreenpelicula(String nombreenpelicula){
         this.nombreenpelicula=nombreenpelicula;
    }
    
    public Actor getActor(){
        return actor;
    }
    
    public void setActor(Actor actor){
        this.actor=actor;
    }
    
    public Rol getRol(){
        return rol;
    }
    
    public void setRol(Rol rol){
        this.rol=rol;
    }
    
    @Override
    public String toString(){
        return nombreenpelicula+" interpretado por "+actor;
    }
}
