package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles02 {

    public static void main(String[] args) {

        try{
            FileReader lector = new FileReader("Ejemplo02.txt");
            BufferedReader lectorBufao = new BufferedReader(lector);
            String linea = "";


            while (true) {
                linea = lectorBufao.readLine();
                    if (linea !=null) System.out.println(linea);
                    else break;
            }
            lector.close();
            lectorBufao.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
