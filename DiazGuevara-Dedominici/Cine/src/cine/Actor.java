 
package cine;


public class Actor {

private boolean animado;
private String apellido;
private String nombre;
private Sexo sexo;

//Constructor por Defecto
public Actor(){
    
}
    
//Este constructor incluyen todos los atributos de la clase Actor

public Actor(boolean animado,String apellido,String nombre,Sexo sexo){
    this.animado=animado;
    this.apellido=apellido;
    this.nombre=nombre;
    this.sexo=sexo;
}

//Gets
public boolean isAnimado(){
    return animado;
}

public void setAnimado(boolean animado){
    this.animado=animado;
}

public String getApellido(){
    return apellido;
}

public void setApellido(String apellido){
    this.apellido=apellido;
}

public String getNombre(){
    return nombre;
}

public void SetNombre(){
    this.nombre=nombre;
}

public Sexo getSexo(){
    return sexo;
}

public void SetSexo(){
    this.sexo=sexo;
}

@Override
public String toString(){
    return nombre+""+apellido;
}
}
