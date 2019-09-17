
package algoritmos;
import java.util.*;
        
public class IndiceDeMasaCorporal {
    public static void main(String[] args) {
        double peso,altura,imc;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la altura");
        altura=teclado.nextFloat();
        System.out.println("Ingrese su peso");
        peso=teclado.nextFloat();
        imc=peso/Math.pow(altura, 2);
        System.out.printf("su indice de masa corporal es: %.2f",imc);
        if(imc<=18.5)
        {
            System.out.println(" Tienes un imc bajo flaco/a");   
        } else if(imc<=24.90){
            System.out.println(" Tienes un imc normal");
        } else {
            System.out.println(" Tines un imc alto gordo/a");
        }
    }
}
