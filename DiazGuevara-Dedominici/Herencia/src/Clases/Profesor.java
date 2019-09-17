
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Profesor extends Persona{
    private List<String> cursos;
    private Double salario;

    public Profesor(String nombre, String dirección) {
        super(nombre, dirección);
        cursos=new ArrayList<>();
    }
public 
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cursos=" + cursos + ", salario=" + salario + '}';
    }

 
    public static void MAIN(String[] args) {
        
    }
}
