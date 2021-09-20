package Files;

/*1 Realizar un programa Java que pida el nombre de un directorio. El programa deberá listar sus
ficheros y después eliminar el directorio y los ficheros contenidos en él.*/

import java.io.File;
import java.util.Scanner;

public class AskForADirectoryAndList {
    static Scanner sc = new Scanner(System.in);

    public static String ask(){
        String ruta = "";
        System.out.println("Introduce el nombre del directorio");
        return ruta = sc.next();
    }

    public static String listOfFiles(String ruta){
        File file = new File(ruta);
        String [] files = file.list();
        String list = "";
        for (int i =0; i< files.length;i++) list+=(files[i]);
        return list;
    }

    public static void showList(String list){
        System.out.println(list);
    }

    public static void deleteFiles(File directoryToDelete){
        File[] allContents = directoryToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) deleteFiles(file);
        }
        directoryToDelete.delete();
    }


    public static void main(String[] args) {
        String ruta = ask();
        String list = listOfFiles(ruta);
        showList(list);
        deleteFiles(new File (ruta));

    }

}
