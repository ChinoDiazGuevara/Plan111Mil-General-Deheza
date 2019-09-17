
package Pincipal;

import Clases.Auto;
import Clases.Computadora;
import Clases.Television;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"AHORA UTILIZAREMO POLIMORFISMO CON INTERFACE!!");
        
     Auto auto=new Auto("Ford");
        auto.apagar();
        auto.encender(); 
      Computadora computadora=new Computadora("HP");
        computadora.apagar();
        computadora.encender();
      Television tele=new Television("Sony");
        tele.apagar();
        tele.encender();
    }
}
