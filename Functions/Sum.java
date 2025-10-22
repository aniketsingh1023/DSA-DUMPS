import java.util.Scanner;
public class Sum {
    public static void main (String [] args){
        sum();
    }
    //Q: Print a Sum of Two Numbers 

    static void sum (){
        Scanner in =  new Scanner (System.in);

        System.out.println("Enter Number 1 :");
        int num1 = in.nextInt();
        System.err.println("Enter Number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum );

    }


    /*
    ::::::SYNTAX::::::
     * 
     *  access modifier return_type name(){
     *   //body
     *  return Statement;
     *  }
     *  
     */
}
