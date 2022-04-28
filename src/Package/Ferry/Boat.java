package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Representa la clase Bicycle con sus parametros representativos
 */

public class Boat extends Vehicle{

    Scanner sc = new Scanner(System.in);

    static ArrayList<Boat>boat = new ArrayList<>();

    private String engineBrand;
    private int numberOfPassengers;
    private int numberOfCrew;
    private double weight;
    private double weightCargo;

    public double getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }

    public static ArrayList<Boat> getBoat() {
        return boat;
    }

    public static void setBoat(ArrayList<Boat> boat) {
        Boat.boat = boat;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    @Override
    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Crea una instancia de la clase Bike
     * @param engineBrand
     * @param numberOfPassengers
     * @param numberOfCrew
     * @param weight
     * @param scrolling
     */

    public Boat(String engineBrand, int numberOfPassengers, int numberOfCrew, double weight , String scrolling) {
        super(numberOfPassengers, numberOfCrew, scrolling);
        this.engineBrand = engineBrand;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfCrew = numberOfCrew;
        this.weight = weight;
    }

    public Boat() {

    }

    public void enterBoat() {
        System.out.println("\n\n");

        System.out.println("Enter engine brand: ");
        engineBrand = sc.nextLine();

        System.out.println("Enter number of passengers: ");
        numberOfPassengers = Integer.valueOf(sc.nextLine());

        System.out.println("Enter number of crew: ");
        numberOfCrew = Integer.valueOf(sc.nextLine());

        System.out.println("Enter vehicle weight: ");
        weight = Double.valueOf(sc.nextLine());

        boat.add(new Boat(engineBrand, numberOfPassengers,numberOfCrew,weight,"water"));
    }

    /**
     * Metodo que recorre el Arraylist boat por medio un foreach
     */

    public void viewBoats() {
        boat.forEach((p)->{
            System.out.println("Type of vehicle: boat");
            System.out.println("Engine brand boat: "+p.engineBrand);
            System.out.println("Weight of boat: "+p.weight+" .kg");
            System.out.println("Number of boat passengers: "+p.numberOfPassengers);
            System.out.println("Number of crew: "+p.numberOfCrew);
            System.out.println("\n");
            weightCargo = p.weight;
        });
    }
}
