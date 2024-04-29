public class Cat {
    //atributos de clase
    private String nombre;
    private int edad;

    //Metodo constructor
    public Cat (String name){
        this.edad = 1;
        this.nombre = name;
        System.out.println("And there... a cat was born, his name... mighty as himself.. he was " + this.nombre);
    }
    public void Growth(){
        this.edad++;
        System.out.println("And so "+ this.nombre +" grew fast... it already was " + this.edad + "years old");
    }


    public static void main(String[] args){
        Cat Random = new Cat("Nose");
        Cat Mirri = new Cat("Mirringo");
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Mirri.Growth();
        Random.Growth();
    }
}

