import javax.swing.JOptionPane;
public class Descuento_productos {
    public static void main(String[] args){
        int factura,cant;
        factura=Integer.parseInt(JOptionPane.showInputDialog("Diga el valor de su factura"));
        while(factura<=0){
            factura=Integer.parseInt(JOptionPane.showInputDialog("Diga el valor de su factura, (bien escrita)"));
        }
        cant=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de productos comprados"));
        while(cant<=0){
            cant=Integer.parseInt(JOptionPane.showInputDialog("Diga la cantidad de productos comprados, (bien escrita)"));
        }



        if (factura>40000 || cant>=3) {
            if (factura > 100000 || cant >= 5) {
                factura = (factura * 90) / 100;
                if (factura > 100000) {
                    JOptionPane.showMessageDialog(null, "Tienes descuento de 10% por tu factura mayor a 100000");
                } else {
                    JOptionPane.showMessageDialog(null, "Tienes descuento de 10% por tu cantidad de productos es mayor a 5");
                }
            } else {
                factura = (factura * 95) / 100;
                if (factura > 40000) {
                    JOptionPane.showMessageDialog(null, "Tienes descuento de 5% por tu factura mayor a 40000 ");
                } else {
                    JOptionPane.showMessageDialog(null, "Tienes descuento de 5% por tu cantidad de productos es mayor a 3");
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Tienes que pagar "+factura);
        JOptionPane.showMessageDialog(null,"");
        cant=Integer.parseInt(JOptionPane.showInputDialog(""));
    }
}
