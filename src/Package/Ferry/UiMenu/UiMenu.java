package Package.Ferry.UiMenu;

import Package.Ferry.Ferry;
import Package.Ferry.VehiclesMenu;

import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Clase que representa el menú principal de la aplicación
 */

public class UiMenu {

    VehiclesMenu menu = new VehiclesMenu();
    Ferry ferry = new Ferry();
    Scanner sc = new Scanner(System.in);
    int option;

    public void viewMenu() {
        try {
            do {
                System.out.println("Select a option");
                System.out.println("1. Enter a Vehicle");
                System.out.println("2. View  ferry status");
                System.out.println("3. Exit");

                option = Integer.valueOf(sc.nextLine());

                switch (option) {
                    case 1:
                        menu.vehicleMenu();
                        break;
                    case 2:
                        ferry.statusFerry();
                        break;
                    case 3:
                        System.out.println("...Leaving...");
                        break;
                    default:
                        System.out.println("Please enter correct option");
                }
            } while (option != 3);
            /**
             * @Exception NumberFormatException
             */

        } catch (NumberFormatException e) {
            System.out.println("Capture exception " + e);
        }

    }
}
