import javax.swing.JOptionPane;
public class Positivo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo que imprime solo datos positivos");
        float[] n1 = new float[20];
        float[] p = new float[20];
        int pos = 0, rep;
        for (rep = 0; rep < 20; rep++) {
            n1[rep] = Float.parseFloat(JOptionPane.showInputDialog("Diga el dato #" + (rep + 1)));
            if(n1[rep]>0){
                p[pos]=n1[rep];
                pos=pos+1;
            }
        }
        if(pos>0){
            for(rep=0;rep<pos;rep++){
                JOptionPane.showMessageDialog(null,"Casilla "+ rep+ " Número "+ p[rep] );
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Todos los números eran negativos");
        }
    }
}

