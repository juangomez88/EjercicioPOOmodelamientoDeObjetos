package Execirse;

import java.util.ArrayList;

public class Planet extends CelestialBody implements IGravitationalAttraction {
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distance;
    static ArrayList<Planet> planets = new ArrayList<>();

    public Planet(String name, double mass, double density, double diameter, double distance) {
        super(name, mass, density, diameter, distance);
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distance = distance;
    }

    public Planet() {

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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double attraction(double G) {
        return IGravitationalAttraction.super.attraction(G);
    }

    @Override
    public void attractionGravitational() {
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", distance=" + distance +
                '}';
    }


}
