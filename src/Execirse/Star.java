package Execirse;

public class Star extends CelestialBody {
    private String name;
    private double mass;
    private double density;
    private double diameter;

    public Star(String name, double mass, double density, double diameter) {
        super(name, mass, density, diameter);
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public double getDiameter() {
        return diameter;
    }

    @Override
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }



    @Override
    public void attractionGravitational() {

    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                '}';
    }
}
