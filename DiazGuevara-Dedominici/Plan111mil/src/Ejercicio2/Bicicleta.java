
package Ejercicio2;

public class Bicicleta {
    
 private String nroDeSerie;
 private String modelo;
 private int año;
 private float precio;
 
 public Bicicleta(){
 
}
 
 public Bicicleta(String nroDeSerie, String modelo, int año, float precio){
     
     this.nroDeSerie=nroDeSerie;
     this.modelo=modelo;
     this.año=año;
     this.precio=precio;
             
 }
 
 public String getnroDeSerie(){
     return nroDeSerie;
 }
 
 public void setnroDeSerie(String nroDeSerie){
     this.nroDeSerie=nroDeSerie;
 }
 public String getmodelo(){
     return modelo;
 }
 
 public void setmodelo(String modelo){
     this.modelo=modelo;
 }
 
 public int getaño(){
     return año;
 }
 
 public void setaño(int año){
     this.año=año;
 }
 
 public float getprecio(){
     return precio;
 }
 
 public void setprecio(float precio){
     this.precio=precio;
 }
         
 @Override
 public String toString(){
     return nroDeSerie+" "+modelo+" "+precio;
 }
 
}
