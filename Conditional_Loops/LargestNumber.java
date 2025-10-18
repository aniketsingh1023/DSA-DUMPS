import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
    
        // Find The Largest Of the three numbers
        int max = a ;
        if (b > max){
            max = b;
        }
         if(c > max){
            max = c ;
        }
        System.out.println(max);


        //or we can use Math.max

        int maximum = Math.max(Math.max(a,b),c);

        System.out.println(maximum);

    }
}
