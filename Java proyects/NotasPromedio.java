import javax.swing.JOptionPane;
public class NotasPromedio {
    public static void main(String[] args) {
        int nota, sumaa,sumare, rep,apro,repro,mejor;
        JOptionPane.showMessageDialog(null, "Promedio de 5 notas");
        rep=1;
        apro=0;
        repro=0;
        sumaa=0;
        sumare=0;
        mejor=0;
        while(rep<6){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Diga su nota, estudiante #"+rep));
            while(nota<0 || nota>50){
                nota=Integer.parseInt(JOptionPane.showInputDialog("Diga su nota (del 0 al 50), estudiante #"+rep));
            }
            if(nota>29){
                apro=apro+1;
                sumaa=sumaa+nota;
            }
            else{
                repro=repro+1;
                sumare=sumare+nota;
            }
            if(mejor<nota){
                mejor=rep;
            }
            rep=rep+1;
        }
        if(repro==0){
            repro=1;
        }
        if(apro==0){
            apro=1;
        }
        JOptionPane.showMessageDialog(null,"El promedio de las notas aprobadas es de: "+sumaa/apro+"\n El promedio de las notas reprobadas es de: "+sumare/repro+"\n El estudiante con mejor nota fue el #"+mejor);
    }
}