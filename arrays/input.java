
import java.util.Arrays;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        //Q: Taking input in an array 

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + " ");
        // }

        //using for each loop 

        // for(int i : arr){// for every element in array ,print the element
        //     System.out.print( i  + " " );// here i represents element if the array
        // }


        // we can also use Arrays.toString()method 
        System.out.println(Arrays.toString(arr));

    }
}
