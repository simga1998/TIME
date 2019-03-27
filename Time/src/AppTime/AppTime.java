
package AppTime;

import Time.Time;

public class AppTime {
    
    
    public static void main(String[] args) {
        
        Time obj = new Time(12, 5, 46);
        
        System.out.println(obj.visualizarHoraUniversal());
        System.out.println(obj.visualizarHoraAmPm());
    }
}
