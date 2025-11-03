package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main (String [] args){
        int [][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
            
        };
        int target = 34;
        int [] result = search(arr, target); 
        //format of return value will be {row, col};
        System.out.println(Arrays.toString(result));
    }
// function of array type , which reutrns an array value 
    static int [] search(int[][] arr, int target ){
        for (int row = 0 ; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int [] {row,col}; // we are storing the answer there in a new array
                }
            }
        }
        return new int[] {-1,-1};//if the target is not found then we are returning the  a new array with elements as -1,-1
        //we cant just return -1 because of our function type 
    }
}


//similarly we can find the maximum and minimum value in 2d array using the same logic used in 1d array and using this modification
