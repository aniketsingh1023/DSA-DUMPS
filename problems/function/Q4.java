public class Q4{
    /*
    Q: Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
    */ 
    public static void main(String[] args) {
        boolean Prime = isPrime(9);
        System.out.println(Prime);
    }
        static boolean isPrime(int n) {
        // code here
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
            
        }
        return c*c > n ;
        
    }
}