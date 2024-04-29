import javax.swing.JOptionPane;
public class ArribaPromedio {
    public static void main(String[] args) {
        int[]num=new int[10];
        int suma=0,cant=0,prom=0,rep=0;
        for(rep=0;rep<10;rep++){
            num[rep]=Integer.parseInt(JOptionPane.showInputDialog("Diga el dato#"+(rep+1)));
            suma=suma+num[rep];
        }
        prom=suma/10;
        for(rep=0;rep<10;rep++){
            if(num[rep]>prom){
                cant=cant+1;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay "+cant+" datos por encima del promedio");
    }
}
//Creado por Jaime Olarte