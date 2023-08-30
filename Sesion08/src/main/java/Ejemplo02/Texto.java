package Ejemplo02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Texto {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/resources/temp/cursos/archivo.txt"));

        bw.write("Hola mundo\n");
        bw.write("Hola mundo");
        bw.newLine();
        bw.write("Hola mundo");
        bw.close();

        BufferedReader br = new BufferedReader(new java.io.FileReader(System.getProperty("user.dir") + "/src/main/resources/temp/cursos/archivo.txt"));

        String linea = null;

        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }

    }
}
