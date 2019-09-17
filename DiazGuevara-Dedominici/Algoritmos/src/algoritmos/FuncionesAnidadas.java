
package algoritmos;

import javax.swing.JOptionPane;

public class FuncionesAnidadas {
  
 
    public void saludar(String nombre){
        JOptionPane.showMessageDialog(null,"Hola BIENVENIDO "+nombre);
    }
public void error(String nombre){
   JOptionPane.showMessageDialog(null,"ERROR en la validación, "+nombre+" ¿Es tu usuario?");
}

public void verificar(String usuario,String contraseña){
  String Usuario="admin";
  String Contraseña="1234";
    if(Usuario.equals(usuario)&&Contraseña.equals(contraseña)){
        saludar(usuario);
    } 
    else{
        error(usuario);
    }
    
}
    public static void main(String[] args) {
    String usuario,contraseña;
    
    usuario=JOptionPane.showInputDialog("Ingrese su usuario");
    contraseña=JOptionPane.showInputDialog("Ingrese su contraseña");
        
    FuncionesAnidadas llamar=new FuncionesAnidadas();
        llamar.verificar(usuario, contraseña);
    }
}

