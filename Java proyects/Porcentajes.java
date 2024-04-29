import javax.swing.JOptionPane;
public class Porcentajes {
    public static void main(String[] args) {
        int rep,nota,repr,apr;
        repr=0;
        apr=0;
        for(rep=1;rep<16;rep++) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Diga su nota #" + rep));
            while (nota < 0 || nota > 50) {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Diga su nota(del 1 al 50)"));
            }
            if (nota < 30) {
                repr = repr + 1;
            } else {
                apr=apr+1;
            }
        }
        JOptionPane.showMessageDialog(null,"El porcentaje de estudiantes que aprobaron es de: "+(apr*100)/15+"%"+ "\n El porcentaje de los estudiantes que reprobaron es de: "+(repr*100)/15+"%");
    }
}
