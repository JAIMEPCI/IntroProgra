import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String[]args){
        int num,resultado,rep;
        JOptionPane.showMessageDialog(null,"Su número factorial");
        num=Integer.parseInt(JOptionPane.showInputDialog("Diga su número entero"));
        resultado=1;
        for (rep=1;rep<num+1;rep++){
            resultado=resultado*rep;
        }
        JOptionPane.showMessageDialog(null,"El resultado de "+num+" factorial es: "+resultado);
    }
}
    //public void imprimir(){
      //  System.out.println("Nombre:" + this.nombre + " Numero:" + this.numero + " Cupo:" + this.cupo + " Deuda:" + this.deuda);
    //}