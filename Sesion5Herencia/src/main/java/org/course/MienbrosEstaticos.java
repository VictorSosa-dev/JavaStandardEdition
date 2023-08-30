package org.course;

public class MienbrosEstaticos {

    private static short contadorClase = 0;
    private short contadorInstancia = 0;

    public MienbrosEstaticos() {
        contadorClase++;
        contadorInstancia++;
    }
    public static short getContadorClase() {
        return contadorClase;
    }

    public static void setContadorClase(short contadorClase) {
        MienbrosEstaticos.contadorClase = contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }

    public void setContadorInstancia() {
        this.contadorInstancia = contadorInstancia;
    }
}
