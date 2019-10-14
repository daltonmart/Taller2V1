
package logica;


public class Cat extends Comando{
    private EstructuraArchivos usaEstructuraArchivos;
    
    public Cat() {
    }

    public Cat(EstructuraArchivos usaEstructuraArchivos) {
        this.usaEstructuraArchivos = usaEstructuraArchivos;
    }

    public Cat(EstructuraArchivos usaEstructuraArchivos, String parametros, String url) {
        super(parametros, url);
        this.usaEstructuraArchivos = usaEstructuraArchivos;
    }

    

    
    @Override
    public String ejecutarComando(){
        Archivo a=usaEstructuraArchivos.buscarArchivo(getUrl());
        if (a != null)
            return a.getContenido();
        else
            return "No existe el archivo";
    }
/*
    @Override
    public String verificarSintaxis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
