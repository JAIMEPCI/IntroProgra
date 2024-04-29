import javax.swing.JOptionPane;
public class PromLitrosModa {
    public static void main(String[] args){
        int rep;
        float lit,mlit,promedio;
        JOptionPane.showMessageDialog(null,"Promedio de litros producidos y su mayor productor");
        promedio=0;
        mlit=0;
        for(rep=1;rep<51;rep++){
            lit=Float.parseFloat(JOptionPane.showInputDialog("Diga cuantos litros produjo su vaca #"+rep));
            promedio=promedio+lit;
            if(mlit<lit){
                mlit=lit;
            }
        }
        JOptionPane.showMessageDialog(null,"El promedio de los litros producidos es de "+(promedio/50)+" y la vaca mas productiva produjo "+mlit+" litros");
    }
}


