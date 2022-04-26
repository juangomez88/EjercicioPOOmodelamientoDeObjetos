import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        RandomNumber nR = new RandomNumber();
        Burbuja bR = new Burbuja();
        QuickSort qS = new QuickSort();

        double[] arreglo = new double[5];

        int opcion;

        do {
            System.out.println("1. Generar arreglo: ");
            System.out.println("2. Ordenar por algoritmo Burbuja");
            System.out.println("3. Ordenar por algoritmo QuickSort");
            System.out.println("4. Salir");

            opcion = read.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Generando arreglo: \n");
                    nR.createNumbers();

                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Algoritmo Burbuja: \n");
                    Burbuja.burbuja(nR.numberArray);
                    for (int i = 0; i < nR.numberArray.length ; i++) {
                        System.out.println(nR.numberArray[i]);
                    }
                    System.out.println("\n");

                    break;
                case 3:
                    System.out.println("Algoritmo QuickSort: \n");
                    qS.ordenarQuicksort(nR.numberArray);
                    for (int i = 0; i < nR.numberArray.length; i++) {
                        System.out.println(nR.numberArray[i]);
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("...saliendo...\n");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }while (opcion !=4);
        System.out.println("Seleccione la opcion que a realizar: ");



    }
}
