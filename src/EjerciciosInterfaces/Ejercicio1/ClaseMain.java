package EjerciciosInterfaces.Ejercicio1;

public class ClaseMain {

    static void imprimir(MedioTransportable transporte){
        System.out.println(transporte.Encender());
        System.out.println(transporte.Moverse());
        System.out.println(transporte.frenar());
        System.out.println(transporte.Parquear());
        System.out.println(transporte.Apagar());
        System.out.println(transporte);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        Taxi taxi1=new Taxi("versa","Azul",23241,4);
        Autobus autobus=new Autobus("5 señores","Carlos","verde","Sertexa",23);
        imprimir(taxi1);
        imprimir(autobus);
    }
}
