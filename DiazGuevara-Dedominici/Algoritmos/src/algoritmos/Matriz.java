
package algoritmos;

import java.util.*;

public class Matriz {

    public static void main(String[] args) {
       int[][]suma=new int[5][5];
       
       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
              suma[i][j]=i+j;
              System.out.print(suma[i][j]+" ");
           }
           System.out.println();
       }
    }
}
