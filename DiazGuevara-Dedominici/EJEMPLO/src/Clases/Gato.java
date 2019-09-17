
package Clases;

import Interface.Animal;
import javax.swing.JOptionPane;


public class Gato implements Animal{
    
private String objeto;
	public Gato (String objeto){
	this.objeto=objeto;
	}
@Override
	public void comer (){
		  JOptionPane.showMessageDialog(null,"El gato come "+objeto);
	}

@Override
	public void jugar (){
		JOptionPane.showMessageDialog(null,"El gato juega con " + objeto );
	}


}
