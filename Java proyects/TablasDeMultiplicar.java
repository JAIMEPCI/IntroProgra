import javax.swing.JOptionPane;
public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int n,rep,resultado,prueba;
        String tablas;
        JOptionPane.showMessageDialog(null,"Tablas de multiplicar hasta el 20 de su número");
        n=Integer.parseInt(JOptionPane.showInputDialog("Diga su número entero"));
        tablas="la tabla de multiplicar de "+n+"\n";
        for (rep=1;rep<21;rep++){
            resultado=rep*n;
            tablas=tablas+n+" x "+rep+" = "+resultado+"\n";
        }
        JOptionPane.showMessageDialog(null,tablas);
        prueba=Integer.parseInt(JOptionPane.showInputDialog("Cuanto es "+n+" x "+"5"));
        if(prueba==n*5){
            JOptionPane.showMessageDialog(null,"Correcto! Pasaste la prueba");
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrecto! Estudia más, no seas vago");
        }
    }
}
//creado por Jaime Olarte y Oscar Vergara