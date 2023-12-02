package EjerciciosInterfaces.Ejercicio2;

public class MainInterface {

    public static void main(String[] args) {
        Jaguar jaguar=new Jaguar("Carne");
        System.out.println(jaguar.feed());
        System.out.println(jaguar.feed());
        System.out.println(jaguar.hasBeenFed(false));
        System.out.println(jaguar.feed());

    }
}
