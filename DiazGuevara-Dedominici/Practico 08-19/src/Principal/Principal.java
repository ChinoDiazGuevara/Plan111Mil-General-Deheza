/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Gato;
import Clases.Pez;

/**
 *
 * @author capacitacion12
 */
public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Pez pez = new Pez();
        
        gato.comer();
        gato.jugar();
        
        pez.comer();
        pez.jugar();
        
    }
}
