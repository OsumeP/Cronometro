
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Minutos extends Thread{
    
        static int flag;
        int min;
        public Minutos (int flag){
            this.flag = flag;          
        }
       
        @Override
        public void run(){
            this.min = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flag);            
                if (flag == 1){                 
                    this.min += 1;
                    Timer.setmin(this.min);
                    System.out.println("Incremento min....");
                    flag = 0;
                }  
                if (this.min == 59){
                    Horas.flag = 1;
                    this.min = 0;
                }
            }           
        }
        
        public void Reinicio(){
            this.min = 0;
            Timer.setmin(this.min);
        }
}
