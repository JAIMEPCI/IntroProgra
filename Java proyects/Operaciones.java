import javax.swing.JOptionPane;
public class Operaciones {
    public static void main(String[] args){
        int num1,num2,suma,mult,resta,mod;
        JOptionPane.showMessageDialog(null,"Pongame 5 profe pls");
        num1=Integer.parseInt(JOptionPane.showInputDialog("Diga su primer número entero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Diga su segundo número entero"));
        suma=num1+num2;
        mult=num1*num2;
        mod=num1%num2;
        resta=num2-num1;
        JOptionPane.showMessageDialog(null,"Cuando los números "+num1+" y "+num2+" se suman da: "+suma);
        JOptionPane.showMessageDialog(null,"Cuando se multiplica "+num1+" y "+num2+ " da: "+mult);
        JOptionPane.showMessageDialog(null,num1+" modulo "+num2+" es: "+mod);
        JOptionPane.showMessageDialog(null,num2+" menos "+num1+" es: "+resta);

    }
}
