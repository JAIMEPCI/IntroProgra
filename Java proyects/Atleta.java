import java.util.Random;
public class Atleta {
   private String nombre;
   private int tiempo;

   Atleta(String nombre){
       Random random = new Random(20);
       this.nombre=nombre;
       this.tiempo = random.nextInt(20)+40;
   }

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
//Creado por Jaime Olarte