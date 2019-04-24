/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronsingleton;

/**
 *
 * @author oscar
 */
public class ClasePadre {
    
    private static ClasePadre miInstancia=null;
    
    protected String mensaje;
    
    protected ClasePadre(){
        
    }
               
    
    
    public static ClasePadre getInstancia(){
        if(miInstancia==null){
            synchronized(ClasePadre.class){
                if(miInstancia==null){
                    miInstancia=new ClasePadre();
                }
                return miInstancia;    
            }
        }
        return miInstancia;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getMensaje() {
        return mensaje;
    }
        
    
    
}
