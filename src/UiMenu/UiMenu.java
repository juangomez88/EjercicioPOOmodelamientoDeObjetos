package UiMenu;

import Execirse.IGravitationalAttraction;
import Execirse.PlanetSystem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UiMenu implements IGravitationalAttraction {
    Scanner sc = new Scanner(System.in);
    PlanetSystem pS = new PlanetSystem();
    DecimalFormat decimalFormat = new DecimalFormat("0.########################E0");

    public void showMenuPlanetarySystem() {
        int option;
        int option2;
        int option3;
        int option4;
        double massPlanet2;
        double massPlanet1;
        double distance1 = 0;
        double distance2= 0;
        double finalDistance = 0;
        double finalAttration = 0;

        do {
            pS.systemPlanet();
            System.out.println("1. Show planetary system");
            System.out.println("2. View planet date");
            System.out.println("3. calculate gravitational attraction");
            System.out.println("4. Exit");

            option = Integer.valueOf(sc.nextLine());

            switch (option) {
                case 1:
                    System.out.println("Name of the planets in the system: ");
                    pS.otherPlanet();
                    System.out.println("\n");
                    break;
                case 2:
                        try {
                            do {
                                System.out.println("Choose two planets");
                                System.out.println("1. Mercury");
                                System.out.println("2. Venus");
                                System.out.println("3. Earth");
                                System.out.println("4. Mars");
                                System.out.println("5. Jupiter");
                                System.out.println("6. Back to menu");

                                option2 = Integer.valueOf(sc.nextLine());

                                if(option2 >6 ) {
                                    System.out.println("Please, enter correct option");
                                }
                                else if (option2 == 6) {
                                    showMenuPlanetarySystem();

                                }else {
                                    System.out.println(pS.getPlanets().get(option2-1));

                                }

                                System.out.println("View planet data: ");

                            }while(option2 != 6);

                        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                            System.out.println("Capture Exception: " + e);
                        }

                    break;
                case 3:
                    try {
                        do {
                            System.out.println("Select two planets");

                            System.out.println("1. Mercury");
                            System.out.println("2. Venus");
                            System.out.println("3. Earth");
                            System.out.println("4. Mars");
                            System.out.println("5. Jupiter");
                            System.out.println("6. Back to menu");

                            System.out.println("Select planet 1:");
                            option3 = Integer.valueOf(sc.nextLine());
                            massPlanet1 = pS.getPlanets().get(option3-1).getMass() ;

                            System.out.println("Select planet 2:");
                            option4 = Integer.valueOf(sc.nextLine());

                            System.out.println("Planet 1 mass: "+massPlanet1);

                            massPlanet2 = pS.getPlanets().get(option4-1).getMass();
                            System.out.println("Plaet 2 mass: "+massPlanet2);

                            if (option3 > 6) {
                                showMenuPlanetarySystem();
                            }else {
                                distance1 = pS.getPlanets().get(option3-1).getDistance();
                                distance2 = pS.getPlanets().get(option4-1).getDistance();
                            }

                            if (distance1 > distance2) {
                                finalDistance = distance1 - distance2;
                            } else if (distance2 > distance2){
                                finalDistance = distance2 - distance1;
                            }
                            System.out.println("Distancia: " +Math.pow(finalDistance,2));
                            finalAttration = attraction(constantG*((massPlanet1*massPlanet2)/Math.pow(finalDistance,2)));

                            System.out.println("Gravitational attraction: "+ decimalFormat.format(finalAttration));

                        }while(option3 != 6);


                    }catch(NumberFormatException | IndexOutOfBoundsException e){
                        System.out.println("Capture exception: " + e);
                    }



                    break;
                case 4:
                    System.out.println("...exit...");
                    break;
                default:
                    System.out.println("Please, enter a correct option");
            }

        }while(option != 4);

    }

}
