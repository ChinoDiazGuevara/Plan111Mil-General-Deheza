
package algoritmos;

import javax.swing.JOptionPane;


public class Ejercicio3 {
    public static void Ejercicio3() {
        Float x,y,z;
        Double r;
        
        x=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura en metros de la pared a pintar"));
        y=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el largo de la pared a pintar"));
        z=x*y;
        r=((z)*0.5)/3.6;
        
        JOptionPane.showMessageDialog(null,"El area de tu pared es de "+z+"m², se necesitaran "+r+" litros para pintar la pared");
    }
    
}
