package EjerciciosInterfaces.Ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Taxi implements  MedioTransportable{
private String modelo,color;
private int placa,pasajeros;
private Date hora;
private SimpleDateFormat horadefinida;

    public Taxi(String modelo, String color, int placa, int pasajeros) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.pasajeros = pasajeros;


    }

    @Override
    public String Moverse() {
        return "El "+this+" ha empezadoa moverse";
    }

    @Override
    public String frenar() {
        return "El taxi ha frenado";
    }

    @Override
    public String Parquear() {
        this.horadefinida= new SimpleDateFormat("hh");
        this.hora =new Date();
        hora.getTime();
        horadefinida.format(hora);
        String horacompuesta=horadefinida.toString();
        return "El "+this+" se parqueo a las "+horacompuesta;
    }

    @Override
    public String Encender() {
        return "El taxi se ah encendido";
    }

    @Override
    public String Apagar() {
        this.horadefinida = new SimpleDateFormat("dd yy hh");
        hora.getTime();
        horadefinida.format(hora);
        String horaCompuesta=horadefinida.toString();
        return "El taxi se apago el "+horaCompuesta;
    }

    @Override
    public String toString() {
        return "Taxi " +
                "modelo:" + modelo + '\'' +
                " color:" + color + '\'' +
                "con placa:" + placa +
                "con"+pasajeros+" pasajeros";
    }
}
