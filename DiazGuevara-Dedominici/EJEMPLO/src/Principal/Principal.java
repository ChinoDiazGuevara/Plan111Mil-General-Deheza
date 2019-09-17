
package Principal;
import Clases.Gato;
import Clases.Orden;
import Clases.Pez;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Orden orden=new Orden();
        float a=Float.parseFloat(JOptionPane.showInputDialog("¿Cuantas notebook abble desea?"));
        float b=Float.parseFloat(JOptionPane.showInputDialog("¿Cuantas notebook mamung desea?"));
        orden.calcularTotalOrden(a,b);
    }
    
    
    
    
    
    
    
   // public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null,"AHORA UTILIZAREMO POLIMORFISMO CON INTERFACE!!");
      //  Gato gato=new Gato("Pelota");
       //     gato.comer();
       //     gato.jugar(); 
        
      //  Pez pez=new Pez("Pepino de mar");
       //     pez.comer();
       //     pez.jugar();

  //  }
    
}
