package org.course;

public class Switch {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("El valor de num es 1");
                break;
            case 2:
                System.out.println("El valor de num es 2");
                break;
            case 3:
                System.out.println("El valor de num es 3");
                break;
            default:
                System.out.println("El valor de num es diferente de 1, 2 y 3");
        }
    }
}
