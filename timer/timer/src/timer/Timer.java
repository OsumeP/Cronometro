
package timer;


public class Timer {

    
    static reloj _reloj = new reloj();
    static segundos hilo;
    static Minutos hilo2;
    static Horas hilo3;
    
    public static void main(String[] args) {
        
        _reloj.setVisible(true);
        
        hilo = new segundos();
        hilo2 = new Minutos(0);
        hilo3 = new Horas(0);
        
        hilo.start();     
        hilo2.start();
        hilo3.start();
        
    }
    
    public static void setsec(int _num) {

        _reloj.setSec(_num);
    }

    public static void setmin(int _min) {

        _reloj.setMin(_min);
    }
    
    public static void sethr(int _hr){
        _reloj.setHrs(_hr);
    }
    
    public static void detener(){
        hilo.confirmation = false;
    }
    
    public static void reanudar(){
        hilo.confirmation = true;
    }
    
    public static void reiniciar(){
        hilo.Reinicio();
        hilo2.Reinicio();
        hilo3.Reinicio();
    }
}
