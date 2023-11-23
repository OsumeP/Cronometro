
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class segundos extends Thread{
    
    Boolean confirmation = true;
    int sgs;
        @Override
        public void run(){
            for (int i = 0; i < 60; i++) {  
                while (this.confirmation == false){
                    System.out.println("Detenido");
                }
                this.sgs = i;
                Timer.setsec(this.sgs);
                try {
                    segundos.sleep(10);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (i==59){
                    
                    i = 0;
                    Minutos.flag = 1;
                }           
            }          
        }  
        
        public void Reinicio(){
            this.sgs = 0;
            Timer.setsec(this.sgs);
        }
}
