import javax.swing.JOptionPane;
public class DatosPositivos {
    public static void main(String[] args) {
        int n,rep,cont;
        float num;
        cont=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantos números quiere analizar"));
        while(n<=0){
            n=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantos números quiere analizar (que sea un número entero positivo mayor que 0)"));
        }
        for(rep=0;rep<n+1;rep++){
            num=Float.parseFloat(JOptionPane.showInputDialog("Diga su número #"+rep+1));
            if(num>0){
                cont=cont+1;
            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad de datos positivos fue de: "+cont);
    }
}
