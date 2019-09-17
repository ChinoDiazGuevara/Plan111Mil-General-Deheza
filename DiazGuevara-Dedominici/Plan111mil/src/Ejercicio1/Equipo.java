
package Ejercicio1;

import java.util.List;


public class Equipo {

private String nombre;
private List<String> jugadores;
private int max_jugadores;

public Equipo(){

}
public Equipo(String nombre, List<String> jugadores, int max_jugadores){
    
    
    this.nombre=nombre;
    this.jugadores=jugadores;
    this.max_jugadores=max_jugadores;
            
}

public String getnombre(){
    return nombre;  

}

public void setnombre(String nombre){
    this.nombre=nombre;
}

public List<String> getjugadores(){
    return jugadores;
}

public void addjugador(String jugador){
    this.jugadores.add(jugador);
}

public int getmax_jugadores(){
    return max_jugadores;
}

public void setmax_jugadores(int max_jugadores){
    this.max_jugadores=max_jugadores;
    
}

@Override
public String toString(){
    return nombre;
}

}