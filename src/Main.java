import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Programa del taller # 4, clase vector
 * Método Main que muestra el menu del punto 6 del taller # 4
 */

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ExampleVector examp1 = new ExampleVector();

        Character option;


        do {
            System.out.println("Seleccione la opcion a realizar: ");
            System.out.println("a. Ingresar datos al vector");
            System.out.println("b. Salir");

            option = Character.valueOf(read.next().charAt(0));

            switch (option){
                case 'a':
                    examp1.addToVector();
                    break;
                case 'b':
                    System.out.println("..saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(option != 'b');
    }
}
