import javax.swing.JOptionPane;
public class MenuRepaso {
    public static void main(String[] args) {
        int opc=-1;
        int num;
        do {
            opc = solicitaropcion();

            switch (opc){

                case 1: num = solicitarnumero();
                    primo(num);
                    break;
                case 2 :num = solicitarnumero();
                    factorial (num);
                    break ;
                case 3 :num = solicitarnumero();
                    par (num);
                    break;
                default :
                    opc = opcioninvalida();
            }
        }while (opc != 0);
        finprograma();

    }
    private static int solicitaropcion () {
        int dato = 0;
        dato=Integer.parseInt(JOptionPane.showInputDialog("""
Bienvenido al menu, seleccione una opción:
1. Averigue si su número es primo
2. Averigue el factorial de su número
3. Averigue si su número es par
0. Termine el programa
Su opción:"""));
        return dato;
    }
    private static int solicitarnumero () {
        int dato = 0;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Diga el número a analizar"));
        return dato;
    }
    private static void primo (int num) {
        int cont=0;
        for(int i=0;i<num+1;i++){
            if(i==0){
                cont=0;
            }
            else{
                if(num%i==0){
                    cont+=1;
                }
            }
        }
        if(cont==2){
            JOptionPane.showMessageDialog(null,"El numero " + num + " es primo");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero " + num + " NO es primo");
        }
    }
    private static void factorial (int num) {
        int rta=1;
        for (int i=1;i<num+1;i++){
            rta=rta*i;
        }
        JOptionPane.showMessageDialog(null,"El resultado de " + num + "! (factorial) es: " + rta);
    }
    private static void par (int num) {
        if(num%2==0){
            JOptionPane.showMessageDialog(null,"El número " + num + " es par");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número " + num + " NO es par");
        }
    }
    private static int opcioninvalida() {
        String rta;
        do{
            rta=JOptionPane.showInputDialog("Desea continuar o no, diga si o no.");
        }while(!rta.equalsIgnoreCase("si") && !rta.equalsIgnoreCase("no"));
        if(rta.equalsIgnoreCase("si")){
            return -1;
        }
        return 0;
    }
    private static void finprograma() {
        JOptionPane.showMessageDialog(null,"Gracias por usar este menú creado por JAIMEEEEEEEEEEEEEEEEEEEEE");
    }
}
//CREADO POR JAIME OLARTE