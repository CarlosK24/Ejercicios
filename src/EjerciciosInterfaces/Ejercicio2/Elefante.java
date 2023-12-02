package EjerciciosInterfaces.Ejercicio2;

public class Elefante implements Alimentacion{
    private String descripcion;
    private int tamano;
    private boolean feed;

    public Elefante(String descripcion, int tamano) {
        this.descripcion = descripcion;
        this.tamano = tamano;
        this.feed=false;
    }

    @Override
    public String hasBeenFed(boolean feed) {
        this.feed=feed;
        return "El elefante "+descripcion+" ha sido alimentado con fruta "+tamano+" kg";
    }

    @Override
    public String feed() {
        this.feed=true;
        if (feed){
            return "El elefante Ya ha sido alimentado";
        }else{
            return "Alimentando elefante";
        }

    }
}
