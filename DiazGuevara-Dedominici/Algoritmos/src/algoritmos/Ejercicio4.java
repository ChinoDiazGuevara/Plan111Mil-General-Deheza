
package algoritmos;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void Ejercicio4() {
        int A,B,X;
        A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        
        X=B;
        B=A;
        A=X;
        
        JOptionPane.showMessageDialog(null,"El primer numero "+A+" es el segundo numero");
        JOptionPane.showMessageDialog(null,"El segundo numero "+B+" es el primer numero");
      
    }
    
}
