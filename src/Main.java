import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Sinonimos sinonimos = new Sinonimos();

        boolean salir = false;
        int opcion = 0;
        boolean error = false;

        System.out.println("-------SINONIMOS-------");
        sinonimos.mostrarSinonimos();
        System.out.println(" ");

        while(!salir){


            try{

                System.out.println("-------MENU-------");
                System.out.println(" 1. Buscar todos los sinonimos.");
                System.out.println(" 2. Obtener solo un sinonimo.");
                System.out.println(" 3. Finalizar programa.");
                System.out.println("Introduce una opcion");

                opcion = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("AVISO: Debes introducir un numero");
                sc.nextLine();
            }


            switch(opcion){

                case 1:
                    sc.nextLine(); //limpiar el intro
                    String palabra;
                    System.out.print("Introduce una palabra: ");
                    palabra = sc.nextLine();
                    sinonimos.buscarSinonimos(palabra);
                    break;

                case 2:
                    sc.nextLine(); //limpiar el intro
                    String aleatorio;
                    System.out.print("Introduce una palabra: ");
                    aleatorio = sc.nextLine();
                    sinonimos.obtenerSinonimoAleatorio(aleatorio);
                    break;

                case 3:
                    salir = true;
                    System.out.println("Has salido del programa.");
                    break;

                default:
                    System.out.println("AVISO: Debes seleccionar una opcion entre 1 y 3.");
                    break;
            }
        }


    }

}
