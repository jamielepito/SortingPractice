import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many numbers do you want?");
        int numWanted = scanner.nextInt();
        int array[] = new int[numWanted];

        //create list of random numbers
        for (int i = 0; i < numWanted; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
