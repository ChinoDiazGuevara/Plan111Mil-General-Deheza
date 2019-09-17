package cine;

public class Calificacion {
    private Integer id;
    private String nombre;
   
 public Calificacion(){
 }
 
 public Calificacion(String nombre){
     this.nombre=nombre;
 }
 
 public String getNombre(){
     return nombre;
 }
 
 public void setNombre(String nombre){
     this.nombre=nombre;
 }
 
 public Integer getid(){
     return id;
 }
 
 public void setid(Integer id){
     this.id=id;
 }
 
 @Override
 public String toString(){
     return this.nombre;
 }
  
}
