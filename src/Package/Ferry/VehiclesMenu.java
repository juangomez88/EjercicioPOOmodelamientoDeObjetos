package Package.Ferry;

import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Clase que muestra el menu para las opciones con los vehiculos a ingresar al ferry
 */

public class VehiclesMenu {
    Scanner sc = new Scanner(System.in);

    Car car = new Car();
    Truck truck = new Truck();
    Bike bike = new Bike();
    Boat boat = new Boat();
    Bicycle bicycle = new Bicycle();


    private int option;
    private int count = 0;

    public void vehicleMenu() {

        try{
            do {
                System.out.println("Select vehicle type: ");

                System.out.println("1. Car");
                System.out.println("2. Truck");
                System.out.println("3. Bike");
                System.out.println("4. Boat");
                System.out.println("5. Bicycle");
                System.out.println("6. Return to main menu");

                option = Integer.valueOf(sc.nextLine());

                switch (option){
                    case 1:
                        if (count < 10) {
                            car.enterCar();
                            count++;
                        }else
                            System.out.println("Ferry full of vehicles, return to main menu\n");
                        break;
                    case 2:
                        if (count < 10) {
                            truck.enterTruck();
                            count++;
                        }else
                            System.out.println("Ferry full of vehicles, return to main menu\n");
                        break;
                    case 3:
                        if (count < 10) {
                            bike.enterBike();
                            count++;
                        }else
                            System.out.println("Ferry full of vehicles, return to main menu\n");
                        break;
                    case 4:
                        if (count < 10) {
                            boat.enterBoat();
                            count++;
                        }else
                            System.out.println("Ferry full of vehicles, return to main menu\n");
                        break;
                    case 5:
                        if (count < 10) {
                            bicycle.enterBicycle();
                            count++;
                        }else
                        System.out.println("Ferry full of vehicles, return to main menu\n");
                        break;
                    case 6:
                        System.out.println("returning \n");
                        break;
                    default:
                        System.out.println("Please, enter a correct option");
                }

            }while (option != 6);

            /**
             * @Exception NumberFormatException captura posibles errores
             */
        }catch (NumberFormatException e){
            System.out.println("Capture Exception: "+ e);
        }


    }
}
