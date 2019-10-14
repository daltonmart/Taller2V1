
package logica;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String ip;
    private Boolean servidor;
    private String informacion;
    private EstructuraArchivos compuestoPorArchivos;
    private ArrayList<Proceso> compuestoPorProcesos;
    private ArrayList<UsuarioSesion> compuestoPorUsuarios;
    //private ArrayList<BaseDeDatos> compuestoPorBDD;

    public Equipo() {
        
    }
    
    public Equipo(String nombre, String ip, Boolean servidor, String informacion) {
        this.nombre = nombre;
        this.ip = ip;
        this.servidor = servidor;
        this.informacion = informacion;
        this.compuestoPorArchivos = new EstructuraArchivos();
        this.compuestoPorProcesos = new ArrayList<> ();
        this.compuestoPorUsuarios = new ArrayList<> ();
        //this.compuestoPorBDD = new ArrayList<> ();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getServidor() {
        return servidor;
    }

    public void setServidor(Boolean servidor) {
        this.servidor = servidor;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    
    public Boolean esServidor(){
        return this.getServidor();
    }
    
   
}
