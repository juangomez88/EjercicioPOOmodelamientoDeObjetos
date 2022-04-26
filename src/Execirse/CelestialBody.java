package Execirse;

public abstract class CelestialBody {
    protected String name;
    protected double mass;
    protected double density;
    protected double diameter;
    protected double distanceOfSun;

    public CelestialBody() {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.name = name;
    }

    public CelestialBody(String name, double mass, double density, double diameter, double distance) {
    }

    public CelestialBody(String name, double mass, double density, double diameter) {
    }

    public abstract void attractionGravitational ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceOfSun() {
        return distanceOfSun;
    }

    public void setDistanceOfSun(double distanceOfSun) {
        this.distanceOfSun = distanceOfSun;
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", distanceOfSun=" + distanceOfSun +
                '}';
    }
}
