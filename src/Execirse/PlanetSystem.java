package Execirse;

import java.util.ArrayList;

public class PlanetSystem {

    private double mass1;
    private double mass2;
    private double distance;
    static private double GRAVITATIONALCONSTANT = 6.67428 * Math.pow(10, (-11));
    private static ArrayList<Planet> planets = new ArrayList<>();


    public double getMass1() {
        return mass1;
    }

    public void setMass1(double mass1) {
        this.mass1 = mass1;
    }

    public double getMass2() {
        return mass2;
    }

    public void setMass2(double mass2) {
        this.mass2 = mass2;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static double getGRAVITATIONALCONSTANT() {
        return GRAVITATIONALCONSTANT;
    }

    public static void setGRAVITATIONALCONSTANT(double GRAVITATIONALCONSTANT) {
        PlanetSystem.GRAVITATIONALCONSTANT = GRAVITATIONALCONSTANT;
    }

    public void systemPlanet() {
        planets.add(new Planet("Mercury", 330,5.43,4879.4,57910000));
        planets.add(new Planet("Venus",487 ,5.24,12104,108200000));
        planets.add(new Planet("Earth",597,5.51,12742,149600000));
        planets.add(new Planet("Mars",642,3.93,6779,227940000));
        planets.add(new Planet("Jupiter",1898,1.33,139820,778330000));
    }

    public void otherPlanet() {

        for (int i = 0; i < planets.size();i++){
            System.out.println(planets.get(i).getName());
        }

    }

    public  ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        PlanetSystem.planets = planets;
    }

    private static double attracttion(double mass1, double mass2, double distance) {
        double attractionForce = (GRAVITATIONALCONSTANT*(mass1*mass2)/distance);
        return attractionForce;
    }

    public Object showPlanet1(int position) {
        planets.get(position);
        return planets.get(position).getMass();
    }


}
