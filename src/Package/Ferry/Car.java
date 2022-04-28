package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Representa la clase Car con sus parametros representativos
 */

public class Car extends Vehicle{

    private int numberOfDoors;
    private String brand;
    private double weight;
    private int numberOfPassengers;
    private double weightCargo;

    public double getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }

    Scanner sc = new Scanner(System.in);

    static ArrayList<Car> car = new ArrayList<>();

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public Car() {
        super();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Crea una instancia de la clase Car
     * @param numberOfWheels
     * @param numberOfPassengers
     * @param scrolling
     * @param numberOfDoors
     * @param brand
     * @param weight
     */
    public Car(int numberOfWheels, int numberOfPassengers,  String scrolling, int numberOfDoors, String brand, double weight) {
        super(numberOfWheels, numberOfPassengers, scrolling);
        this.numberOfDoors = numberOfDoors;
        this.brand = brand;
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void enterCar() {
        System.out.println("\n\n");

        System.out.println("Enter brand of Vehicle: ");
        brand = sc.nextLine();

        System.out.println("Enter number of doors: ");
        numberOfDoors = Integer.valueOf(sc.nextLine());

        System.out.println("Enter number of passengers: ");
        numberOfPassengers = Integer.valueOf(sc.nextLine());

        System.out.println("Enter vehicle weight: ");
        weight = Double.valueOf(sc.nextLine());

        car.add(new Car(4,numberOfPassengers, "land", numberOfDoors,brand,weight));

    }

    /**
     * Metodo que recorre el Arraylist car por medio un foreach
     */

    public  void viewCars() {
        car.forEach((p)->{
            System.out.println("Type of vehicle: Car");
            System.out.println("Brand: "+p.getBrand());
            System.out.println("Number of doors: "+p.numberOfDoors);
            System.out.println("Weight: "+p.weight+". kg");
            System.out.println("Number of passengers: "+p.numberOfPassengers);
            System.out.println("\n");
            weightCargo= p.weight;
        });
    }

    @Override
    public String toString() {
        return "Car: {" +
                "brand = '" + brand + '\''+
                ", numberOfDoors = " + numberOfDoors +
                ", weight = " + weight + " Kg" +
                ", numberOfPassengers = " + numberOfPassengers +
                '}';
    }
}
