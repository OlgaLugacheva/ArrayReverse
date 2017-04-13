import java.util.Random;

/**
 * Created by Olga on 13.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        long range = 1000000L;
        Random r = new Random();

        long[] array = new long[10000000];
        long[] arrayReverse = new long[10000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (long) (r.nextDouble() * range);
        }

        for (int j = 1; j < array.length / 100000; j++) {
            System.out.print(array[j * 100000] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - i - 1];
        }

        System.out.println();
        System.out.println("Reversed array");

        for (int j = 1; j < array.length / 100000; j++) {
            System.out.print(arrayReverse[j * 100000 - 1] + ", ");
        }

    }


}
