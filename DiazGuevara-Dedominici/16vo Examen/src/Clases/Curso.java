
package Clases;

import java.util.*;


public class Curso {
    private String nombre;
    private int maximoAlumnos;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Float> notas;

    public Curso(String nombre, int maximoAlumnos, ArrayList<Alumno> alumnos, ArrayList<Float> notas) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
        alumnos=new ArrayList<>();
        notas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
 public void agregarAlumno(nuevoAlumno Alumno){
     
 }
  
    
}

