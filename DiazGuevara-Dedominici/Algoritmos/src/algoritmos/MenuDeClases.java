
package algoritmos;

import javax.swing.JOptionPane;


public class MenuDeClases {
    public static void main(String[] args) {
        int j = Integer.parseInt(JOptionPane.showInputDialog(null,
                "BIENVENIDO, Seleccione el numero del ejercicio que desea ejecutar \n"+
                        "Ejercicio 1:  \n" +
                        "Ejercicio 2:  \n"+
                        "Ejercicio 3:  \n"+
                        "Ejercicio 4:  \n"+
                        "Ejercicio 5:  \n"+
                        "Ejercicio 6:  \n"+
                        "Ejercicio 7:  \n"));
        switch(j){
        
        case 1:
        Ejercicio1.Ejercicio1();
        break;
        
        case 2:
        Ejercicio2.Ejercicio2();
        break;
        
        case 3:
        Ejercicio3.Ejercicio3();
        break;
        
        case 4:
        Ejercicio4.Ejercicio4();
        break;
        
        case 5:
        Ejercicio5.Ejercicio5();
        break;
        
                
                
                
                
                
        default:break;
    }
    }
    
}
