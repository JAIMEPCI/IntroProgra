import javax.swing.JOptionPane;
public class ParteDeLaRecta {
    public static void main(String[] args){
        float m,b,x,y;
        JOptionPane.showMessageDialog(null,"Dada la fórmula de la recta vea si un punto es parte o no de la recta");
        m=Float.parseFloat(JOptionPane.showInputDialog("Diga cuanto vale m"));
        b=Float.parseFloat(JOptionPane.showInputDialog("Diga cuanto vale b"));
        x=Float.parseFloat(JOptionPane.showInputDialog("Diga cuanto vale x"));
        y=Float.parseFloat(JOptionPane.showInputDialog("Diga cuanto vale y"));
        if(y==m*x+b){
            JOptionPane.showMessageDialog(null,"El punto ("+x+","+y+") si hace parte de la recta");
        }
        else{
            JOptionPane.showMessageDialog(null,"El punto ("+x+","+y+") NO hace parte de la recta");
        }
    }
}
