package LinearSearch;

public class code {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.println(linearSearch(arr, target));
    }

    // search in the array : return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
                // return arr[i]; //--> return the target element
                // can return mutiple things like true of false also
            }

        }
        //target not found , does not exists in array
        return -1;
    }
}
