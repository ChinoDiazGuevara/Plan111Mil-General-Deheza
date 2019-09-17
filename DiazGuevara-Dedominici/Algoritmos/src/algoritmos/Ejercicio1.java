
package algoritmos;


import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void Ejercicio1() {
        int x,y,r;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los metros de frente del terreno: "));
        
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los metros de largo del terreno: "));
       
        r=x*y;
        JOptionPane.showMessageDialog(null,"La cantidad de alambre necesario es de= "+r);
        int j = 0;
        //j = JOptionPane.showConfirmDialog(null,"¿Desea repetir el programa? o ¿Desea volver al menu?","Seleccione una opcion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Repetir", "Ir Menu","Cancelar"}, "Repetir");
        if(j==1){
         String[] args = null;
            MenuDeClases.main(args);
        }
        
        
    }
}
