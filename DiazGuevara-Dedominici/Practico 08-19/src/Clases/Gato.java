/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.IOnOff;

public class Gato implements IOnOff {
    public Gato accion;
    
    @Override
    public void comer(){
        System.out.println("El Gato come plancton");
    }
    
    @Override
    public void jugar(){
        System.out.println("El Gato juega");
    }
}
