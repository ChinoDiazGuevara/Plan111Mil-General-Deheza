
package Clases;

import javax.swing.JOptionPane;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

  
    

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "La cuenta "+titular+" posee un fondo de "+cantidad+" dolares";
    }
    public double ingresar(Double ingreso){
        do{
        ingreso=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuanto dinero desea guardar?"));  
    }while(ingreso<0);
       return ingreso;
    }
    public double retirar(Double retirar){
        retirar=Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cuanto dinero desea retirar?"));
        return retirar;
    }






}