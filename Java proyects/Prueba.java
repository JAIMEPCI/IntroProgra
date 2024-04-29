public class Prueba {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("pepe");
        Atleta a2 = new Atleta("jaiver");
        Atleta a3 = new Atleta("carlos");
        System.out.println("El tiempo del equipo es de : " + (a1.getTiempo()+ a2.getTiempo()+ a3.getTiempo()));

        if(a1.getTiempo()> a2.getTiempo()) {
            if (a1.getTiempo() > a3.getTiempo()) System.out.println("El atleta mas veloz fue " + a1.getNombre());
            else {
                System.out.println("El atleta mas veloz fue " + a3.getNombre());
            }
        }
        if(a2.getTiempo() > a3.getTiempo()){
            System.out.println("El atleta mas veloz fue " + a2.getNombre());
        }
        else System.out.println("El atleta mas veloz fue " + a3.getNombre());
        System.out.println(a1.getTiempo()+" "+ a2.getTiempo()+" "+ a3.getTiempo());
    }
}
