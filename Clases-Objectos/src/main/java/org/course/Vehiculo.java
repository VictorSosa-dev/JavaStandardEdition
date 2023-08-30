package org.course;

public class Vehiculo {

    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    public void Rodar(){
        System.out.println("Rodando...");
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void setColocarLlantas(Llanta delanteraIzquierda, Llanta delanteraDerecha,Llanta traceraIzquierda, Llanta traseraDerecha
    ){
        this.llantas[0] = delanteraIzquierda;
        this.llantas[1] = delanteraDerecha;
        this.llantas[2] = traceraIzquierda;
        this.llantas[3] = traseraDerecha;
    }

    public void llenaTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanza() {
        if (combustible.getLitrosActuales() > 0) {
            for (Llanta llanta : llantas) {
                llanta.Rodar();
            }
            combustible.usa();
        } else {
            System.out.println("No hay combustible");
        }
    }
}
