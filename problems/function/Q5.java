public class Q5 {
    public static void main(String[] args) {
        boolean aNum = armstrongNumber(153);
        System.out.println(aNum);
    }
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int sum = 0;
       while (n > 0){
           int rem = n % 10;
            n = n / 10;
             sum = sum + rem *rem * rem;
       }
       return sum == original ;
    
    }
}