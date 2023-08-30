package Reto1;

public class Main {

    public static void main(String[] args) {
        Figura figura;

        //figura.FormulaCalcularArea();
        figura = new Triangulo();
        figura.FormulaCalcularArea();
        figura = new Cuadrado();
        figura.FormulaCalcularArea();
        figura = new Rectangulo();
        figura.FormulaCalcularArea();


    }
}
