
package algoritmos;

import javax.swing.JOptionPane;


public class Ejercicio5 {
    public static void Ejercicio5() {
        int a,r,v;
     
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el perimetro de un cuadrado"));
        r=(a/4);
        v = (int) Math.pow(r,3);
        JOptionPane.showMessageDialog(null,"El volumen del cubo es igual a "+v);
        
    }
    
}
