package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.0.0
 * @author Juan Carlos Gomez Jaramillo
 * Representa la clase Bike con sus parametros representativos
 */

public class Bike extends Vehicle{

    Scanner sc = new Scanner(System.in);
    private String brand;
    private double weight;
    private double inWeight;
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

    static ArrayList<Bike> bikes = new ArrayList<>();

    /**
     * Crea una instancia de la clase Bike
     * @param numberOfWheels
     * @param numberOfPassengers
     * @param scrolling
     * @param brand
     * @param weight
     */

    public Bike(int numberOfWheels, int numberOfPassengers, String scrolling, String brand, double weight) {
        super(numberOfWheels, numberOfPassengers, scrolling);
        this.brand = brand;
        this.weight = weight;

    }

    public Bike() {
        super();
    }

    public void enterBike() {
        System.out.println("\n\n");

        System.out.println("Enter brand of bike: ");
        brand = sc.nextLine();

        System.out.println("Enter vehicle weight: ");
        weight = Double.valueOf(sc.nextLine());

        bikes.add(new Bike(2, 1,"land", brand,weight));

    }

    /**
     * Metodo que recorre el Arraylist bikes por medio un foreach
     */

    public void viewBikes() {
        bikes.forEach((p)->{
            System.out.println("Type of vehicle: Bike");
            System.out.println("Bike brand: "+ p.getBrand());
            System.out.println("Bike weight: "+ p.weight );
            System.out.println("\n");
            inWeight = p.weight;
            weightCargo = inWeight + p.weight;
        });
    }

    @Override
    public String toString() {
        return "Bike{" +
                ", brand='" + brand + '\'' +
                ", weight=" + weight + ". kg" +
                ", bikes=" + bikes +
                '}';
    }
}
