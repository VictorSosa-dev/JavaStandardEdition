package org.course;

public class Reto2 {

    public static void main(String[] args) {

        Programador programador = new Programador("Juan", (byte) 25, 1000, "Java");
        DBA dba = new DBA("Pedro", (byte) 30, 1500, "Oracle");

        System.out.println(programador);
        System.out.println(programador.getLenguaje());
        System.out.println(programador.getSalario());
        System.out.println(dba.toString());

    }
}
