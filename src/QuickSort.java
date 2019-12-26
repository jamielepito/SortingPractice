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

        //find first, mid, and last elements
        int a = array[0];
        int b = array[array.length/2];
        int c = array[array.length-1];
        //testing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //Find the Median
        //median variables
        int pivot;
        int x = a-b; //(+ -> a>b) (- -> b>a)
        int y = b-c; //(+ -> b>c) (- -> c>b)
        int z = a-c; //(+ -> a>c) (- -> c>a)
        //compare variables
        if (x*y>0){
            pivot = b; //a>b & b>c
        }
        else if (x*z>0){
            pivot = c; //a>b & a>c & not b
        }
        else{ pivot = a;}
        System.out.println("The median of 3 is " + pivot);

    }
}
