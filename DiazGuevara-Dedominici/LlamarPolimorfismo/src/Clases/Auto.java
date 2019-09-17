
package Clases;

import Interface.IOnOff;
import javax.swing.JOptionPane;



public class Auto implements IOnOff{
private String modelo;

    public Auto(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void encender() {    
        JOptionPane.showMessageDialog(null,"El auto "+modelo+" esta encendido");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null,"El auto "+modelo+" esta apagado");
    }
    
}
