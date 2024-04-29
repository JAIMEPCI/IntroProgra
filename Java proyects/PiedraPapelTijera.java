import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;

import javax.swing.*;

public class PiedraPapelTijera {
    public PiedraPapelTijera() {
        juego();
        JOptionPane.showMessageDialog(null,"Ganaste "+triunfos+" veces\nPerdiste " + perdidas + " veces\nEmpataste " + empataste + " veces");
    }
    private int aleatorio(int min,int max){
        return (int) Math.floor(Math.random()*(max - min + 1) + min);
    }
    private String eleccion(int jugada){
        String resultado="";
        if(jugada==1){
            resultado= "piedra o";
        }else if(jugada==2){
            resultado="papel H";
        }else if(jugada==3){
            resultado="tijera x";
        }else{
            resultado="nulo";
        }
        return resultado;
    }
    int jugador=0,pc=0,triunfos=0,empataste=0,perdidas=0;
    private void juego(){
        while (triunfos < 3 && perdidas < 3){
            pc=aleatorio(1,3);
            jugador=Integer.parseInt(JOptionPane.showInputDialog("Elije:\n1.Piedra\n2.Papel\n3.Tijeras"));
            JOptionPane.showMessageDialog(null,"Tu elijes: "+eleccion(jugador));
            JOptionPane.showMessageDialog(null,"PC elije " + eleccion(pc));
            if(pc==jugador){
                JOptionPane.showMessageDialog(null,"Empate");
                empataste=empataste+1;
            }else if((jugador==1 && pc==3)||(jugador==2 && pc==1)||(jugador==3 && pc==2)){
                JOptionPane.showMessageDialog(null,"Ganaste");
                triunfos=triunfos+1;
            }else{
                JOptionPane.showMessageDialog(null,"Perdiste");
                perdidas=perdidas+1;
            }
        }
    }

    public static void main(String[] args) {
        PiedraPapelTijera a = new PiedraPapelTijera();
    }
}
