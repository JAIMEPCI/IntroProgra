import javax.swing.JOptionPane;
public class PromedioNotasAprobadas {
    public static void main(String[] args){
        int n1,n2,n3,notasa,promedio;
        JOptionPane.showMessageDialog(null,"Promedio de 3 notas que aprobaron");
        n1=Integer.parseInt(JOptionPane.showInputDialog("Diga su primera nota"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Diga su segunda nota"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Diga su tercera nota"));
        notasa=0;
        promedio=0;
        if(n1>30 && n2>30 && n3>30){
            JOptionPane.showMessageDialog(null,"Nadie pasó el examen y no hay promedio");
        }
        else{
            if(n1<=30){
                notasa=notasa+n1;
                promedio=promedio+1;
            }
            if(n2<=30){
                notasa=notasa+n2;
                promedio=promedio+1;
            }
            if(n3<=30){
                notasa=notasa+n3;
                promedio=promedio+1;
            }
            JOptionPane.showMessageDialog(null,"El promedio de las notas aprobadas es de: "+(notasa/promedio));
        }
    }
}
