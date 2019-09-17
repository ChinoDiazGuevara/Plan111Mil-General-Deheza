/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.IOnOff;
/**
 * 
 * @author capacitacion12 
 */
public class Auto implements IOnOff{

    public Auto modelo;

    @Override
    public void encender() {
        System.out.println("El Auto se enciende");
    }

    @Override
    public void apagar() {
        System.out.println("El Auto se apaga");
    }  
}
