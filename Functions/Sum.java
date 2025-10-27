import java.util.Scanner;

    /*
    ::::::SYNTAX::::::
     * 
     *  access modifier return_type name(arguments){
     *   //body
     *  return Statement;
     *  }
     *  
     */


public class Sum {
    public static void main (String [] args){
        // sum();
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(20,30);
         System.out.println(ans);
    }
    //Q: Print a Sum of Two Numbers 

//function with arguments
    static int sum3(int a , int b){
     int sum = a + b ;
     return sum;
    }

//return the value 
    static int sum2() {
        Scanner in =  new Scanner (System.in);

        System.out.println("Enter Number 1 :");
        int num1 = in.nextInt();
        System.err.println("Enter Number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum );
        return sum;
    }


    static void sum (){
        Scanner in =  new Scanner (System.in);

        System.out.println("Enter Number 1 :");
        int num1 = in.nextInt();
        System.err.println("Enter Number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum );

    }

}
