package problems.function;
public class Q2 {
    // Q: Write a function that returns the sum of first n natural numbers.
	public static void main(String[] args) {
                int n = 5;
        System.out.println(findSum(n));
    }
        static int findSum(int n){
        int sum = 0;
      // iterating over all the numbers 
      // between 1 to n
        for (int i= 1; i <= n; i++) 
        {
            sum = sum + i;
        }
        return sum;
    }
}
