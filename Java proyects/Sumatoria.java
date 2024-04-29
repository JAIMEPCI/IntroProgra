import javax.swing.JOptionPane;
public class Sumatoria {
    public static void main(String[]args){
        int rep,n,suma;
        float resultado;
        JOptionPane.showMessageDialog(null,"Sumatoria de x^2+8x");
        n=Integer.parseInt(JOptionPane.showInputDialog("Sumatoria de x^2+8x"));
        resultado=0;
        for (rep=2;rep<n+1;rep++){
            suma=(rep*rep)+(8*rep);
            resultado=resultado+suma;
        }
        JOptionPane.showMessageDialog(null,"El resultado de la sumatoria es: "+resultado);
    }
}
