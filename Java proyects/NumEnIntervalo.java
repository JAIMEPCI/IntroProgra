import javax.swing.JOptionPane;
public class NumEnIntervalo {
    public static void main(String[] args){
        float num1,num2,num3;
        JOptionPane.showMessageDialog(null,"Averigue si a es parte del intervalo (b,c]");
        num1=Float.parseFloat(JOptionPane.showInputDialog("Diga su primer numero (a)"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Diga su segundo numero (b)"));
        num3=Float.parseFloat(JOptionPane.showInputDialog("Diga su tercer numero (c) mayor a b"));
        if(num1>num2 && num2 <=num3){
            JOptionPane.showMessageDialog(null,"a está dentro del intervalo (b,c]");
        }
        if(num1<=num2 || num1>num3){
            JOptionPane.showMessageDialog(null,"a NO está dentro del intervalo (b,c]");
        }
    }
}
