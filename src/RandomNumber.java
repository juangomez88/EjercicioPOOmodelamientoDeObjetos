import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumber {

    double[] numberArray = new double[5];
    DecimalFormat format1 = new DecimalFormat("#.000");
    Random randomNumber = new Random();

    public double[] createNumbers() {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (randomNumber.nextDouble(100));
            System.out.println(numberArray[i]);
        }
        return new double[0];
    }
}
