
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();
        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round Fruit");

        //         break;
        //     case "Grapes":
        //         System.out.println("Juicy Small Fruit ");
        //         break;
        //     default:
        //         System.out.println("please enter a valid fruit");
        // }
        //enhanced switch case
        //         switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("Round Fruit");
        //     case "Grapes" -> System.out.println("Juicy Small Fruit ");
        //     default -> System.out.println("please enter a valid fruit");
        // }


        //Days of the week 
        // int day = in.nextInt();

        // switch (day) {

        //     case 1 ->
        //         System.out.println("Monday");
        //     case 2 ->
        //         System.out.println("Tuesday");
        //     case 3 ->
        //         System.out.println("Wednesday");
        //     case 4 ->
        //         System.out.println("Thursday");
        //     case 5 ->
        //         System.out.println("Friday");
        //     case 6 ->
        //         System.out.println("Saturday");
        //     case 7 ->
        //         System.out.println("Sunday");


        // }



        //SOMETIMES ITS NECCESARY TO NOT PUT BREAK ;-
        //LIKE IN A CASE WHERE SUPPOSE IF WE WANT IF ANY ENTERS ANYTHING UPTO 1-5 -WEEKDAY
        // AND IF HE ENTERS 6 OR 7 WE WANT TO WE WANT WEEKEND TO BE PRINTED 



        //NESTED SWITCH CASE 
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1: 
                System.out.println("Aniket");
                break ;
            case 2:
                System.out.println("Tanisha");
                break;
            case 3:
            System.out.println("employee number 3");
                switch (department){
                    case "IT":

                    System.out.println("IT Department");
                    break;
                    case "Management":
                    System.out.println("Management Department");
                    break;
                    default:
                    System.out.println("No Department entered");



                }
                break;
                default:
System.out.println("ID NoT FOund");

        }

    }
}
