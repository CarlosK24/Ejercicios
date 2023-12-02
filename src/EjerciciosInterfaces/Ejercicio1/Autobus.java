package EjerciciosInterfaces.Ejercicio1;

public class Autobus implements MedioTransportable{
    private String ruta,chofer,color,sitio;
    private int pasajeros;

    public Autobus(String ruta, String chofer, String color, String sitio, int pasajeros) {
        this.ruta = ruta;
        this.chofer = chofer;
        this.color = color;
        this.sitio = sitio;
        this.pasajeros = pasajeros;
    }

    @Override
    public String Moverse() {
        return "Autobus moviendose";
    }

    @Override
    public String frenar() {
        return "Autobus frenando";
    }

    @Override
    public String Parquear() {
        return "Autobus paruqeandose";
    }

    @Override
    public String Encender() {
        return "El autobus se ha encendido";
    }

    @Override
    public String Apagar() {
        return "El autobus se ha apagado";
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "ruta='" + ruta + '\'' +
                ", chofer='" + chofer + '\'' +
                ", color='" + color + '\'' +
                ", sitio='" + sitio + '\'' +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
