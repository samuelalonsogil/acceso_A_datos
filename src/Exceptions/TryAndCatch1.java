package Exceptions;

public class TryAndCatch1 {
    public static void main(String[] args) {
        int numerador = 10, denominador = 0, cociente;
        try{
            cociente = numerador/denominador;
            System.out.println("Resultado =" + cociente);
        }catch (ArithmeticException ae){
            System.out.println("Error de ejecución");
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            ae.getStackTrace();
        }finally {
            System.out.println("Sentencias finally");
        }
        System.out.println("Fin del programa");
    }
}
