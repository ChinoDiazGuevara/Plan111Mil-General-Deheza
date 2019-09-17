/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg08.pkg19;

public class Raro {
    public static void main(String[] args){
        Raro raro= new Raro();
        raro.primero();
        raro.tercero();
        raro.segundo();
        raro.tercero();
    }
    public void primero(){
        System.out.println("Dentro del metodo primero");
    }
    public void segundo(){
        System.out.println("Dentro del metodo segundo");
        primero();
    }
    public void tercero(){
        System.out.println("Dentro del metod tercero");
        primero();
        segundo();
    }
}
