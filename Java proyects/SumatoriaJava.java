import javax.swing.JOptionPane;
public class SumatoriaJava {
    public static void main(String[] args) {
        int n=0;
        int x=0;
        int sum=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Diga su número"));
        while (n<4) {
            n=Integer.parseInt(JOptionPane.showInputDialog("Diga su número, mayor a 4"));
        }
        for(x=4;x<n+1;x++) {
            sum = sum + (x * x) + (7 * x) + 3;
        }
        JOptionPane.showMessageDialog(null,"El resultado de la sumatoria es: "+sum);
    }
}
//Creado por Jaime Olarte