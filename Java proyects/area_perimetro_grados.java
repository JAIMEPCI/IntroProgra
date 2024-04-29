import javax.swing.JOptionPane;
public class area_perimetro_grados {
    public static void main(String[] args) {
        float base,altura,area,perimetro,centi,faren;
        JOptionPane.showMessageDialog(null,"Otro 5 pls profe");
        JOptionPane.showMessageDialog(null,"Conozca el area y perimetro de su rectangulo");
        base=Float.parseFloat(JOptionPane.showInputDialog("Diga su base"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("Diga su altura"));
        area=base*altura;
        perimetro=2*base+2*altura;
        JOptionPane.showMessageDialog(null,"El area de su rectangulo es de: "+area+" y el perimetro es de: "+perimetro);
        JOptionPane.showMessageDialog(null,"Convierta de °Centigrados a °Farenheit");
        centi=Float.parseFloat(JOptionPane.showInputDialog("Diga sus °Centigrados"));
        faren=(centi*(9/5f)+32);
        JOptionPane.showMessageDialog(null,centi+" °Centigrados son: "+faren+" °Farenheit");
    }
}
