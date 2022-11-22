import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        int min=1;
        int max=100;
        System.out.println("Generating 6 random numbers");

        Random rd = new Random(); // creating Random object
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (!(Arrays.asList(arr).contains(rd.nextInt(max-min) +min))){
                arr[i] = rd.nextInt(max-min) +min; // storing random integers in an array

            }
            System.out.println(arr[i]); // printing each array element
        }



    }
}
