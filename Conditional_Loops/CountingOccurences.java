import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        // 1233344533
        //Q: Count the Number of Occurrences of three(3) in the Given Number 

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int rem ;
        int count = 0 ;
        while(num > 0 ){
          rem = num % 10;  
           if (rem == 3){
                count++;
        }
        num = num/10;
        }
       

        
        System.out.println(count);
        
    }
}
