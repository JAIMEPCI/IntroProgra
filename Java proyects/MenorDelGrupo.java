import javax.swing.JOptionPane;
public class MenorDelGrupo {
    public static void main(String[] args) {
        int rep,edad,edadm,pers;
        String nombre,menor;
        edadm=999999999;
        menor="e";
        pers=Integer.parseInt(JOptionPane.showInputDialog("Diga cuantas personas van a responder esta encuesta"));
        for(rep=1;rep<pers+1;rep++){
            nombre=(JOptionPane.showInputDialog("Diga su nombre"));
            edad=Integer.parseInt(JOptionPane.showInputDialog("Diga su edad"));
            while(edad<0){
                edad=Integer.parseInt(JOptionPane.showInputDialog("Diga su edad, (bien escrita)"));
            }
            if(edadm>edad){
                edadm=edad;
                menor=nombre;
            }
        }
        JOptionPane.showMessageDialog(null,"La persona de su grupo con menor edad es: "+menor);
    }
}