package Reto01;

import java.util.List;

public class Agenda implements Comparable<Agenda> {

    private final String nombre;
    private final List<String> telefonos;
    private int prioridad;

    public Agenda(String nombre, int prioridad, List<String> telefonos) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Agenda agenda) {
        return this.prioridad - agenda.prioridad;
    }

}
