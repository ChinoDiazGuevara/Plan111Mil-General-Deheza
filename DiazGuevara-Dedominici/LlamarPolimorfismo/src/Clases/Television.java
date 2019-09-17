package Clases;

import Interface.IOnOff;
import javax.swing.JOptionPane;


public class Television implements IOnOff{
private String modelo;
    @Override
    public void encender() {
        JOptionPane.showMessageDialog(null,"El televisór "+modelo+" esta encendido");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null,"El televisor "+modelo+" esta apagada");
    }

    public Television(String modelo) {
        this.modelo = modelo;
    }
    
}
