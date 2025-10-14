public class recursiveBS{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,55,67,89};
        int target = 67;
        int ans = recursion(arr, target,0,arr.length - 1);
        System.out.println(ans);
    }
    static int recursion(int[] arr, int target , int s,int e){
    
        if (s>e){
            return -1;
        }
            int m = s+ (e - s) / 2;
            if(arr[m] == target){
                return m;
            }
            if(arr[m] > target){
                return recursion(arr, target, s, m-1);
            }
             return recursion(arr, target, m+1, e);
            
    }
}