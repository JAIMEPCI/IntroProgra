import javax.swing.JOptionPane;
public class ReubicarNumero {
    public static void main(String[] args) {
        int[] n = new int[8];
        int rep,uno,dos,t,p;
        String rta;
        rta="Los datos reorganizados quedan: ";
        for(rep=0;rep<8;rep++){
            n[rep]=Integer.parseInt(JOptionPane.showInputDialog("Diga el dato#"+(rep+1)+" :"));
        }
        for(uno=0;uno<7;uno++){
            for(dos=uno+1;dos<8;dos++){
                if(n[uno]>n[dos]){
                    t= n[uno];
                    n[uno]=n[dos];
                    n[dos]=t;
                }
            }
        }
        for(p=0;p<8;p++){
            rta = rta+(n[p]+". ");
        }
        JOptionPane.showMessageDialog(null,rta);
    }
}