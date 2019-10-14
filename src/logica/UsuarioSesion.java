
package logica;

class UsuarioSesion {
    private String nombre;
    private String contrasenia;
    private Boolean conectado;
    private int tiempoConectado;
    private Boolean admin;

    public UsuarioSesion(){
        
    }
    
    public UsuarioSesion(String nombre, String contrasenia, Boolean conectado, int tiempoConectado, Boolean admin) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.conectado = conectado;
        this.tiempoConectado = tiempoConectado;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    
    public Boolean estaConectado() {
        return this.getConectado();
    }
    
    public Boolean esAdministrador(){
        return this.getAdmin();
    }
    
    public int contarTiempo(){
        return this.getTiempoConectado();
    }
    
}
