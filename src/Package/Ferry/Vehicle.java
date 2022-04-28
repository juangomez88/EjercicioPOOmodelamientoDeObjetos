package Package.Ferry;

public abstract class Vehicle {
    private int numberOfWheels;
    private int numberOfPassengers;
    private int numberOfCrew;
    private double weight;

    public Vehicle(int numberOfWheels, int numberOfPassengers, String scrolling) {
    }

    public Vehicle() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private String scrolling;

    public Vehicle(int numberOfWheels, int numberOfPassengers, int numberOfCrew, String scrolling) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfCrew = numberOfCrew;
        this.weight = weight;
        this.scrolling = scrolling;
    }

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

    public String getScrolling() {
        return scrolling;
    }

    public void setScrolling(String scrolling) {
        this.scrolling = scrolling;
    }
}
