public class Reloj {
    public int hora;
    public int minuto;
    public int segundo;

    public Reloj() {
        this.segundo=0;
        this.minuto=0;
        this.hora=0;
    }
    public Reloj(int h,int m,int s){
        this.segundo=s;
        this.minuto=m;
        this.hora=h;
    }
    public void tic (){
        this.segundo++;
        if(this.segundo==60){
            this.segundo=0;
            this.minuto++;
        }
        if(this.minuto==60){
            this.minuto=0;
            this.hora++;
        }
        if(this.hora==24){
            this.hora=0;
        }
    }

    public void visualizar(){
        System.out.println(hora+ " : " + minuto + " : " + segundo);
    }
    public void ponerALas(int h,int m,int s){
        this.segundo=s;
        this.minuto=m;
        this.hora=h;
    }
    public static void main(String[] args) {
        Reloj ding = new Reloj(23,59,59);
        ding.visualizar();
        ding.tic();
        ding.visualizar();
        ding.tic();
        ding.visualizar();
    }
}