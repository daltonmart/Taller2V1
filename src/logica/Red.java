
package logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Red {
    private ArrayList<Equipo> listaEquipos;
    private Equipo equipoActal;

    public Red(){
        this.listaEquipos= new ArrayList<> ();
    }
    
    public Red(Equipo equipoActal) {
        this.equipoActal = equipoActal;
        this.listaEquipos= new ArrayList<> ();
    }

    public Equipo getEquipoActal() {
        return equipoActal;
    }

    public void setEquipoActal(Equipo equipoActal) {
        this.equipoActal = equipoActal;
    }

     public void insertarEquipo(Equipo e){
        listaEquipos.add(e);
    }
     
    public Equipo buscarEquipo(String ip){
       
        Boolean encontro = false;
        int i=0;
        while ( (i<listaEquipos.size()) && (!encontro)){
            encontro = (ip.equals(listaEquipos.get(i).getIp()));
            i++;
        }
        return listaEquipos.get(i-1);
    }    
    
    
    public void verPersistenciaRed(){
        
        //Lectura de los datos del archivo
        File archivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        
        
        try{
            //apertura del archivo
            archivo = new File ("Red");
            fr = new FileReader(archivo);
            br= new BufferedReader(fr);
            String filaLeidaArchivo;
            String [] cadenaSeparada;
            
            while ((filaLeidaArchivo = br.readLine())!= null){
                cadenaSeparada = filaLeidaArchivo.split(" ; ");
                Equipo e= new Equipo(cadenaSeparada[0], cadenaSeparada[1] , Boolean.valueOf(cadenaSeparada[2]), cadenaSeparada[3]);
                EstructuraArchivos eArch = new EstructuraArchivos();
                eArch.verPersistenciaEstructuraArchivos(String.valueOf(e.getIp())+"EArchivos");
                System.out.println(eArch);
                insertarEquipo(e);
            }
            
            br.close();
            fr.close();
            
        }
        catch (Exception ex){
            JOptionPane.showConfirmDialog(null,"El Archico Red no existe", "Información",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Red{" + "listaEquipos=" + listaEquipos + ", equipoActal=" + equipoActal + '}';
    }
    
    
}
