
package algoritmos;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void Ejercicio2() {
        int x = 0,y=0,r=0;
       
        x=Integer.parseInt((JOptionPane.showInputDialog("Ingrese un numero")));
        y=Integer.parseInt((JOptionPane.showInputDialog("Ingrese un numero")));
                     
        r=x+y;
       
        JOptionPane.showMessageDialog(null,"El resultado de la Suma de ambos numeros es igual a= "+r);
        r=x-y;
        JOptionPane.showMessageDialog(null,"El resultado de la Resta de ambos numeros es igual a= "+r);
        r=x/y;
        JOptionPane.showMessageDialog(null,"El resultado de la División de ambos numeros es igual a= "+r);
        r=x*y;
        JOptionPane.showMessageDialog(null,"El resultado de la Multiplicación de ambos numeros es igual a= "+r);
    }   
}
