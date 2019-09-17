
package Clases;

import Interface.IOnOff;
import javax.swing.JOptionPane;


public class Computadora implements IOnOff{
private String modelo;
    @Override
    public void encender() {
        JOptionPane.showMessageDialog(null,"La computadora "+modelo+" esta encendida");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null,"La computadora "+modelo+" esta apagada");
    }

    public Computadora(String modelo) {
        this.modelo = modelo;
    }
    
}
