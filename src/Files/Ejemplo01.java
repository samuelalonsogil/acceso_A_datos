package Files;

import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo01 {

    public static void main(String[] args) {
        String names[] = {"Samuel", "Yariana", "Martin", "Max"};
        FileWriter escribano = null;
        try {
            escribano = new FileWriter("Ejemplo01.txt");
            for (int i = 0; i < names.length; i++) escribano.write(names[i] + "\n");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            try {
                escribano.close();
            }catch (IOException ioe2){
                ioe2.printStackTrace();
            }
        }

    }
}
