

public class nthroot {
    
    public int nthRoot(int n, int m) {
        // code here
        int low = 1, high = m;

        while (low <= high) {
            int mid = (low + high) / 2;
            long power = (long) Math.pow(mid, n); 
            
            if (power == m)
                return mid; 
            else if (power < m)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; 
    }
}
