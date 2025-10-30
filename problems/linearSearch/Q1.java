package problems.linearSearch;

public class Q1 {
    public static void main(String[] args) {
       int [] nums = {12,345,2,6,7896};
       System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

           
            while (temp > 0) {
                temp /= 10; 
                digits++;
            }

           
            if (digits % 2 == 0) {
                count++;
            }
        }
        
        return count;
    
}
}
