
package logica;

import java.lang.reflect.Method;



public class TerminalLogica {
    private String entrada;
    private String salida;
    private Comando ejecuta;
    
    public TerminalLogica() {
    }

    public TerminalLogica(String entrada, String salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    
    
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    
    @Override
    public String toString() {
        return "Terminal{" + "entrada=" + entrada + ", salida=" + salida + '}';
    }
    
    public void identificarYCrearComando(String comandoNombre){
        if (comandoNombre.equals("cat"))
                ejecuta=new Cat();
         if (comandoNombre.equals("ls"))
                ejecuta=new Ls();
    }
    
    public void generarComandoYSalida() {
        Class comandoClass;
        String comandoNombre;
        String comandoParametros;
        Object comandoObj;
        String[] argumentos;
        try {
            argumentos = entrada.split(" ");
            comandoNombre = argumentos[0];
            
            //this.identificarYCrearComando(comandoNombre);
            
            
         //   ejecuta.setParametros("l");
         //   ejecuta.setUrl("hola");
            
            comandoClass = Class.forName(comandoNombre);
            if (argumentos.length > 1) {    // Si tiene paramatros llamo al constructor con parametro String                
               comandoParametros = entrada.substring(comandoNombre.length() + 1);
               comandoObj = comandoClass.getDeclaredConstructor(String.class).newInstance(comandoParametros);   
            } else {                       // No tiene paramatros llamo al constructor sin parametros
               comandoParametros = "";
               comandoObj = comandoClass.getDeclaredConstructor().newInstance();
            }
            Method mthd = comandoClass.getDeclaredMethod("ejecutar");
            System.out.println(" metodo:"+mthd);
            String salida = (String) mthd.invoke(comandoObj);
            
            //this.setSalida(" >> " +ejecuta.ejecutarComando());//
             this.setSalida(" >> " + salida);
            
        } catch (ClassNotFoundException ex) {
            this.setSalida("Error comando no encontrado ");

        } catch (Exception ex) {
            
            this.setSalida("Error en " + ex);
            System.err.println(">>>>>>>>"+ ex);
        }
        
        
    }
}
