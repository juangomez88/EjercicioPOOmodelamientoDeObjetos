package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;

public class Ferry {

    private int numberOfWheels;
    private int numberOfPassengers;
    private int numberOfCrew;
    private double weight;
    private String scrolling;
    private String brand;

    Bicycle bicycle = new Bicycle();
    Bike bike = new Bike();
    Boat boat = new Boat();
    Car car = new Car();
    Truck truck = new Truck();

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getScrolling() {
        return scrolling;
    }

    public void setScrolling(String scrolling) {
        this.scrolling = scrolling;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);



    public void statusFerry() {
    car.viewCars();
    truck.viewTrucks();
    bike.viewBikes();
    boat.viewBoats();
    bicycle.viewBicycle();
    }

    public void weightOfCargo() {
        System.out.println(car.getWeightCargo()+ truck.getWeightCargo()+bike.getWeightCargo()+ boat.getWeightCargo()+ bicycle.getWeightCargo());
    }

}
