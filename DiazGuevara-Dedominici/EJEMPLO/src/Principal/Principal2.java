
package Principal;

import Clases.Cuenta;
import javax.swing.JOptionPane;


public class Principal2 {
    public static void main(String[] args) {
    Cuenta cuenta1=new Cuenta("Manuel");
    Cuenta cuenta2=new Cuenta("Jose",500);
        Double ingresar = null;
        Double retirar = null;
    cuenta1.ingresar(ingresar);
    cuenta1.retirar(retirar);
    cuenta1.toString();
    }
    
    
}
