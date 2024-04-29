import javax.swing.JOptionPane;
public class AhorroJava {
    public static void main(String[] args){
        int ahorro=0,menu=0,reduccion=0,aumento=0;
        while(menu!=4){
            menu = Integer.parseInt(JOptionPane.showInputDialog("""
                    Bienvenido al menu, seleccione una opción:
                    1. Incrementar el ahorro (se acepta desde 100 pesos)
                    2. Reducir el ahorro (máximo la mitad de lo ahorrado)
                    3. Consultar el ahorro
                    4. Terminar el programa"""));
            switch (menu){
                case 1:
                    aumento=Integer.parseInt(JOptionPane.showInputDialog("Diga en cuanto quiere incrementar el ahorro:"));
                    while(aumento<100){
                        aumento=Integer.parseInt(JOptionPane.showInputDialog("Diga en cuanto quiere incrementar el ahorro, recuerde tiene queser mayor a 100*"));
                    }
                    ahorro=ahorro+aumento;
                    break;

                case 2:
                    if(ahorro==0){
                        JOptionPane.showMessageDialog(null,"Sus ahorros son de 0 no puede quitarse nada -.-");
                    } else{
                        reduccion=Integer.parseInt(JOptionPane.showInputDialog("Diga en cuando quiere reducir el ahorro:"));
                        while(reduccion>=(ahorro/2)||reduccion<0){
                            reduccion=Integer.parseInt(JOptionPane.showInputDialog("Diga en cuando quiere reducir el ahorro, recuerde que solo puede reducir máximo la mitad de lo ahorrado"));
                        }
                        ahorro=ahorro-reduccion;
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"Sus ahorros son de "+ahorro);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar esta app");
            }
        }
    }
}
