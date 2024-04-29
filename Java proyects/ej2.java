import javax.swing.JOptionPane;
public class ej2 {
    public static void main(String[] args) {
        int num,rep;
        String respuesta;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número entero"));
        respuesta="Los multiplos de "+num+" son:"+"\n";
        for(rep=1;rep<num+1;rep++){
            if(num%rep==0){
                respuesta=respuesta+rep+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,respuesta);
    }
}
