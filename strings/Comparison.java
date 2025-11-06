
public class Comparison {

    //check if same strings are being stored in same object or not
    // then after the innutability of strings
    public static void main(String[] args) {
        String a = "Aniket";
        String b = "Aniket";

        // == 
        System.out.println(a == b);//true

        //why because they point to the same object in the string pool 
        //to avoid this or to store different strings we can store in objects 
        // using new key word then it will stored in a new object each time 
        //outside the string pool 

        String c = new String("Aniket");
        String d = new String("Aniket");

        System.out.println(c == d);//false

        //because both strings are stored separately out side the string pool
        //if we want to check value , 
        //like if the value of two strings is same , in both cases we can use .equals methods

        System.out.println(c.equals(d));
        //true 
        //since both have a value of 'Aniket'

    }
}
