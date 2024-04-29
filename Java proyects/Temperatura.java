import javax.swing.JOptionPane;
public class Temperatura {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Algoritmo para comparar temperaturas de 2 días");
        int[] t1 = new int[24];
        int[] t2 = new int[24];
        int hora1, hora2, com;
        for (hora1 = 0; hora1 < 24; hora1++) {
            t1[hora1] = Integer.parseInt(JOptionPane.showInputDialog("Diga la temperatura del DIA 1, en la hora " + (hora1 + 1)));
        }
        for (hora2 = 0; hora2 < 24; hora2++) {
            t2[hora2] = Integer.parseInt(JOptionPane.showInputDialog("Diga la temperatura del DIA 2, en la hora " + (hora2 + 1)));
        }
        for(com=0;com<24;com++){
            if(t1[com]!=t2[com]){
                if(t1[com]-t2[com]>0){
                    JOptionPane.showMessageDialog(null,"En la hora "+(com + 1)+ " tuvo una diferencia de: "+ (t1[com] - t2[com]));
                }else{
                    JOptionPane.showMessageDialog(null,"En la hora "+(com + 1)+ " tuvo una diferencia de: "+ (t2[com] - t1[com]));
                }
            }else{
                JOptionPane.showMessageDialog(null,"En la hora "+(com+1)+" las temperaturas coincidieron");
            }
        }
    }
}
