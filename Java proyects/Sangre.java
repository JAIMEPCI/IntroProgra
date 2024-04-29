public class Sangre {
    private String nombre;
    private int edad;
    private String grupo;
    private String Rh;

    public Sangre(String n,int e,String g,String Rh){
        this.edad=e;
        this.grupo=g;
        this.nombre=n;
        this.Rh=Rh;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getRh() {
        return Rh;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRh(String rh) {
        Rh = rh;
    }
}
