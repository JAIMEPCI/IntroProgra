// Creado, Elaborado y Ejecutado por Santiago Santafe y Jaime Olarte
import javax.swing.JOptionPane;
public class ej1 {
    public static void main(String[] args){
        int n=-1,menu=9,rep,rep1,fact=1,res=0;
            while(menu!=0){
                menu = Integer.parseInt(JOptionPane.showInputDialog("""
                        Bienvenido al menu, seleccione una opción
                        1. Numero a analizar
                        2.Dar el factorial del número
                        3.Informar si es de 3 dígitos el número
                        4.Resultado de la sumatoria del número"""));
                switch (menu){
                    case 1:
                        n=Integer.parseInt(JOptionPane.showInputDialog("Diga el número que quiere analizar"));
                        while(n<0){
                            n=Integer.parseInt(JOptionPane.showInputDialog("Diga el número que quiere analizar, asegurese que sea positivo"));
                        }
                        break;

                    case 2:
                        if(n==-1){
                            JOptionPane.showMessageDialog(null,"El número no se ha declarado, presione 1");
                        } else{
                            for(rep=1;rep<n+1;rep++){
                                fact=fact*rep;
                            }
                            JOptionPane.showMessageDialog(null,n+"! Es igual a "+fact);
                            fact=1;
                        }
                        break;

                    case 3:
                        if(n==-1){
                            JOptionPane.showMessageDialog(null,"El número no se ha declarado, presione 1");
                        } else{
                            if(n>99 && n<1000){
                                JOptionPane.showMessageDialog(null,"El número tiene exactamente 3 dígitos");
                            }else{
                                JOptionPane.showMessageDialog(null,"El número NO tiene exactamente 3 dígitos");
                            }
                        }
                        break;

                    case 4:
                        if(n==-1){
                            JOptionPane.showMessageDialog(null,"El número no se ha declarado, presione 1");
                        } else{
                            for(rep1=0;rep1<n;rep1++){
                                res= (int) (res+(8+(Math.pow(rep1,n))));
                            }
                            JOptionPane.showMessageDialog(null,"La sumatoria da "+res);
                            res=0;
                        }
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null,"Gracias por utilizar esta app");
                }
            }
    }
}


