import javax.swing.JOptionPane;
public class MultiplicarConSumas {
    public static void main(String[]args){
        int n1,resultado,n2,rep1,rep2,rep3;
        JOptionPane.showMessageDialog(null,"Multiplicación usando solo sumas y restas");
        n1=Integer.parseInt(JOptionPane.showInputDialog("Diga su primer número entero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Diga su segundo número entero"));
        resultado=0;
        if (n1>0) {
            for (rep1 = 0; rep1 < n1; rep1++) {
                resultado = resultado + n2;
            }
        }
        if (n1<0){
            for (rep2=0;rep2<n2;rep2++){
                resultado=resultado+n1;
            }
        }
        if(n2<0){
            for(rep3=0;rep3<-n1;rep3++){
                resultado=resultado-n2;
            }
        }
        if(n1==0||n2==0){
            resultado=0;
        }
        JOptionPane.showMessageDialog(null,"El resultado de "+n1+" x "+n2+" es: "+resultado);
    }
}

