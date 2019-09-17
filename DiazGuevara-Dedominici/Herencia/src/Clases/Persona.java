/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 * 
 * @author capacitacion12
 */

public class Persona {
    private String nombre;
    private String dirección;
    /**
     * no se que es esto, pero anda!
     * @param nombre
     * @param dirección 
     */

    public Persona(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }

    @Override
    public String toString() {
        return nombre+"("+dirección+")";
    }
    
 
}
