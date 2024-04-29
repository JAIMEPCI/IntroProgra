import javax.swing.JOptionPane;
public class Tarjeta_Credito {
    public String nombre;
    public int numero;
    public double cupo;
    public double deuda;

    public Tarjeta_Credito(String nombre, int num, double cupo){
        this.nombre=nombre;
        this.numero=num;
        this.cupo=cupo;
        this.deuda=0;
    }
    public String getNombre() {
        return nombre;
    }

    public double getCupo() {
        return cupo;
    }

    public double getDeuda() {
        return deuda;
    }

    public int getNumero() {
        return numero;
    }
    public void comprar(double m){
        if(this.deuda+m>this.cupo || m<0){
            System.out.println("no se puede ejecutar esta acción");
        }
        else {
            this.deuda = this.deuda + m;
        }
    }
    public void abonar(double m){
        if(this.deuda+m<0 || m<0){
            System.out.println("no se puede ejecutar esta acción");
        }
        else {
            this.deuda = this.deuda - m;
        }
    }
    public static void main( String[] args ) {
        Tarjeta_Credito c = new Tarjeta_Credito("Pepe",1234,5000000);
        c.comprar( 4000000);
        System.out.println("El cupo es de: " + c.getCupo ()+ " El saldo es de: " + c.getDeuda () );
        c.abonar ( 2000000);
        c.comprar( 4000000);
        System.out.println("El cupo es de: " + c.getCupo ()+ " El saldo es de: " + c.getDeuda () );
    }
}
//Creado por Jaime Olarte