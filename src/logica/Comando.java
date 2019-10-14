
package logica;


public abstract class Comando {
    private String parametros;
    private String url;
    private TerminalLogica salida;
    
    public Comando() {
    }

    public Comando(String parametros, String url) {
        this.parametros = parametros;
        this.url = url;
        this.salida = new TerminalLogica();
    }

    

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String nomComando) {
        this.parametros = nomComando;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    public abstract String ejecutarComando();
    
    //public abstract String verificarSintaxis();
}
