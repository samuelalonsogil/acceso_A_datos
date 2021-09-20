package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles01 {
    public static void main(String[] args) {


        try{
            FileReader lector = new FileReader("Ejemplo02.txt");
            BufferedReader lectorBufao = new BufferedReader(lector);
            String linea = "";


            while (linea != null) {
                linea = lectorBufao.readLine();
                System.out.println(linea);
            };

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
