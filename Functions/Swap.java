public class Swap {
    public  static void main(String[] args) {
        int a = 3;
        int b = 2;
        swap(a,b);
       System.out.println( a + " " + b);
    }
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will be only valid in tis function scope only
    }
}
//this is will not be swapped because we are changing the reference variable not the actual object 

// suppose if we change the actual object like in array and then refernce it then id will actually change 

// this is a proper dillemaa , Womp Womp 

// in java ins always call by value , we do not have any pointers



// import java.util.Arrays;

// public class ChangeValue{
//     public static void main(String[] args) {
//         // create an array
//         int[] arr = {1, 3, 2, 45, 6};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void change(int[] nums) {
//         nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
//     }
// }