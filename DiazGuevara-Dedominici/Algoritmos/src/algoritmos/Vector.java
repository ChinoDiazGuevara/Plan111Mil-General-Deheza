
package algoritmos;

import java.util.*;

public class Vector {
    public static void main(String[] args) {
       Scanner Teclado=new Scanner(System.in);
        int[] notas= new int[5];
        
        int i;
        for(i=0;i<notas.length;i++){
            
            System.out.println("Ingrese una nota= ");
            notas[i]=Teclado.nextInt();
            
        }
        
     
     System.out.println("El array tiene "+notas.length+" elementos");
     System.out.println("Los elementos son: ");
     
     for(i=0;i<notas.length;i++){
         System.out.print(notas[i]+" ");
         
         System.out.println();
     }
    }
}
