package problems.function;
public class Q1 {
//Q: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int max = Max(a, b, c);
        System.out.println(max);

        int min = Min(a, b, c);
        System.out.println(min);
    }
//smarter approach
    static int Max(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
       
        return max;
    }
        static int Min(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
       
        return min;
    }
}

//another approach using if else instead of math.max,math.min



// import java.util.Scanner;
 
// /*
//  * Java Program to find largest and smallest of three numbers
//  */
// public class Q1 {
 
//     public static void main(String args[]) {
 
//         // creating scanner to accept radius of circle
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Welcome in Java program to find largest  and smallest of three numbers");
 
//         System.out.println("Please enter first number :");
//         int first = scanner.nextInt();
 
//         System.out.println("Please enter second number :");
//         int second = scanner.nextInt();
 
//         System.out.println("Please enter third number :");
//         int third = scanner.nextInt();
 
//         int largest = largest(first, second, third);
//         int smallest = smallest(first, second, third);
 
//         System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
//                                    first, second, third, largest);
//         System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", 
//                                first, second, third, smallest);
 
//         scanner.close();
//     }
 
//     /**
//      * Java method to calculate largest of three numbers
//      *
//      * @param first
//      * @param second
//      * @param third
//      * @return maximum or largest of three
//      */
//     public static int largest(int first, int second, int third) {
//         int max = first;
//         if (second > max) {
//             max = second;
//         }
 
//         if (third > max) {
//             max = third;
//         }
 
//         return max;
//     }
 
//     /**
//      * Java method to calculate smallest of three numbers
//      *
//      * @param first
//      * @param second
//      * @param third
//      * @return minimum or smallest of three
//      */
//     public static int smallest(int first, int second, int third) {
//         int min = first;
//         if (second < min) {
//             min = second;
//         }
 
//         if (third < min) {
//             min = third;
//         }
 
//         return min;
//     }
// }
