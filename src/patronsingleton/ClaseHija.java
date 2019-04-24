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
public class ClaseHija extends ClasePadre{
    
    private static ClaseHija miInstancia;
    
    private ClaseHija(){
        
    }
        
    public static ClaseHija getInstancia(){
        synchronized(ClasePadre.class){
            if(miInstancia==null){
                miInstancia=new ClaseHija();
            }
            return miInstancia;
        }
    }
   
}
