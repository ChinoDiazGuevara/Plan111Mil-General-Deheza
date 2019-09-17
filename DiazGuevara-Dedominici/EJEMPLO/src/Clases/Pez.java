
package Clases;

import Interface.Animal;
import javax.swing.JOptionPane;


public class Pez implements Animal{
    private String objeto;

	public Pez (String objeto){
	this.objeto=objeto;
	}
@Override
	public void comer (){
		JOptionPane.showMessageDialog(null, "El pez come "+objeto );
	}
@Override
	public void jugar (){
		JOptionPane.showMessageDialog(null, "El pez juega con "+objeto );
	}

}
