package taller3.televisores;

public class Marca{
    private String nombre;

    public Marca(String nombre){
        this.setnombre(nombre);
    }

    public String getnombre(){
        return this.nombre;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
}