public class Usuario {
    public static void main(String[] args) {
        Sangre u1 = new Sangre("Ana",2,"ab","+");
        Sangre u2 = new Sangre("Anis",10,"O","+");
        Sangre u3 = new Sangre("Ano",890,"O","-");
        if(u3.getGrupo().equalsIgnoreCase(u2.getGrupo()) && u3.getRh().equalsIgnoreCase(u2.getRh())){
            System.out.println(u2.getNombre()+" es donante para "+ u3.getNombre());
        }else{
            System.out.println(u2.getNombre()+" NO es donante para "+ u3.getNombre());
        }
        if(u3.getGrupo().equalsIgnoreCase(u1.getGrupo()) && u3.getRh().equalsIgnoreCase(u1.getRh())){
            System.out.println(u1.getNombre()+" Es donante para "+ u3.getNombre());
        }else{
            System.out.println(u1.getNombre()+" NO es donante para "+ u3.getNombre());
        }
    }
}
