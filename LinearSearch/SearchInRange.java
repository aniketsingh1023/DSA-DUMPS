package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 3, 9};
        int target = 3;
        int result = SearchIR(nums, target);
        System.out.println("Found at index: " + result);
    }
    static int SearchIR (int [] arr , int target ){
        if (arr == null || arr.length == 0 ){
            return -1;
        }
        for (int idx = 1; idx <= 4; idx++) {
            if (arr[idx] == target){
                return idx;
            }
        }
        return -1;
    }
    
}
