package org.course;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private byte edad;

    private final LocalDate fechaNacimiento;

    public Persona(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = calcularFechaNacimiento(edad);
    }

    private LocalDate calcularFechaNacimiento(byte edad) {
        return LocalDate.now().minusYears(edad);
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return  "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
