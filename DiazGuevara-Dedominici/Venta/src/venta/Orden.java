package venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
    ArrayList<String> item = new ArrayList<String>();
    private int id;
    private Date creacion;
    private Date envio;
    
    public Orden(int id, Date creacion, Date envio){
        this.id= id;
        this.creacion= creacion;
        this.envio= envio;
}

public int getId(){
    return id;
}
public Date getCreacion(){
    return creacion;
}
public Date getEnvio(){
    return envio;
}
    
}
