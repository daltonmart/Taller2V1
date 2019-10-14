
package logica;


class Proceso {
    private int numero;
    private Boolean activo;

    public Proceso() {
        
    }
    
    public Proceso(int numero, Boolean activo) {
        this.numero = numero;
        this.activo = activo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    public Boolean estaActivo(){
        return this.getActivo();
    }
    
}
