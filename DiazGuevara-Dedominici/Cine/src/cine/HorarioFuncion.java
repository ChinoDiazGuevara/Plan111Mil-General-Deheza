
package cine;

import java.util.Calendar;
import java.util.Date;

public class HorarioFuncion {

private int diaDeSemana;
private int duracionIntervalo;
private int duracionPublicidad;
private boolean esTrasnoche;
private Date horaPrimeraFuncion;
private Date horaultimaFuncion;

public HorarioFuncion(){    
}

public HorarioFuncion(int diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion){
this.diaDeSemana=diaDeSemana;
this.duracionIntervalo=duracionIntervalo;
this.duracionPublicidad=duracionPublicidad;
this.esTrasnoche=esTrasnoche;
this.horaPrimeraFuncion=horaPrimeraFuncion;
this.horaultimaFuncion=horaUltimaFuncion;
}

private String obtenerDescripcionDia(){
    String dia;
    switch(this.diaDeSemana){
        case Calendar.MONDAY:
            dia="Lunes";
            break;
        case Calendar.TUESDAY:
            dia="Martes";
            break;
        case Calendar.WEDNESDAY:
            dia="Miercoles";
            break;
        case Calendar.THURSDAY:
            dia="Jueves";
            break;
        case Calendar.FRIDAY:
            dia="Viernes";
            break;
        case Calendar.SATURDAY:
            dia="Sabado";
            break;
        case Calendar.SUNDAY:
            dia="Domingo";
            break;
        default:
            dia="No es un dia";
           
    }
return dia;
}
public int getDiaDeSemana(){
    return diaDeSemana;
}

public void setDiaDeSemana(int diaDeSemana){
    this.diaDeSemana=diaDeSemana;
}

public int getDuracionIntervalo(){
    return duracionIntervalo;
}

public void setDuracionIntervalo(int duracionIntervalo){
    this.duracionIntervalo=duracionIntervalo;
}

public int getDuracionPublicidad(){
    return duracionPublicidad;
}

public void setDuracionPublicidad(int duracionPublicidad){
    this.duracionPublicidad=duracionPublicidad;
}

public void setEsTrasnoche(boolean esTrasnoche){
    this.esTrasnoche=esTrasnoche;
}

public boolean getEsTrasnoche(boolean esTrasnoche){
    return esTrasnoche;
}
public Date getHoraPrimeraFuncion(){
    return horaPrimeraFuncion;
}

public void setHoraPrimeraFuncion(Date horaPrimeraFuncion){
    this.horaPrimeraFuncion=horaPrimeraFuncion;
}

public Date getHoraUltimaFuncion(){
    return horaultimaFuncion;
}

public void setHoraUltimaFuncion(Date horaUltimaFuncion){
    this.horaultimaFuncion=horaUltimaFuncion;
}
 /**
  * Devolvemos una cadena de texto indicando los horarios de las funciones
  * @return String
  */
@Override
public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append("Los horarios para el dia: ").append(obtenerDescripcionDia()).append("son: ");
    sb.append("Duración del Intervalo: ").append(duracionIntervalo).append("\n");
    sb.append("Duracion de la Publicidad: ");
    
    
    
    
return null;
}

}
