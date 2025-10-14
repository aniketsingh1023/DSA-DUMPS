public class ceilingofanumber {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,76,80};
        int target = 82;
        int ans = ceiling(arr,target);
        if ( ans > arr.length-1){
            System.out.println("ceiling for a input is not present in the array");
        }else{
            System.out.println(ans);
        }
        
        

    }
    static int ceiling(int [] arr ,int target){
        int start = 0 ;
        int end = arr.length - 1 ;
        while (start <= end){
            int mid = start + (end - start)/2 ;

            if(target < arr[mid]){
                end = mid - 1 ;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
               return mid;
            }


        }
        return start;
     

    }
    
}
