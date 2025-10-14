public class peakindexinmountainarray {
    public static void main(String[] args) {
        int [] arr = {0,1,3,4,5,6,5,4,3,2,1,0};
        peakindexinmountainarray obj = new peakindexinmountainarray();
        System.out.println(obj.peakindexinmountainarray(arr));
    }
    public int peakindexinmountainarray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    }
