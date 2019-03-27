
package Time;


public class Time {
    private int horas;
    private int minutos;
    private int segundos;

    public Time() {
    }
    
    
    public Time(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas >=0 && horas <=23){
            this.horas = horas;
        }
        
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >=0 && minutos <=59){
            this.minutos = minutos;
        }
        
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >=0 && segundos <=59){
            this.segundos = segundos;
        }
        
    }
    
    public String visualizarHoraUniversal(){
        return String.format("%02d:%02d:%02d horas", horas, minutos, segundos);
    }
    
    public String visualizarHoraAmPm(){
        
        if (horas >12){
            horas = horas % 12;
            return String.format("%02d:%02d:%02d horas PM", horas, minutos, segundos);
        }
        else if(horas == 12){
            return String.format("%02d:%02d:%02d horas PM", horas, minutos, segundos);
        }
        else{
            return String.format("%02d:%02d:%02d horas AM", horas, minutos, segundos);
        }
        
        
    }
    
    
    }

