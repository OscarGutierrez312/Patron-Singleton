package patronsingleton;

public class PatronSingleton {

    
    public static void main(String[] args) throws InterruptedException {
        Thread hilo1=new Thread(new Runnable(){
            @Override
            public void run() {
              ClaseHija hija=ClaseHija.getInstancia();
              hija.setMensaje("Mostrando clase hija");
              System.out.println(hija.getMensaje());
            }
        });
        
        
        Thread hilo2=new Thread(new Runnable(){
            @Override
            public void run() {
              ClaseHija hija1=ClaseHija.getInstancia();
              hija1.setMensaje("Mostrando clase hija1");
              System.out.println(hija1.getMensaje());
            }
        });
        hilo1.start();
        hilo1.sleep(50);
        hilo2.start();
        
    }

    
    
}
