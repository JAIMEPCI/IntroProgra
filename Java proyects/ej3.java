import javax.swing.JOptionPane;
import java.util.Random;
public class ej3 {
    public static void main(String[] args) {
        float num,res;
        int rep,cont,rep2;
        String acum;
        cont=0;
        acum = "Tabla\n";
        num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el numero de la tabla"));
        for (rep = 1; rep < 11; rep++) {
            acum = acum + num + " x " + rep + " es " + num * rep + "\n";
        }
        JOptionPane.showMessageDialog(null, acum);
        Random random = new Random();
        for (rep2 = 0; rep2 < 5; rep2++) {
            int numero = random.nextInt(10);
            res=Float.parseFloat(JOptionPane.showInputDialog(null, "Cuanto da " + num + " X " + numero));
            if(res==numero*num){
                JOptionPane.showMessageDialog(null,"Su respuesta es correcta!");
                cont=cont+1;
            }
            else {
                JOptionPane.showMessageDialog(null,"Su respuesta es incorrecta! ;C\n la respuesta correcta es "+numero*num);
            }
        }
        JOptionPane.showMessageDialog(null,"Su puntuacion es "+cont);
    }


}
