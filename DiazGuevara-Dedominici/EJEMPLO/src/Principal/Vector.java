
package Principal;

import javax.swing.JOptionPane;


public class Vector {    
    public static void main(String[] args) {
        int a1[]=new int[5];
        int a2[]=new int[5];
        for(int i=0;i<5;i++){
         a1[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor del primer vector"));
         a2[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor del segundo vector"));
        }
Vector ejecutar=new Vector();
ejecutar.misterio(a1, a2);
for(int i=0;i<5;i++){
         System.out.println("Vector 1 posición "+(i+1)+" valor= "+a1[i]);
         }
    }
    public void misterio ( int []a , int [] b ) {
	for ( int i = 0 ; i < a.length ; i ++) {
		a [ i ] += b [ b .length - 1 - i ];
	}
}  
}
