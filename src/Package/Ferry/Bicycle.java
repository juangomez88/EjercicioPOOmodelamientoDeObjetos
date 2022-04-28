package Package.Ferry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * @version 1.0.0
 * Representa la clase Bicycle con sus parametros representativos
 */

public class Bicycle extends Vehicle{

    Scanner sc = new Scanner(System.in);

    static ArrayList<Bicycle> bicycles = new ArrayList<>();
    private String brandBicycle;
    private double weight;
    private double weightCargo = 0;
    private double inWeight = 0;

    public double getWeightCargo() {
        return weightCargo;
    }

    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }

    /**
     * Crea una instancia de la clase Bicycle
     * @param numberOfWheels numero de ruedas
     * @param brandBicycle marca de la bicicleta
     * @param scrolling medio por el cual se desplaza
     * @param weight peso de la bicileta
     */
    public Bicycle(int numberOfWheels, String brandBicycle , String scrolling, double weight) {
        super();
        this.brandBicycle = brandBicycle;
        this.weight = weight;
    }

    public Bicycle() {

    }

    /**
     * representa el memu para ingresar los datos de solicitados por teclado
     * @exception Exception capturada
     */

    public void enterBicycle() {
        System.out.println("\n\n");

        try{

            System.out.println("Enter brand of bicycle: ");
            brandBicycle = sc.nextLine();

            System.out.println("Enter vehicle weight: ");
            weight = Double.valueOf(sc.nextLine());

            bicycles.add(new Bicycle(2,brandBicycle, "land", weight));

        }catch(Exception e) {
            System.out.println("Exception capture "+ e);
        }

    }

    /**
     * Metodo que recorre el Arraylist bicycles por medio un foreach
     */

    public void viewBicycle() {
        bicycles.forEach((p)->{
            System.out.println("Type of vehicle: Bicycle");
            System.out.println("Brand of bicycle: "+ p.brandBicycle);
            System.out.println("Weight od bicycle: "+p.weight);
            System.out.println("\n");
            inWeight = p.weight;
            weightCargo = inWeight + p.weight;
        });
    }
}
