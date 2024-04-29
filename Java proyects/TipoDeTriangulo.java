import javax.swing.JOptionPane;
public class TipoDeTriangulo {
    public static void main(String[] args){
        float lado1,lado2,lado3;
        JOptionPane.showMessageDialog(null,"Clasificar triángulos según sus lados");
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Diga el primer lado de su triángulo"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Diga el segundo lado de su triángulo"));
        lado3=Float.parseFloat(JOptionPane.showInputDialog("Diga el tercer lado de su triángulo"));
        if(lado1==lado2 && lado2==lado3){
            JOptionPane.showMessageDialog(null,"El triángulo es un traingulo equilátero");
        }
        if((lado1==lado2 && lado2!=lado3)||(lado2==lado3 && lado1!=lado3)||(lado1==lado3 && lado2!=lado3)){
            JOptionPane.showMessageDialog(null,"El triángulo es un traingulo isósceles");
        }
        if(lado1!=lado2 && lado2!=lado3 && lado3!=lado1){
            JOptionPane.showMessageDialog(null,"El triángulo es un traingulo escaleno");
        }
    }
}
