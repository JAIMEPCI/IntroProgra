import java.util.Random;
import javax.swing.JOptionPane;
public class EvaluacionMatematicas {
    public static void main(String[] args) {
        int rep,rep2,bien,mult;
        float n,respuesta;
        String tablas;
        JOptionPane.showMessageDialog(null,"Tablas de multiplicar hasta el 10 de su número");
        n=Float.parseFloat(JOptionPane.showInputDialog("Diga su número"));
        tablas="la tabla de multiplicar de "+n+"\n";
        bien=0;
        for (rep=1;rep<11;rep++){
            tablas=tablas+n+" x "+rep+" = "+rep*n+"\n";
        }
        Random random=new Random();
        JOptionPane.showMessageDialog(null,tablas);
        for(rep2=0;rep2<5;rep2++){
            mult=random.nextInt(10);
            respuesta=Float.parseFloat(JOptionPane.showInputDialog("Cuanto es "+n+" x "+mult));
            if(respuesta==n*mult){
                JOptionPane.showMessageDialog(null,"Correcto!");
                bien=bien+1;
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrecto!");
            }
        }
    }
}
