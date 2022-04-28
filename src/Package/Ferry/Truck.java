package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Representa la clase Truck con sus parametros representativos
 */

public class Truck extends Vehicle{

    Scanner sc = new Scanner(System.in);
    private String brand;
    private double weight;
    private double weightCargo;

    public double getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    static ArrayList<Truck> trucks = new ArrayList<>();

    /**
     * Crea una instancia de la clase truck
     * @param numberOfWheels
     * @param numberOfCrew
     * @param scrolling
     * @param brand
     * @param weight
     */

    public Truck(int numberOfWheels,  int numberOfCrew, String scrolling, String brand, double weight) {
        super(numberOfWheels, numberOfCrew, scrolling);
        this.brand = brand;
        this.weight = weight;
    }

    public Truck() {

    }

    public void enterTruck() {
        System.out.println("\n\n");

        System.out.println("Enter brand of Vehicle: ");
        brand = sc.nextLine();

        System.out.println("");

        System.out.println("Enter vehicle weight: ");
        weight = Double.valueOf(sc.nextLine());

        trucks.add(new Truck(4, 2,"land",brand,weight));
    }


    /**
     * Metodo que recorre el Arraylist trucks por medio un foreach
     */
    public void viewTrucks() {
        trucks.forEach((p)->{
            System.out.println("Type of vehicle: Truck");
            System.out.println("Brand of truck: "+p.getBrand());
            System.out.println("Weight of truck: "+p.weight+" .kg");
            System.out.println("\n");
            weightCargo = p.weight;
        });
    }
}
