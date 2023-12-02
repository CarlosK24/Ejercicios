package EjerciciosInterfaces.Ejercicio2;

public class Jaguar implements Alimentacion{
    private String comida;
    private boolean comido;
        private boolean feed;
    public Jaguar(String comida) {
        this.comida = comida;
        this.comido = false;

    }

    @Override
    public String hasBeenFed(boolean feed) {
        this.feed=feed;
        return "El Jaguar ha sido alimentado con "+comida;
    }

    @Override
    public String feed() {
        if (this.feed) {
            return "Ya ha sido alimentado";
        } else {
            this.feed=true;
        return "Alimentando...";
      }
    }
}
