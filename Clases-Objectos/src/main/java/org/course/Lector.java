package org.course;

import java.util.Scanner;

public class Lector {
    private Scanner sc = new Scanner(System.in);

    public void muestraMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String leeCadena() {
        return sc.nextLine();
    }
}

