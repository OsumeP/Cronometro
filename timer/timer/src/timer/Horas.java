/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

/**
 *
 * @author Estudiante
 */
public class Horas extends Thread{
    static int flag;
    int hr;
        
    public Horas (int flag){
            this.flag = flag;          
        }
       
    @Override
        public void run(){
            this.hr = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flag);            
                if (flag == 1){                 
                    this.hr += 1;
                    Timer.sethr(this.hr);
                    System.out.println("Incremento min....");
                    flag = 0;
                }
            }           
        }
        
        public void Reinicio(){
            this.hr = 0;
            Timer.sethr(this.hr);
        }
}
