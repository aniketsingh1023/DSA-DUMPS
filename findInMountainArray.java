public class findInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,1};
        findInMountainArray obj = new findInMountainArray();
        System.out.println(obj.findInMountainArray(3, arr));
    }
    public int findInMountainArray(int target, int[] arr) {
        int peak = peakindexinmountainarray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
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
    public int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
