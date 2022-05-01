import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase ExampleVector con los métodos de la clase
 */

public class ExampleVector {
    Scanner read = new Scanner(System.in);
    Vector<Integer> vector1 = new Vector();
    boolean bandera;

    /**
     * Método addToVector que permite agregar valores al vector de Integer, mientras la variable booleana bandera sea
     * diferente de true.
     *bandera toma su vaolor del método repeatedElement
     *
     */
    public void addToVector() {
        Vector<Integer> vector1 = this.vector1;
        try {
            do {
                vector1.add(read.nextInt());
                for (Integer vector : vector1
                ) {
                    System.out.print(vector + " ");
                }
                System.out.println("\n");


                bandera = repeatedElement(vector1);

            } while (bandera != true);
            System.out.println("there is a repeated element");
            System.exit(0);
        } catch (NumberFormatException | InputMismatchException e) {
            throw e;
        }
    }

    /**
     * Método que por de un doble ciclo for muestra arroja un valor Booleano de true en caso de que se encuentre un
     * elemento repetido y un valor Booleano de false en el caso contrario.
     * @param vector
     * @return
     */
    public boolean repeatedElement(Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = i + 1; j < vector.size(); j++) {
                if (vector.get(i) == vector.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
