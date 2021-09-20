package Files;

import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo02 {
    public static void main(String[] args) {
        String cadena = "Hola estamos en Acceso a datos";
        char letrasDeCadena[] = cadena.toCharArray();
        FileWriter escriba = null;

        try{
            escriba = new FileWriter("Ejemplo02.txt");
            for (int i = 0; i < cadena.length(); i++) escriba.write(letrasDeCadena[i]);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

        try{
            escriba.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
